package com.dao;

import com.entity.FanyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FanyiView;

/**
 * 中医翻译 Dao 接口
 *
 * @author 
 */
public interface FanyiDao extends BaseMapper<FanyiEntity> {

   List<FanyiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
