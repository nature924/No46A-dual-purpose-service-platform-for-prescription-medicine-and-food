package com.dao;

import com.entity.YaofangCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YaofangCollectionView;

/**
 * 药方收藏 Dao 接口
 *
 * @author 
 */
public interface YaofangCollectionDao extends BaseMapper<YaofangCollectionEntity> {

   List<YaofangCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
