package com.entity.view;

import com.entity.YaofangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 药方
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yaofang")
public class YaofangView extends YaofangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 药方类型的值
		*/
		private String yaofangValue;
		/**
		* 剂型的值
		*/
		private String jixingValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public YaofangView() {

	}

	public YaofangView(YaofangEntity yaofangEntity) {
		try {
			BeanUtils.copyProperties(this, yaofangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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














}
