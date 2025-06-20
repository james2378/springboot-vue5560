package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzishenlingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzishenlingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzishenlingView;


/**
 * 物资申领
 *
 * @author 
 * @email 
 * @date 2022-05-06 21:09:06
 */
public interface WuzishenlingService extends IService<WuzishenlingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzishenlingVO> selectListVO(Wrapper<WuzishenlingEntity> wrapper);
   	
   	WuzishenlingVO selectVO(@Param("ew") Wrapper<WuzishenlingEntity> wrapper);
   	
   	List<WuzishenlingView> selectListView(Wrapper<WuzishenlingEntity> wrapper);
   	
   	WuzishenlingView selectView(@Param("ew") Wrapper<WuzishenlingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzishenlingEntity> wrapper);
   	

}

