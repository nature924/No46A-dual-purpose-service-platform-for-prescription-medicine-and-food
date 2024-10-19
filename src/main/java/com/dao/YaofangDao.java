package com.dao;

import com.entity.YaofangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YaofangView;

/**
 * 药方 Dao 接口
 *
 * @author 
 */
public interface YaofangDao extends BaseMapper<YaofangEntity> {

   List<YaofangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
