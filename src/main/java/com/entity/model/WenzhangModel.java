package com.entity.model;

import com.entity.WenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 文章
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WenzhangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 文章编号
     */
    private String wenzhangUuidNumber;


    /**
     * 文章名称
     */
    private String wenzhangName;


    /**
     * 文章照片
     */
    private String wenzhangPhoto;


    /**
     * 文章类型
     */
    private Integer wenzhangTypes;


    /**
     * 热度
     */
    private Integer wenzhangClicknum;


    /**
     * 文章内容
     */
    private String wenzhangContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer wenzhangDelete;


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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：文章编号
	 */
    public String getWenzhangUuidNumber() {
        return wenzhangUuidNumber;
    }


    /**
	 * 设置：文章编号
	 */
    public void setWenzhangUuidNumber(String wenzhangUuidNumber) {
        this.wenzhangUuidNumber = wenzhangUuidNumber;
    }
    /**
	 * 获取：文章名称
	 */
    public String getWenzhangName() {
        return wenzhangName;
    }


    /**
	 * 设置：文章名称
	 */
    public void setWenzhangName(String wenzhangName) {
        this.wenzhangName = wenzhangName;
    }
    /**
	 * 获取：文章照片
	 */
    public String getWenzhangPhoto() {
        return wenzhangPhoto;
    }


    /**
	 * 设置：文章照片
	 */
    public void setWenzhangPhoto(String wenzhangPhoto) {
        this.wenzhangPhoto = wenzhangPhoto;
    }
    /**
	 * 获取：文章类型
	 */
    public Integer getWenzhangTypes() {
        return wenzhangTypes;
    }


    /**
	 * 设置：文章类型
	 */
    public void setWenzhangTypes(Integer wenzhangTypes) {
        this.wenzhangTypes = wenzhangTypes;
    }
    /**
	 * 获取：热度
	 */
    public Integer getWenzhangClicknum() {
        return wenzhangClicknum;
    }


    /**
	 * 设置：热度
	 */
    public void setWenzhangClicknum(Integer wenzhangClicknum) {
        this.wenzhangClicknum = wenzhangClicknum;
    }
    /**
	 * 获取：文章内容
	 */
    public String getWenzhangContent() {
        return wenzhangContent;
    }


    /**
	 * 设置：文章内容
	 */
    public void setWenzhangContent(String wenzhangContent) {
        this.wenzhangContent = wenzhangContent;
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
    public Integer getWenzhangDelete() {
        return wenzhangDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setWenzhangDelete(Integer wenzhangDelete) {
        this.wenzhangDelete = wenzhangDelete;
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
