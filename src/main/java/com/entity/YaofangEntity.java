package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 药方
 *
 * @author 
 * @email
 */
@TableName("yaofang")
public class YaofangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YaofangEntity() {

	}

	public YaofangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 药方编号
     */
    @TableField(value = "yaofang_uuid_number")

    private String yaofangUuidNumber;


    /**
     * 药方名
     */
    @TableField(value = "yaofang_name")

    private String yaofangName;


    /**
     * 药方照片
     */
    @TableField(value = "yaofang_photo")

    private String yaofangPhoto;


    /**
     * 药方类型
     */
    @TableField(value = "yaofang_types")

    private Integer yaofangTypes;


    /**
     * 方剂来源
     */
    @TableField(value = "yaofang_laiyuan")

    private String yaofangLaiyuan;


    /**
     * 作者
     */
    @TableField(value = "yaofang_zuozhe")

    private String yaofangZuozhe;


    /**
     * 成书年代
     */
    @TableField(value = "yaofang_chengshuniandai")

    private String yaofangChengshuniandai;


    /**
     * 原文
     */
    @TableField(value = "yaofang_text")

    private String yaofangText;


    /**
     * 方剂组成
     */
    @TableField(value = "yaofang_zucheng")

    private String yaofangZucheng;


    /**
     * 药食两用
     */
    @TableField(value = "yaofang_yaoshiliangyong")

    private String yaofangYaoshiliangyong;


    /**
     * 功效
     */
    @TableField(value = "yaofang_gongxiao")

    private String yaofangGongxiao;


    /**
     * 主治证
     */
    @TableField(value = "yaofang_zhuzhizheng")

    private String yaofangZhuzhizheng;


    /**
     * 症状
     */
    @TableField(value = "yaofang_zhengzhuang")

    private String yaofangZhengzhuang;


    /**
     * 用法/服法
     */
    @TableField(value = "yaofang_yongfa")

    private String yaofangYongfa;


    /**
     * 剂型
     */
    @TableField(value = "jixing_types")

    private Integer jixingTypes;


    /**
     * 引经
     */
    @TableField(value = "yaofang_yinjing")

    private String yaofangYinjing;


    /**
     * 热度
     */
    @TableField(value = "yaofang_clicknum")

    private Integer yaofangClicknum;


    /**
     * 药方详情
     */
    @TableField(value = "yaofang_content")

    private String yaofangContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "yaofang_delete")

    private Integer yaofangDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：药方编号
	 */
    public String getYaofangUuidNumber() {
        return yaofangUuidNumber;
    }
    /**
	 * 获取：药方编号
	 */

    public void setYaofangUuidNumber(String yaofangUuidNumber) {
        this.yaofangUuidNumber = yaofangUuidNumber;
    }
    /**
	 * 设置：药方名
	 */
    public String getYaofangName() {
        return yaofangName;
    }
    /**
	 * 获取：药方名
	 */

    public void setYaofangName(String yaofangName) {
        this.yaofangName = yaofangName;
    }
    /**
	 * 设置：药方照片
	 */
    public String getYaofangPhoto() {
        return yaofangPhoto;
    }
    /**
	 * 获取：药方照片
	 */

    public void setYaofangPhoto(String yaofangPhoto) {
        this.yaofangPhoto = yaofangPhoto;
    }
    /**
	 * 设置：药方类型
	 */
    public Integer getYaofangTypes() {
        return yaofangTypes;
    }
    /**
	 * 获取：药方类型
	 */

    public void setYaofangTypes(Integer yaofangTypes) {
        this.yaofangTypes = yaofangTypes;
    }
    /**
	 * 设置：方剂来源
	 */
    public String getYaofangLaiyuan() {
        return yaofangLaiyuan;
    }
    /**
	 * 获取：方剂来源
	 */

    public void setYaofangLaiyuan(String yaofangLaiyuan) {
        this.yaofangLaiyuan = yaofangLaiyuan;
    }
    /**
	 * 设置：作者
	 */
    public String getYaofangZuozhe() {
        return yaofangZuozhe;
    }
    /**
	 * 获取：作者
	 */

    public void setYaofangZuozhe(String yaofangZuozhe) {
        this.yaofangZuozhe = yaofangZuozhe;
    }
    /**
	 * 设置：成书年代
	 */
    public String getYaofangChengshuniandai() {
        return yaofangChengshuniandai;
    }
    /**
	 * 获取：成书年代
	 */

    public void setYaofangChengshuniandai(String yaofangChengshuniandai) {
        this.yaofangChengshuniandai = yaofangChengshuniandai;
    }
    /**
	 * 设置：原文
	 */
    public String getYaofangText() {
        return yaofangText;
    }
    /**
	 * 获取：原文
	 */

    public void setYaofangText(String yaofangText) {
        this.yaofangText = yaofangText;
    }
    /**
	 * 设置：方剂组成
	 */
    public String getYaofangZucheng() {
        return yaofangZucheng;
    }
    /**
	 * 获取：方剂组成
	 */

    public void setYaofangZucheng(String yaofangZucheng) {
        this.yaofangZucheng = yaofangZucheng;
    }
    /**
	 * 设置：药食两用
	 */
    public String getYaofangYaoshiliangyong() {
        return yaofangYaoshiliangyong;
    }
    /**
	 * 获取：药食两用
	 */

    public void setYaofangYaoshiliangyong(String yaofangYaoshiliangyong) {
        this.yaofangYaoshiliangyong = yaofangYaoshiliangyong;
    }
    /**
	 * 设置：功效
	 */
    public String getYaofangGongxiao() {
        return yaofangGongxiao;
    }
    /**
	 * 获取：功效
	 */

    public void setYaofangGongxiao(String yaofangGongxiao) {
        this.yaofangGongxiao = yaofangGongxiao;
    }
    /**
	 * 设置：主治证
	 */
    public String getYaofangZhuzhizheng() {
        return yaofangZhuzhizheng;
    }
    /**
	 * 获取：主治证
	 */

    public void setYaofangZhuzhizheng(String yaofangZhuzhizheng) {
        this.yaofangZhuzhizheng = yaofangZhuzhizheng;
    }
    /**
	 * 设置：症状
	 */
    public String getYaofangZhengzhuang() {
        return yaofangZhengzhuang;
    }
    /**
	 * 获取：症状
	 */

    public void setYaofangZhengzhuang(String yaofangZhengzhuang) {
        this.yaofangZhengzhuang = yaofangZhengzhuang;
    }
    /**
	 * 设置：用法/服法
	 */
    public String getYaofangYongfa() {
        return yaofangYongfa;
    }
    /**
	 * 获取：用法/服法
	 */

    public void setYaofangYongfa(String yaofangYongfa) {
        this.yaofangYongfa = yaofangYongfa;
    }
    /**
	 * 设置：剂型
	 */
    public Integer getJixingTypes() {
        return jixingTypes;
    }
    /**
	 * 获取：剂型
	 */

    public void setJixingTypes(Integer jixingTypes) {
        this.jixingTypes = jixingTypes;
    }
    /**
	 * 设置：引经
	 */
    public String getYaofangYinjing() {
        return yaofangYinjing;
    }
    /**
	 * 获取：引经
	 */

    public void setYaofangYinjing(String yaofangYinjing) {
        this.yaofangYinjing = yaofangYinjing;
    }
    /**
	 * 设置：热度
	 */
    public Integer getYaofangClicknum() {
        return yaofangClicknum;
    }
    /**
	 * 获取：热度
	 */

    public void setYaofangClicknum(Integer yaofangClicknum) {
        this.yaofangClicknum = yaofangClicknum;
    }
    /**
	 * 设置：药方详情
	 */
    public String getYaofangContent() {
        return yaofangContent;
    }
    /**
	 * 获取：药方详情
	 */

    public void setYaofangContent(String yaofangContent) {
        this.yaofangContent = yaofangContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getYaofangDelete() {
        return yaofangDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setYaofangDelete(Integer yaofangDelete) {
        this.yaofangDelete = yaofangDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yaofang{" +
            "id=" + id +
            ", yaofangUuidNumber=" + yaofangUuidNumber +
            ", yaofangName=" + yaofangName +
            ", yaofangPhoto=" + yaofangPhoto +
            ", yaofangTypes=" + yaofangTypes +
            ", yaofangLaiyuan=" + yaofangLaiyuan +
            ", yaofangZuozhe=" + yaofangZuozhe +
            ", yaofangChengshuniandai=" + yaofangChengshuniandai +
            ", yaofangText=" + yaofangText +
            ", yaofangZucheng=" + yaofangZucheng +
            ", yaofangYaoshiliangyong=" + yaofangYaoshiliangyong +
            ", yaofangGongxiao=" + yaofangGongxiao +
            ", yaofangZhuzhizheng=" + yaofangZhuzhizheng +
            ", yaofangZhengzhuang=" + yaofangZhengzhuang +
            ", yaofangYongfa=" + yaofangYongfa +
            ", jixingTypes=" + jixingTypes +
            ", yaofangYinjing=" + yaofangYinjing +
            ", yaofangClicknum=" + yaofangClicknum +
            ", yaofangContent=" + yaofangContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", yaofangDelete=" + yaofangDelete +
            ", createTime=" + createTime +
        "}";
    }
}
