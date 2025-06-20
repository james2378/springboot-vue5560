package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WuzishenlingEntity;
import com.entity.view.WuzishenlingView;

import com.service.WuzishenlingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 物资申领
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-06 21:09:06
 */
@RestController
@RequestMapping("/wuzishenling")
public class WuzishenlingController {
    @Autowired
    private WuzishenlingService wuzishenlingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WuzishenlingEntity wuzishenling,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shenlingriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shenlingriqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wuzishenling.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WuzishenlingEntity> ew = new EntityWrapper<WuzishenlingEntity>();
                if(shenlingriqistart!=null) ew.ge("shenlingriqi", shenlingriqistart);
                if(shenlingriqiend!=null) ew.le("shenlingriqi", shenlingriqiend);
		PageUtils page = wuzishenlingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuzishenling), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WuzishenlingEntity wuzishenling, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shenlingriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shenlingriqiend,
		HttpServletRequest request){
        EntityWrapper<WuzishenlingEntity> ew = new EntityWrapper<WuzishenlingEntity>();
                if(shenlingriqistart!=null) ew.ge("shenlingriqi", shenlingriqistart);
                if(shenlingriqiend!=null) ew.le("shenlingriqi", shenlingriqiend);
		PageUtils page = wuzishenlingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuzishenling), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WuzishenlingEntity wuzishenling){
       	EntityWrapper<WuzishenlingEntity> ew = new EntityWrapper<WuzishenlingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wuzishenling, "wuzishenling")); 
        return R.ok().put("data", wuzishenlingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WuzishenlingEntity wuzishenling){
        EntityWrapper< WuzishenlingEntity> ew = new EntityWrapper< WuzishenlingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wuzishenling, "wuzishenling")); 
		WuzishenlingView wuzishenlingView =  wuzishenlingService.selectView(ew);
		return R.ok("查询物资申领成功").put("data", wuzishenlingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WuzishenlingEntity wuzishenling = wuzishenlingService.selectById(id);
        return R.ok().put("data", wuzishenling);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WuzishenlingEntity wuzishenling = wuzishenlingService.selectById(id);
        return R.ok().put("data", wuzishenling);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WuzishenlingEntity wuzishenling, HttpServletRequest request){
    	wuzishenling.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuzishenling);
        wuzishenlingService.insert(wuzishenling);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WuzishenlingEntity wuzishenling, HttpServletRequest request){
    	wuzishenling.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuzishenling);
        wuzishenlingService.insert(wuzishenling);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WuzishenlingEntity wuzishenling, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wuzishenling);
        wuzishenlingService.updateById(wuzishenling);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wuzishenlingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WuzishenlingEntity> wrapper = new EntityWrapper<WuzishenlingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = wuzishenlingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
