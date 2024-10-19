package com.entity.model;

import com.entity.YaofangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 药方
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YaofangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 药方编号
     */
    private String yaofangUuidNumber;


    /**
     * 药方名
     */
    private String yaofangName;


    /**
     * 药方照片
     */
    private String yaofangPhoto;


    /**
     * 药方类型
     */
    private Integer yaofangTypes;


    /**
     * 方剂来源
     */
    private String yaofangLaiyuan;


    /**
     * 作者
     */
    private String yaofangZuozhe;


    /**
     * 成书年代
     */
    private String yaofangChengshuniandai;


    /**
     * 原文
     */
    private String yaofangText;


    /**
     * 方剂组成
     */
    private String yaofangZucheng;


    /**
     * 药食两用
     */
    private String yaofangYaoshiliangyong;


    /**
     * 功效
     */
    private String yaofangGongxiao;


    /**
     * 主治证
     */
    private String yaofangZhuzhizheng;


    /**
     * 症状
     */
    private String yaofangZhengzhuang;


    /**
     * 用法/服法
     */
    private String yaofangYongfa;


    /**
     * 剂型
     */
    private Integer jixingTypes;


    /**
     * 引经
     */
    private String yaofangYinjing;


    /**
     * 热度
     */
    private Integer yaofangClicknum;


    /**
     * 药方详情
     */
    private String yaofangContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer yaofangDelete;


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
	 * 获取：药方编号
	 */
    public String getYaofangUuidNumber() {
        return yaofangUuidNumber;
    }


    /**
	 * 设置：药方编号
	 */
    public void setYaofangUuidNumber(String yaofangUuidNumber) {
        this.yaofangUuidNumber = yaofangUuidNumber;
    }
    /**
	 * 获取：药方名
	 */
    public String getYaofangName() {
        return yaofangName;
    }


    /**
	 * 设置：药方名
	 */
    public void setYaofangName(String yaofangName) {
        this.yaofangName = yaofangName;
    }
    /**
	 * 获取：药方照片
	 */
    public String getYaofangPhoto() {
        return yaofangPhoto;
    }


    /**
	 * 设置：药方照片
	 */
    public void setYaofangPhoto(String yaofangPhoto) {
        this.yaofangPhoto = yaofangPhoto;
    }
    /**
	 * 获取：药方类型
	 */
    public Integer getYaofangTypes() {
        return yaofangTypes;
    }


    /**
	 * 设置：药方类型
	 */
    public void setYaofangTypes(Integer yaofangTypes) {
        this.yaofangTypes = yaofangTypes;
    }
    /**
	 * 获取：方剂来源
	 */
    public String getYaofangLaiyuan() {
        return yaofangLaiyuan;
    }


    /**
	 * 设置：方剂来源
	 */
    public void setYaofangLaiyuan(String yaofangLaiyuan) {
        this.yaofangLaiyuan = yaofangLaiyuan;
    }
    /**
	 * 获取：作者
	 */
    public String getYaofangZuozhe() {
        return yaofangZuozhe;
    }


    /**
	 * 设置：作者
	 */
    public void setYaofangZuozhe(String yaofangZuozhe) {
        this.yaofangZuozhe = yaofangZuozhe;
    }
    /**
	 * 获取：成书年代
	 */
    public String getYaofangChengshuniandai() {
        return yaofangChengshuniandai;
    }


    /**
	 * 设置：成书年代
	 */
    public void setYaofangChengshuniandai(String yaofangChengshuniandai) {
        this.yaofangChengshuniandai = yaofangChengshuniandai;
    }
    /**
	 * 获取：原文
	 */
    public String getYaofangText() {
        return yaofangText;
    }


    /**
	 * 设置：原文
	 */
    public void setYaofangText(String yaofangText) {
        this.yaofangText = yaofangText;
    }
    /**
	 * 获取：方剂组成
	 */
    public String getYaofangZucheng() {
        return yaofangZucheng;
    }


    /**
	 * 设置：方剂组成
	 */
    public void setYaofangZucheng(String yaofangZucheng) {
        this.yaofangZucheng = yaofangZucheng;
    }
    /**
	 * 获取：药食两用
	 */
    public String getYaofangYaoshiliangyong() {
        return yaofangYaoshiliangyong;
    }


    /**
	 * 设置：药食两用
	 */
    public void setYaofangYaoshiliangyong(String yaofangYaoshiliangyong) {
        this.yaofangYaoshiliangyong = yaofangYaoshiliangyong;
    }
    /**
	 * 获取：功效
	 */
    public String getYaofangGongxiao() {
        return yaofangGongxiao;
    }


    /**
	 * 设置：功效
	 */
    public void setYaofangGongxiao(String yaofangGongxiao) {
        this.yaofangGongxiao = yaofangGongxiao;
    }
    /**
	 * 获取：主治证
	 */
    public String getYaofangZhuzhizheng() {
        return yaofangZhuzhizheng;
    }


    /**
	 * 设置：主治证
	 */
    public void setYaofangZhuzhizheng(String yaofangZhuzhizheng) {
        this.yaofangZhuzhizheng = yaofangZhuzhizheng;
    }
    /**
	 * 获取：症状
	 */
    public String getYaofangZhengzhuang() {
        return yaofangZhengzhuang;
    }


    /**
	 * 设置：症状
	 */
    public void setYaofangZhengzhuang(String yaofangZhengzhuang) {
        this.yaofangZhengzhuang = yaofangZhengzhuang;
    }
    /**
	 * 获取：用法/服法
	 */
    public String getYaofangYongfa() {
        return yaofangYongfa;
    }


    /**
	 * 设置：用法/服法
	 */
    public void setYaofangYongfa(String yaofangYongfa) {
        this.yaofangYongfa = yaofangYongfa;
    }
    /**
	 * 获取：剂型
	 */
    public Integer getJixingTypes() {
        return jixingTypes;
    }


    /**
	 * 设置：剂型
	 */
    public void setJixingTypes(Integer jixingTypes) {
        this.jixingTypes = jixingTypes;
    }
    /**
	 * 获取：引经
	 */
    public String getYaofangYinjing() {
        return yaofangYinjing;
    }


    /**
	 * 设置：引经
	 */
    public void setYaofangYinjing(String yaofangYinjing) {
        this.yaofangYinjing = yaofangYinjing;
    }
    /**
	 * 获取：热度
	 */
    public Integer getYaofangClicknum() {
        return yaofangClicknum;
    }


    /**
	 * 设置：热度
	 */
    public void setYaofangClicknum(Integer yaofangClicknum) {
        this.yaofangClicknum = yaofangClicknum;
    }
    /**
	 * 获取：药方详情
	 */
    public String getYaofangContent() {
        return yaofangContent;
    }


    /**
	 * 设置：药方详情
	 */
    public void setYaofangContent(String yaofangContent) {
        this.yaofangContent = yaofangContent;
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
    public Integer getYaofangDelete() {
        return yaofangDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setYaofangDelete(Integer yaofangDelete) {
        this.yaofangDelete = yaofangDelete;
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
