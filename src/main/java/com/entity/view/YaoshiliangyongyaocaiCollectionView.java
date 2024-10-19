package com.entity.view;

import com.entity.YaoshiliangyongyaocaiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 药食两用药材收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yaoshiliangyongyaocai_collection")
public class YaoshiliangyongyaocaiCollectionView extends YaoshiliangyongyaocaiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String yaoshiliangyongyaocaiCollectionValue;



		//级联表 yaoshiliangyongyaocai
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
				* 药材类型的值
				*/
				private String yaoshiliangyongyaocaiValue;
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
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer yaoshiliangyongyaocaiDelete;

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

	public YaoshiliangyongyaocaiCollectionView() {

	}

	public YaoshiliangyongyaocaiCollectionView(YaoshiliangyongyaocaiCollectionEntity yaoshiliangyongyaocaiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, yaoshiliangyongyaocaiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getYaoshiliangyongyaocaiCollectionValue() {
				return yaoshiliangyongyaocaiCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setYaoshiliangyongyaocaiCollectionValue(String yaoshiliangyongyaocaiCollectionValue) {
				this.yaoshiliangyongyaocaiCollectionValue = yaoshiliangyongyaocaiCollectionValue;
			}




























				//级联表的get和set yaoshiliangyongyaocai

					/**
					* 获取： 药材编号
					*/
					public String getYaoshiliangyongyaocaiUuidNumber() {
						return yaoshiliangyongyaocaiUuidNumber;
					}
					/**
					* 设置： 药材编号
					*/
					public void setYaoshiliangyongyaocaiUuidNumber(String yaoshiliangyongyaocaiUuidNumber) {
						this.yaoshiliangyongyaocaiUuidNumber = yaoshiliangyongyaocaiUuidNumber;
					}

					/**
					* 获取： 药材名称
					*/
					public String getYaoshiliangyongyaocaiName() {
						return yaoshiliangyongyaocaiName;
					}
					/**
					* 设置： 药材名称
					*/
					public void setYaoshiliangyongyaocaiName(String yaoshiliangyongyaocaiName) {
						this.yaoshiliangyongyaocaiName = yaoshiliangyongyaocaiName;
					}

					/**
					* 获取： 药材照片
					*/
					public String getYaoshiliangyongyaocaiPhoto() {
						return yaoshiliangyongyaocaiPhoto;
					}
					/**
					* 设置： 药材照片
					*/
					public void setYaoshiliangyongyaocaiPhoto(String yaoshiliangyongyaocaiPhoto) {
						this.yaoshiliangyongyaocaiPhoto = yaoshiliangyongyaocaiPhoto;
					}

					/**
					* 获取： 药材类型
					*/
					public Integer getYaoshiliangyongyaocaiTypes() {
						return yaoshiliangyongyaocaiTypes;
					}
					/**
					* 设置： 药材类型
					*/
					public void setYaoshiliangyongyaocaiTypes(Integer yaoshiliangyongyaocaiTypes) {
						this.yaoshiliangyongyaocaiTypes = yaoshiliangyongyaocaiTypes;
					}


						/**
						* 获取： 药材类型的值
						*/
						public String getYaoshiliangyongyaocaiValue() {
							return yaoshiliangyongyaocaiValue;
						}
						/**
						* 设置： 药材类型的值
						*/
						public void setYaoshiliangyongyaocaiValue(String yaoshiliangyongyaocaiValue) {
							this.yaoshiliangyongyaocaiValue = yaoshiliangyongyaocaiValue;
						}

					/**
					* 获取： 功效
					*/
					public String getYaoshiliangyongyaocaiGongxiao() {
						return yaoshiliangyongyaocaiGongxiao;
					}
					/**
					* 设置： 功效
					*/
					public void setYaoshiliangyongyaocaiGongxiao(String yaoshiliangyongyaocaiGongxiao) {
						this.yaoshiliangyongyaocaiGongxiao = yaoshiliangyongyaocaiGongxiao;
					}

					/**
					* 获取： 热度
					*/
					public Integer getYaoshiliangyongyaocaiClicknum() {
						return yaoshiliangyongyaocaiClicknum;
					}
					/**
					* 设置： 热度
					*/
					public void setYaoshiliangyongyaocaiClicknum(Integer yaoshiliangyongyaocaiClicknum) {
						this.yaoshiliangyongyaocaiClicknum = yaoshiliangyongyaocaiClicknum;
					}

					/**
					* 获取： 药食两用药材详情
					*/
					public String getYaoshiliangyongyaocaiContent() {
						return yaoshiliangyongyaocaiContent;
					}
					/**
					* 设置： 药食两用药材详情
					*/
					public void setYaoshiliangyongyaocaiContent(String yaoshiliangyongyaocaiContent) {
						this.yaoshiliangyongyaocaiContent = yaoshiliangyongyaocaiContent;
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
					public Integer getYaoshiliangyongyaocaiDelete() {
						return yaoshiliangyongyaocaiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setYaoshiliangyongyaocaiDelete(Integer yaoshiliangyongyaocaiDelete) {
						this.yaoshiliangyongyaocaiDelete = yaoshiliangyongyaocaiDelete;
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
