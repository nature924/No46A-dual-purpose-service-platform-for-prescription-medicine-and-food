
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 药食两用药材
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/yaoshiliangyongyaocai")
public class YaoshiliangyongyaocaiController {
    private static final Logger logger = LoggerFactory.getLogger(YaoshiliangyongyaocaiController.class);

    @Autowired
    private YaoshiliangyongyaocaiService yaoshiliangyongyaocaiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("yaoshiliangyongyaocaiDeleteStart",1);params.put("yaoshiliangyongyaocaiDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = yaoshiliangyongyaocaiService.queryPage(params);

        //字典表数据转换
        List<YaoshiliangyongyaocaiView> list =(List<YaoshiliangyongyaocaiView>)page.getList();
        for(YaoshiliangyongyaocaiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YaoshiliangyongyaocaiEntity yaoshiliangyongyaocai = yaoshiliangyongyaocaiService.selectById(id);
        if(yaoshiliangyongyaocai !=null){
            //entity转view
            YaoshiliangyongyaocaiView view = new YaoshiliangyongyaocaiView();
            BeanUtils.copyProperties( yaoshiliangyongyaocai , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YaoshiliangyongyaocaiEntity yaoshiliangyongyaocai, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yaoshiliangyongyaocai:{}",this.getClass().getName(),yaoshiliangyongyaocai.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<YaoshiliangyongyaocaiEntity> queryWrapper = new EntityWrapper<YaoshiliangyongyaocaiEntity>()
            .eq("yaoshiliangyongyaocai_uuid_number", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiUuidNumber())
            .eq("yaoshiliangyongyaocai_name", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiName())
            .eq("yaoshiliangyongyaocai_types", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiTypes())
            .eq("yaoshiliangyongyaocai_gongxiao", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiGongxiao())
            .eq("yaoshiliangyongyaocai_clicknum", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiClicknum())
            .eq("shangxia_types", yaoshiliangyongyaocai.getShangxiaTypes())
            .eq("yaoshiliangyongyaocai_delete", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YaoshiliangyongyaocaiEntity yaoshiliangyongyaocaiEntity = yaoshiliangyongyaocaiService.selectOne(queryWrapper);
        if(yaoshiliangyongyaocaiEntity==null){
            yaoshiliangyongyaocai.setYaoshiliangyongyaocaiClicknum(1);
            yaoshiliangyongyaocai.setShangxiaTypes(1);
            yaoshiliangyongyaocai.setYaoshiliangyongyaocaiDelete(1);
            yaoshiliangyongyaocai.setCreateTime(new Date());
            yaoshiliangyongyaocaiService.insert(yaoshiliangyongyaocai);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YaoshiliangyongyaocaiEntity yaoshiliangyongyaocai, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,yaoshiliangyongyaocai:{}",this.getClass().getName(),yaoshiliangyongyaocai.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<YaoshiliangyongyaocaiEntity> queryWrapper = new EntityWrapper<YaoshiliangyongyaocaiEntity>()
            .notIn("id",yaoshiliangyongyaocai.getId())
            .andNew()
            .eq("yaoshiliangyongyaocai_uuid_number", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiUuidNumber())
            .eq("yaoshiliangyongyaocai_name", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiName())
            .eq("yaoshiliangyongyaocai_types", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiTypes())
            .eq("yaoshiliangyongyaocai_gongxiao", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiGongxiao())
            .eq("yaoshiliangyongyaocai_clicknum", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiClicknum())
            .eq("shangxia_types", yaoshiliangyongyaocai.getShangxiaTypes())
            .eq("yaoshiliangyongyaocai_delete", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YaoshiliangyongyaocaiEntity yaoshiliangyongyaocaiEntity = yaoshiliangyongyaocaiService.selectOne(queryWrapper);
        if("".equals(yaoshiliangyongyaocai.getYaoshiliangyongyaocaiPhoto()) || "null".equals(yaoshiliangyongyaocai.getYaoshiliangyongyaocaiPhoto())){
                yaoshiliangyongyaocai.setYaoshiliangyongyaocaiPhoto(null);
        }
        if(yaoshiliangyongyaocaiEntity==null){
            yaoshiliangyongyaocaiService.updateById(yaoshiliangyongyaocai);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<YaoshiliangyongyaocaiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            YaoshiliangyongyaocaiEntity yaoshiliangyongyaocaiEntity = new YaoshiliangyongyaocaiEntity();
            yaoshiliangyongyaocaiEntity.setId(id);
            yaoshiliangyongyaocaiEntity.setYaoshiliangyongyaocaiDelete(2);
            list.add(yaoshiliangyongyaocaiEntity);
        }
        if(list != null && list.size() >0){
            yaoshiliangyongyaocaiService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<YaoshiliangyongyaocaiEntity> yaoshiliangyongyaocaiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            YaoshiliangyongyaocaiEntity yaoshiliangyongyaocaiEntity = new YaoshiliangyongyaocaiEntity();
//                            yaoshiliangyongyaocaiEntity.setYaoshiliangyongyaocaiUuidNumber(data.get(0));                    //药材编号 要改的
//                            yaoshiliangyongyaocaiEntity.setYaoshiliangyongyaocaiName(data.get(0));                    //药材名称 要改的
//                            yaoshiliangyongyaocaiEntity.setYaoshiliangyongyaocaiPhoto("");//详情和图片
//                            yaoshiliangyongyaocaiEntity.setYaoshiliangyongyaocaiTypes(Integer.valueOf(data.get(0)));   //药材类型 要改的
//                            yaoshiliangyongyaocaiEntity.setYaoshiliangyongyaocaiGongxiao(data.get(0));                    //功效 要改的
//                            yaoshiliangyongyaocaiEntity.setYaoshiliangyongyaocaiClicknum(Integer.valueOf(data.get(0)));   //热度 要改的
//                            yaoshiliangyongyaocaiEntity.setYaoshiliangyongyaocaiContent("");//详情和图片
//                            yaoshiliangyongyaocaiEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            yaoshiliangyongyaocaiEntity.setYaoshiliangyongyaocaiDelete(1);//逻辑删除字段
//                            yaoshiliangyongyaocaiEntity.setCreateTime(date);//时间
                            yaoshiliangyongyaocaiList.add(yaoshiliangyongyaocaiEntity);


                            //把要查询是否重复的字段放入map中
                                //药材编号
                                if(seachFields.containsKey("yaoshiliangyongyaocaiUuidNumber")){
                                    List<String> yaoshiliangyongyaocaiUuidNumber = seachFields.get("yaoshiliangyongyaocaiUuidNumber");
                                    yaoshiliangyongyaocaiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> yaoshiliangyongyaocaiUuidNumber = new ArrayList<>();
                                    yaoshiliangyongyaocaiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("yaoshiliangyongyaocaiUuidNumber",yaoshiliangyongyaocaiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //药材编号
                        List<YaoshiliangyongyaocaiEntity> yaoshiliangyongyaocaiEntities_yaoshiliangyongyaocaiUuidNumber = yaoshiliangyongyaocaiService.selectList(new EntityWrapper<YaoshiliangyongyaocaiEntity>().in("yaoshiliangyongyaocai_uuid_number", seachFields.get("yaoshiliangyongyaocaiUuidNumber")).eq("yaoshiliangyongyaocai_delete", 1));
                        if(yaoshiliangyongyaocaiEntities_yaoshiliangyongyaocaiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(YaoshiliangyongyaocaiEntity s:yaoshiliangyongyaocaiEntities_yaoshiliangyongyaocaiUuidNumber){
                                repeatFields.add(s.getYaoshiliangyongyaocaiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [药材编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        yaoshiliangyongyaocaiService.insertBatch(yaoshiliangyongyaocaiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = yaoshiliangyongyaocaiService.queryPage(params);

        //字典表数据转换
        List<YaoshiliangyongyaocaiView> list =(List<YaoshiliangyongyaocaiView>)page.getList();
        for(YaoshiliangyongyaocaiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YaoshiliangyongyaocaiEntity yaoshiliangyongyaocai = yaoshiliangyongyaocaiService.selectById(id);
            if(yaoshiliangyongyaocai !=null){

                //点击数量加1
                yaoshiliangyongyaocai.setYaoshiliangyongyaocaiClicknum(yaoshiliangyongyaocai.getYaoshiliangyongyaocaiClicknum()+1);
                yaoshiliangyongyaocaiService.updateById(yaoshiliangyongyaocai);

                //entity转view
                YaoshiliangyongyaocaiView view = new YaoshiliangyongyaocaiView();
                BeanUtils.copyProperties( yaoshiliangyongyaocai , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody YaoshiliangyongyaocaiEntity yaoshiliangyongyaocai, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,yaoshiliangyongyaocai:{}",this.getClass().getName(),yaoshiliangyongyaocai.toString());
        Wrapper<YaoshiliangyongyaocaiEntity> queryWrapper = new EntityWrapper<YaoshiliangyongyaocaiEntity>()
            .eq("yaoshiliangyongyaocai_uuid_number", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiUuidNumber())
            .eq("yaoshiliangyongyaocai_name", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiName())
            .eq("yaoshiliangyongyaocai_types", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiTypes())
            .eq("yaoshiliangyongyaocai_gongxiao", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiGongxiao())
            .eq("yaoshiliangyongyaocai_clicknum", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiClicknum())
            .eq("shangxia_types", yaoshiliangyongyaocai.getShangxiaTypes())
            .eq("yaoshiliangyongyaocai_delete", yaoshiliangyongyaocai.getYaoshiliangyongyaocaiDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YaoshiliangyongyaocaiEntity yaoshiliangyongyaocaiEntity = yaoshiliangyongyaocaiService.selectOne(queryWrapper);
        if(yaoshiliangyongyaocaiEntity==null){
            yaoshiliangyongyaocai.setYaoshiliangyongyaocaiDelete(1);
            yaoshiliangyongyaocai.setCreateTime(new Date());
        yaoshiliangyongyaocaiService.insert(yaoshiliangyongyaocai);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
