package com.dao;

import com.entity.YaoshiliangyongyaocaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YaoshiliangyongyaocaiView;

/**
 * 药食两用药材 Dao 接口
 *
 * @author 
 */
public interface YaoshiliangyongyaocaiDao extends BaseMapper<YaoshiliangyongyaocaiEntity> {

   List<YaoshiliangyongyaocaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
