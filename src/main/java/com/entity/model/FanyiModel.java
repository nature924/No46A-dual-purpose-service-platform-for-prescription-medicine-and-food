package com.entity.model;

import com.entity.FanyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 中医翻译
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FanyiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 中文
     */
    private String fanyiZhongwenName;


    /**
     * 英文
     */
    private String fanyiYingwenName;


    /**
     * 例句翻译
     */
    private String fanyiContent;


    /**
     * 逻辑删除
     */
    private Integer fanyiDelete;


    /**
     * 创建时间 nameShow
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
	 * 获取：中文
	 */
    public String getFanyiZhongwenName() {
        return fanyiZhongwenName;
    }


    /**
	 * 设置：中文
	 */
    public void setFanyiZhongwenName(String fanyiZhongwenName) {
        this.fanyiZhongwenName = fanyiZhongwenName;
    }
    /**
	 * 获取：英文
	 */
    public String getFanyiYingwenName() {
        return fanyiYingwenName;
    }


    /**
	 * 设置：英文
	 */
    public void setFanyiYingwenName(String fanyiYingwenName) {
        this.fanyiYingwenName = fanyiYingwenName;
    }
    /**
	 * 获取：例句翻译
	 */
    public String getFanyiContent() {
        return fanyiContent;
    }


    /**
	 * 设置：例句翻译
	 */
    public void setFanyiContent(String fanyiContent) {
        this.fanyiContent = fanyiContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getFanyiDelete() {
        return fanyiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setFanyiDelete(Integer fanyiDelete) {
        this.fanyiDelete = fanyiDelete;
    }
    /**
	 * 获取：创建时间 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
