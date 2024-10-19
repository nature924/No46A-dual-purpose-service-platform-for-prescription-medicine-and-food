package com.entity.view;

import com.entity.YaoshiliangyongyaocaiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 药食两用药材
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yaoshiliangyongyaocai")
public class YaoshiliangyongyaocaiView extends YaoshiliangyongyaocaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 药材类型的值
		*/
		private String yaoshiliangyongyaocaiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public YaoshiliangyongyaocaiView() {

	}

	public YaoshiliangyongyaocaiView(YaoshiliangyongyaocaiEntity yaoshiliangyongyaocaiEntity) {
		try {
			BeanUtils.copyProperties(this, yaoshiliangyongyaocaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
