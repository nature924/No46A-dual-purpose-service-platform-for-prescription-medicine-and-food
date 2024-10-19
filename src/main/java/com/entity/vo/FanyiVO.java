package com.entity.vo;

import com.entity.FanyiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 中医翻译
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fanyi")
public class FanyiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 中文
     */

    @TableField(value = "fanyi_zhongwen_name")
    private String fanyiZhongwenName;


    /**
     * 英文
     */

    @TableField(value = "fanyi_yingwen_name")
    private String fanyiYingwenName;


    /**
     * 例句翻译
     */

    @TableField(value = "fanyi_content")
    private String fanyiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "fanyi_delete")
    private Integer fanyiDelete;


    /**
     * 创建时间 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：中文
	 */
    public String getFanyiZhongwenName() {
        return fanyiZhongwenName;
    }


    /**
	 * 获取：中文
	 */

    public void setFanyiZhongwenName(String fanyiZhongwenName) {
        this.fanyiZhongwenName = fanyiZhongwenName;
    }
    /**
	 * 设置：英文
	 */
    public String getFanyiYingwenName() {
        return fanyiYingwenName;
    }


    /**
	 * 获取：英文
	 */

    public void setFanyiYingwenName(String fanyiYingwenName) {
        this.fanyiYingwenName = fanyiYingwenName;
    }
    /**
	 * 设置：例句翻译
	 */
    public String getFanyiContent() {
        return fanyiContent;
    }


    /**
	 * 获取：例句翻译
	 */

    public void setFanyiContent(String fanyiContent) {
        this.fanyiContent = fanyiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getFanyiDelete() {
        return fanyiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setFanyiDelete(Integer fanyiDelete) {
        this.fanyiDelete = fanyiDelete;
    }
    /**
	 * 设置：创建时间 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
