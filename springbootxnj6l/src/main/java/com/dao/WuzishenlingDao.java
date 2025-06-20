package com.dao;

import com.entity.WuzishenlingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzishenlingVO;
import com.entity.view.WuzishenlingView;


/**
 * 物资申领
 * 
 * @author 
 * @email 
 * @date 2022-05-06 21:09:06
 */
public interface WuzishenlingDao extends BaseMapper<WuzishenlingEntity> {
	
	List<WuzishenlingVO> selectListVO(@Param("ew") Wrapper<WuzishenlingEntity> wrapper);
	
	WuzishenlingVO selectVO(@Param("ew") Wrapper<WuzishenlingEntity> wrapper);
	
	List<WuzishenlingView> selectListView(@Param("ew") Wrapper<WuzishenlingEntity> wrapper);

	List<WuzishenlingView> selectListView(Pagination page,@Param("ew") Wrapper<WuzishenlingEntity> wrapper);
	
	WuzishenlingView selectView(@Param("ew") Wrapper<WuzishenlingEntity> wrapper);
	

}
