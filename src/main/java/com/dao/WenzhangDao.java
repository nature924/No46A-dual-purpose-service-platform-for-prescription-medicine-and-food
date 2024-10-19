package com.dao;

import com.entity.WenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhangView;

/**
 * 文章 Dao 接口
 *
 * @author 
 */
public interface WenzhangDao extends BaseMapper<WenzhangEntity> {

   List<WenzhangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
