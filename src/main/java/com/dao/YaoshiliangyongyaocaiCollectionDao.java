package com.dao;

import com.entity.YaoshiliangyongyaocaiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YaoshiliangyongyaocaiCollectionView;

/**
 * 药食两用药材收藏 Dao 接口
 *
 * @author 
 */
public interface YaoshiliangyongyaocaiCollectionDao extends BaseMapper<YaoshiliangyongyaocaiCollectionEntity> {

   List<YaoshiliangyongyaocaiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
