package com.dao;

import com.entity.ShebeiweixiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeiweixiuVO;
import com.entity.view.ShebeiweixiuView;


/**
 * 设备维修
 * 
 * @author 
 * @email 
 * @date 2021-05-21 21:00:44
 */
public interface ShebeiweixiuDao extends BaseMapper<ShebeiweixiuEntity> {
	
	List<ShebeiweixiuVO> selectListVO(@Param("ew") Wrapper<ShebeiweixiuEntity> wrapper);
	
	ShebeiweixiuVO selectVO(@Param("ew") Wrapper<ShebeiweixiuEntity> wrapper);
	
	List<ShebeiweixiuView> selectListView(@Param("ew") Wrapper<ShebeiweixiuEntity> wrapper);

	List<ShebeiweixiuView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeiweixiuEntity> wrapper);
	
	ShebeiweixiuView selectView(@Param("ew") Wrapper<ShebeiweixiuEntity> wrapper);
	
}
