package com.entity.vo;

import com.entity.YaoshiliangyongyaocaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 药食两用药材
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yaoshiliangyongyaocai")
public class YaoshiliangyongyaocaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 药材编号
     */

    @TableField(value = "yaoshiliangyongyaocai_uuid_number")
    private String yaoshiliangyongyaocaiUuidNumber;


    /**
     * 药材名称
     */

    @TableField(value = "yaoshiliangyongyaocai_name")
    private String yaoshiliangyongyaocaiName;


    /**
     * 药材照片
     */

    @TableField(value = "yaoshiliangyongyaocai_photo")
    private String yaoshiliangyongyaocaiPhoto;


    /**
     * 药材类型
     */

    @TableField(value = "yaoshiliangyongyaocai_types")
    private Integer yaoshiliangyongyaocaiTypes;


    /**
     * 功效
     */

    @TableField(value = "yaoshiliangyongyaocai_gongxiao")
    private String yaoshiliangyongyaocaiGongxiao;


    /**
     * 热度
     */

    @TableField(value = "yaoshiliangyongyaocai_clicknum")
    private Integer yaoshiliangyongyaocaiClicknum;


    /**
     * 药食两用药材详情
     */

    @TableField(value = "yaoshiliangyongyaocai_content")
    private String yaoshiliangyongyaocaiContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "yaoshiliangyongyaocai_delete")
    private Integer yaoshiliangyongyaocaiDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：药材编号
	 */
    public String getYaoshiliangyongyaocaiUuidNumber() {
        return yaoshiliangyongyaocaiUuidNumber;
    }


    /**
	 * 获取：药材编号
	 */

    public void setYaoshiliangyongyaocaiUuidNumber(String yaoshiliangyongyaocaiUuidNumber) {
        this.yaoshiliangyongyaocaiUuidNumber = yaoshiliangyongyaocaiUuidNumber;
    }
    /**
	 * 设置：药材名称
	 */
    public String getYaoshiliangyongyaocaiName() {
        return yaoshiliangyongyaocaiName;
    }


    /**
	 * 获取：药材名称
	 */

    public void setYaoshiliangyongyaocaiName(String yaoshiliangyongyaocaiName) {
        this.yaoshiliangyongyaocaiName = yaoshiliangyongyaocaiName;
    }
    /**
	 * 设置：药材照片
	 */
    public String getYaoshiliangyongyaocaiPhoto() {
        return yaoshiliangyongyaocaiPhoto;
    }


    /**
	 * 获取：药材照片
	 */

    public void setYaoshiliangyongyaocaiPhoto(String yaoshiliangyongyaocaiPhoto) {
        this.yaoshiliangyongyaocaiPhoto = yaoshiliangyongyaocaiPhoto;
    }
    /**
	 * 设置：药材类型
	 */
    public Integer getYaoshiliangyongyaocaiTypes() {
        return yaoshiliangyongyaocaiTypes;
    }


    /**
	 * 获取：药材类型
	 */

    public void setYaoshiliangyongyaocaiTypes(Integer yaoshiliangyongyaocaiTypes) {
        this.yaoshiliangyongyaocaiTypes = yaoshiliangyongyaocaiTypes;
    }
    /**
	 * 设置：功效
	 */
    public String getYaoshiliangyongyaocaiGongxiao() {
        return yaoshiliangyongyaocaiGongxiao;
    }


    /**
	 * 获取：功效
	 */

    public void setYaoshiliangyongyaocaiGongxiao(String yaoshiliangyongyaocaiGongxiao) {
        this.yaoshiliangyongyaocaiGongxiao = yaoshiliangyongyaocaiGongxiao;
    }
    /**
	 * 设置：热度
	 */
    public Integer getYaoshiliangyongyaocaiClicknum() {
        return yaoshiliangyongyaocaiClicknum;
    }


    /**
	 * 获取：热度
	 */

    public void setYaoshiliangyongyaocaiClicknum(Integer yaoshiliangyongyaocaiClicknum) {
        this.yaoshiliangyongyaocaiClicknum = yaoshiliangyongyaocaiClicknum;
    }
    /**
	 * 设置：药食两用药材详情
	 */
    public String getYaoshiliangyongyaocaiContent() {
        return yaoshiliangyongyaocaiContent;
    }


    /**
	 * 获取：药食两用药材详情
	 */

    public void setYaoshiliangyongyaocaiContent(String yaoshiliangyongyaocaiContent) {
        this.yaoshiliangyongyaocaiContent = yaoshiliangyongyaocaiContent;
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
    public Integer getYaoshiliangyongyaocaiDelete() {
        return yaoshiliangyongyaocaiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setYaoshiliangyongyaocaiDelete(Integer yaoshiliangyongyaocaiDelete) {
        this.yaoshiliangyongyaocaiDelete = yaoshiliangyongyaocaiDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
