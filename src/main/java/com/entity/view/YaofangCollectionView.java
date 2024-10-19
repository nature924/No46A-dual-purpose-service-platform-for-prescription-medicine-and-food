package com.entity.view;

import com.entity.YaofangCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 药方收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yaofang_collection")
public class YaofangCollectionView extends YaofangCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String yaofangCollectionValue;



		//级联表 yaofang
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
				* 药方类型的值
				*/
				private String yaofangValue;
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
				* 剂型的值
				*/
				private String jixingValue;
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
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer yaofangDelete;

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

	public YaofangCollectionView() {

	}

	public YaofangCollectionView(YaofangCollectionEntity yaofangCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, yaofangCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getYaofangCollectionValue() {
				return yaofangCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setYaofangCollectionValue(String yaofangCollectionValue) {
				this.yaofangCollectionValue = yaofangCollectionValue;
			}






















				//级联表的get和set yaofang

					/**
					* 获取： 药方编号
					*/
					public String getYaofangUuidNumber() {
						return yaofangUuidNumber;
					}
					/**
					* 设置： 药方编号
					*/
					public void setYaofangUuidNumber(String yaofangUuidNumber) {
						this.yaofangUuidNumber = yaofangUuidNumber;
					}

					/**
					* 获取： 药方名
					*/
					public String getYaofangName() {
						return yaofangName;
					}
					/**
					* 设置： 药方名
					*/
					public void setYaofangName(String yaofangName) {
						this.yaofangName = yaofangName;
					}

					/**
					* 获取： 药方照片
					*/
					public String getYaofangPhoto() {
						return yaofangPhoto;
					}
					/**
					* 设置： 药方照片
					*/
					public void setYaofangPhoto(String yaofangPhoto) {
						this.yaofangPhoto = yaofangPhoto;
					}

					/**
					* 获取： 药方类型
					*/
					public Integer getYaofangTypes() {
						return yaofangTypes;
					}
					/**
					* 设置： 药方类型
					*/
					public void setYaofangTypes(Integer yaofangTypes) {
						this.yaofangTypes = yaofangTypes;
					}


						/**
						* 获取： 药方类型的值
						*/
						public String getYaofangValue() {
							return yaofangValue;
						}
						/**
						* 设置： 药方类型的值
						*/
						public void setYaofangValue(String yaofangValue) {
							this.yaofangValue = yaofangValue;
						}

					/**
					* 获取： 方剂来源
					*/
					public String getYaofangLaiyuan() {
						return yaofangLaiyuan;
					}
					/**
					* 设置： 方剂来源
					*/
					public void setYaofangLaiyuan(String yaofangLaiyuan) {
						this.yaofangLaiyuan = yaofangLaiyuan;
					}

					/**
					* 获取： 作者
					*/
					public String getYaofangZuozhe() {
						return yaofangZuozhe;
					}
					/**
					* 设置： 作者
					*/
					public void setYaofangZuozhe(String yaofangZuozhe) {
						this.yaofangZuozhe = yaofangZuozhe;
					}

					/**
					* 获取： 成书年代
					*/
					public String getYaofangChengshuniandai() {
						return yaofangChengshuniandai;
					}
					/**
					* 设置： 成书年代
					*/
					public void setYaofangChengshuniandai(String yaofangChengshuniandai) {
						this.yaofangChengshuniandai = yaofangChengshuniandai;
					}

					/**
					* 获取： 原文
					*/
					public String getYaofangText() {
						return yaofangText;
					}
					/**
					* 设置： 原文
					*/
					public void setYaofangText(String yaofangText) {
						this.yaofangText = yaofangText;
					}

					/**
					* 获取： 方剂组成
					*/
					public String getYaofangZucheng() {
						return yaofangZucheng;
					}
					/**
					* 设置： 方剂组成
					*/
					public void setYaofangZucheng(String yaofangZucheng) {
						this.yaofangZucheng = yaofangZucheng;
					}

					/**
					* 获取： 药食两用
					*/
					public String getYaofangYaoshiliangyong() {
						return yaofangYaoshiliangyong;
					}
					/**
					* 设置： 药食两用
					*/
					public void setYaofangYaoshiliangyong(String yaofangYaoshiliangyong) {
						this.yaofangYaoshiliangyong = yaofangYaoshiliangyong;
					}

					/**
					* 获取： 功效
					*/
					public String getYaofangGongxiao() {
						return yaofangGongxiao;
					}
					/**
					* 设置： 功效
					*/
					public void setYaofangGongxiao(String yaofangGongxiao) {
						this.yaofangGongxiao = yaofangGongxiao;
					}

					/**
					* 获取： 主治证
					*/
					public String getYaofangZhuzhizheng() {
						return yaofangZhuzhizheng;
					}
					/**
					* 设置： 主治证
					*/
					public void setYaofangZhuzhizheng(String yaofangZhuzhizheng) {
						this.yaofangZhuzhizheng = yaofangZhuzhizheng;
					}

					/**
					* 获取： 症状
					*/
					public String getYaofangZhengzhuang() {
						return yaofangZhengzhuang;
					}
					/**
					* 设置： 症状
					*/
					public void setYaofangZhengzhuang(String yaofangZhengzhuang) {
						this.yaofangZhengzhuang = yaofangZhengzhuang;
					}

					/**
					* 获取： 用法/服法
					*/
					public String getYaofangYongfa() {
						return yaofangYongfa;
					}
					/**
					* 设置： 用法/服法
					*/
					public void setYaofangYongfa(String yaofangYongfa) {
						this.yaofangYongfa = yaofangYongfa;
					}

					/**
					* 获取： 剂型
					*/
					public Integer getJixingTypes() {
						return jixingTypes;
					}
					/**
					* 设置： 剂型
					*/
					public void setJixingTypes(Integer jixingTypes) {
						this.jixingTypes = jixingTypes;
					}


						/**
						* 获取： 剂型的值
						*/
						public String getJixingValue() {
							return jixingValue;
						}
						/**
						* 设置： 剂型的值
						*/
						public void setJixingValue(String jixingValue) {
							this.jixingValue = jixingValue;
						}

					/**
					* 获取： 引经
					*/
					public String getYaofangYinjing() {
						return yaofangYinjing;
					}
					/**
					* 设置： 引经
					*/
					public void setYaofangYinjing(String yaofangYinjing) {
						this.yaofangYinjing = yaofangYinjing;
					}

					/**
					* 获取： 热度
					*/
					public Integer getYaofangClicknum() {
						return yaofangClicknum;
					}
					/**
					* 设置： 热度
					*/
					public void setYaofangClicknum(Integer yaofangClicknum) {
						this.yaofangClicknum = yaofangClicknum;
					}

					/**
					* 获取： 药方详情
					*/
					public String getYaofangContent() {
						return yaofangContent;
					}
					/**
					* 设置： 药方详情
					*/
					public void setYaofangContent(String yaofangContent) {
						this.yaofangContent = yaofangContent;
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
					public Integer getYaofangDelete() {
						return yaofangDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setYaofangDelete(Integer yaofangDelete) {
						this.yaofangDelete = yaofangDelete;
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
