package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WuzishenlingDao;
import com.entity.WuzishenlingEntity;
import com.service.WuzishenlingService;
import com.entity.vo.WuzishenlingVO;
import com.entity.view.WuzishenlingView;

@Service("wuzishenlingService")
public class WuzishenlingServiceImpl extends ServiceImpl<WuzishenlingDao, WuzishenlingEntity> implements WuzishenlingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuzishenlingEntity> page = this.selectPage(
                new Query<WuzishenlingEntity>(params).getPage(),
                new EntityWrapper<WuzishenlingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuzishenlingEntity> wrapper) {
		  Page<WuzishenlingView> page =new Query<WuzishenlingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuzishenlingVO> selectListVO(Wrapper<WuzishenlingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuzishenlingVO selectVO(Wrapper<WuzishenlingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuzishenlingView> selectListView(Wrapper<WuzishenlingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuzishenlingView selectView(Wrapper<WuzishenlingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
