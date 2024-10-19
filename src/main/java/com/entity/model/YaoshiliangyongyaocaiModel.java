package com.entity.model;

import com.entity.YaoshiliangyongyaocaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 药食两用药材
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YaoshiliangyongyaocaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 药材编号
     */
    private String yaoshiliangyongyaocaiUuidNumber;


    /**
     * 药材名称
     */
    private String yaoshiliangyongyaocaiName;


    /**
     * 药材照片
     */
    private String yaoshiliangyongyaocaiPhoto;


    /**
     * 药材类型
     */
    private Integer yaoshiliangyongyaocaiTypes;


    /**
     * 功效
     */
    private String yaoshiliangyongyaocaiGongxiao;


    /**
     * 热度
     */
    private Integer yaoshiliangyongyaocaiClicknum;


    /**
     * 药食两用药材详情
     */
    private String yaoshiliangyongyaocaiContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer yaoshiliangyongyaocaiDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：药材编号
	 */
    public String getYaoshiliangyongyaocaiUuidNumber() {
        return yaoshiliangyongyaocaiUuidNumber;
    }


    /**
	 * 设置：药材编号
	 */
    public void setYaoshiliangyongyaocaiUuidNumber(String yaoshiliangyongyaocaiUuidNumber) {
        this.yaoshiliangyongyaocaiUuidNumber = yaoshiliangyongyaocaiUuidNumber;
    }
    /**
	 * 获取：药材名称
	 */
    public String getYaoshiliangyongyaocaiName() {
        return yaoshiliangyongyaocaiName;
    }


    /**
	 * 设置：药材名称
	 */
    public void setYaoshiliangyongyaocaiName(String yaoshiliangyongyaocaiName) {
        this.yaoshiliangyongyaocaiName = yaoshiliangyongyaocaiName;
    }
    /**
	 * 获取：药材照片
	 */
    public String getYaoshiliangyongyaocaiPhoto() {
        return yaoshiliangyongyaocaiPhoto;
    }


    /**
	 * 设置：药材照片
	 */
    public void setYaoshiliangyongyaocaiPhoto(String yaoshiliangyongyaocaiPhoto) {
        this.yaoshiliangyongyaocaiPhoto = yaoshiliangyongyaocaiPhoto;
    }
    /**
	 * 获取：药材类型
	 */
    public Integer getYaoshiliangyongyaocaiTypes() {
        return yaoshiliangyongyaocaiTypes;
    }


    /**
	 * 设置：药材类型
	 */
    public void setYaoshiliangyongyaocaiTypes(Integer yaoshiliangyongyaocaiTypes) {
        this.yaoshiliangyongyaocaiTypes = yaoshiliangyongyaocaiTypes;
    }
    /**
	 * 获取：功效
	 */
    public String getYaoshiliangyongyaocaiGongxiao() {
        return yaoshiliangyongyaocaiGongxiao;
    }


    /**
	 * 设置：功效
	 */
    public void setYaoshiliangyongyaocaiGongxiao(String yaoshiliangyongyaocaiGongxiao) {
        this.yaoshiliangyongyaocaiGongxiao = yaoshiliangyongyaocaiGongxiao;
    }
    /**
	 * 获取：热度
	 */
    public Integer getYaoshiliangyongyaocaiClicknum() {
        return yaoshiliangyongyaocaiClicknum;
    }


    /**
	 * 设置：热度
	 */
    public void setYaoshiliangyongyaocaiClicknum(Integer yaoshiliangyongyaocaiClicknum) {
        this.yaoshiliangyongyaocaiClicknum = yaoshiliangyongyaocaiClicknum;
    }
    /**
	 * 获取：药食两用药材详情
	 */
    public String getYaoshiliangyongyaocaiContent() {
        return yaoshiliangyongyaocaiContent;
    }


    /**
	 * 设置：药食两用药材详情
	 */
    public void setYaoshiliangyongyaocaiContent(String yaoshiliangyongyaocaiContent) {
        this.yaoshiliangyongyaocaiContent = yaoshiliangyongyaocaiContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getYaoshiliangyongyaocaiDelete() {
        return yaoshiliangyongyaocaiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setYaoshiliangyongyaocaiDelete(Integer yaoshiliangyongyaocaiDelete) {
        this.yaoshiliangyongyaocaiDelete = yaoshiliangyongyaocaiDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
