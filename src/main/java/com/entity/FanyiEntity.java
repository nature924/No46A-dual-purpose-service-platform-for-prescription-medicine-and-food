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
 * 中医翻译
 *
 * @author 
 * @email
 */
@TableName("fanyi")
public class FanyiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FanyiEntity() {

	}

	public FanyiEntity(T t) {
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
        return "Fanyi{" +
            "id=" + id +
            ", fanyiZhongwenName=" + fanyiZhongwenName +
            ", fanyiYingwenName=" + fanyiYingwenName +
            ", fanyiContent=" + fanyiContent +
            ", fanyiDelete=" + fanyiDelete +
            ", createTime=" + createTime +
        "}";
    }
}
