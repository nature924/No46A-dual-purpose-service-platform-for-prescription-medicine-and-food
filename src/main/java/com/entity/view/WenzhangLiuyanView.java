package com.entity.view;

import com.entity.WenzhangLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 文章留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wenzhang_liuyan")
public class WenzhangLiuyanView extends WenzhangLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 wenzhang
			/**
			* 文章 的 用户
			*/
			private Integer wenzhangYonghuId;
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
				* 文章类型的值
				*/
				private String wenzhangValue;
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
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer wenzhangDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public WenzhangLiuyanView() {

	}

	public WenzhangLiuyanView(WenzhangLiuyanEntity wenzhangLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, wenzhangLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set wenzhang

					/**
					* 获取：文章 的 用户
					*/
					public Integer getWenzhangYonghuId() {
						return wenzhangYonghuId;
					}
					/**
					* 设置：文章 的 用户
					*/
					public void setWenzhangYonghuId(Integer wenzhangYonghuId) {
						this.wenzhangYonghuId = wenzhangYonghuId;
					}


					/**
					* 获取： 文章编号
					*/
					public String getWenzhangUuidNumber() {
						return wenzhangUuidNumber;
					}
					/**
					* 设置： 文章编号
					*/
					public void setWenzhangUuidNumber(String wenzhangUuidNumber) {
						this.wenzhangUuidNumber = wenzhangUuidNumber;
					}

					/**
					* 获取： 文章名称
					*/
					public String getWenzhangName() {
						return wenzhangName;
					}
					/**
					* 设置： 文章名称
					*/
					public void setWenzhangName(String wenzhangName) {
						this.wenzhangName = wenzhangName;
					}

					/**
					* 获取： 文章照片
					*/
					public String getWenzhangPhoto() {
						return wenzhangPhoto;
					}
					/**
					* 设置： 文章照片
					*/
					public void setWenzhangPhoto(String wenzhangPhoto) {
						this.wenzhangPhoto = wenzhangPhoto;
					}

					/**
					* 获取： 文章类型
					*/
					public Integer getWenzhangTypes() {
						return wenzhangTypes;
					}
					/**
					* 设置： 文章类型
					*/
					public void setWenzhangTypes(Integer wenzhangTypes) {
						this.wenzhangTypes = wenzhangTypes;
					}


						/**
						* 获取： 文章类型的值
						*/
						public String getWenzhangValue() {
							return wenzhangValue;
						}
						/**
						* 设置： 文章类型的值
						*/
						public void setWenzhangValue(String wenzhangValue) {
							this.wenzhangValue = wenzhangValue;
						}

					/**
					* 获取： 热度
					*/
					public Integer getWenzhangClicknum() {
						return wenzhangClicknum;
					}
					/**
					* 设置： 热度
					*/
					public void setWenzhangClicknum(Integer wenzhangClicknum) {
						this.wenzhangClicknum = wenzhangClicknum;
					}

					/**
					* 获取： 文章内容
					*/
					public String getWenzhangContent() {
						return wenzhangContent;
					}
					/**
					* 设置： 文章内容
					*/
					public void setWenzhangContent(String wenzhangContent) {
						this.wenzhangContent = wenzhangContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getWenzhangDelete() {
						return wenzhangDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setWenzhangDelete(Integer wenzhangDelete) {
						this.wenzhangDelete = wenzhangDelete;
					}






















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
