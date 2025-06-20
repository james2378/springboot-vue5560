package com.entity.vo;

import com.entity.WuzixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 物资信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-06 21:09:06
 */
public class WuzixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物资分类
	 */
	
	private String wuzifenlei;
		
	/**
	 * 物资图片
	 */
	
	private String wuzitupian;
		
	/**
	 * 物资规格
	 */
	
	private String wuziguige;
		
	/**
	 * 物资品牌
	 */
	
	private String wuzipinpai;
		
	/**
	 * 物资数量
	 */
	
	private Integer wuzishuliang;
		
	/**
	 * 物资详情
	 */
	
	private String wuzixiangqing;
				
	
	/**
	 * 设置：物资分类
	 */
	 
	public void setWuzifenlei(String wuzifenlei) {
		this.wuzifenlei = wuzifenlei;
	}
	
	/**
	 * 获取：物资分类
	 */
	public String getWuzifenlei() {
		return wuzifenlei;
	}
				
	
	/**
	 * 设置：物资图片
	 */
	 
	public void setWuzitupian(String wuzitupian) {
		this.wuzitupian = wuzitupian;
	}
	
	/**
	 * 获取：物资图片
	 */
	public String getWuzitupian() {
		return wuzitupian;
	}
				
	
	/**
	 * 设置：物资规格
	 */
	 
	public void setWuziguige(String wuziguige) {
		this.wuziguige = wuziguige;
	}
	
	/**
	 * 获取：物资规格
	 */
	public String getWuziguige() {
		return wuziguige;
	}
				
	
	/**
	 * 设置：物资品牌
	 */
	 
	public void setWuzipinpai(String wuzipinpai) {
		this.wuzipinpai = wuzipinpai;
	}
	
	/**
	 * 获取：物资品牌
	 */
	public String getWuzipinpai() {
		return wuzipinpai;
	}
				
	
	/**
	 * 设置：物资数量
	 */
	 
	public void setWuzishuliang(Integer wuzishuliang) {
		this.wuzishuliang = wuzishuliang;
	}
	
	/**
	 * 获取：物资数量
	 */
	public Integer getWuzishuliang() {
		return wuzishuliang;
	}
				
	
	/**
	 * 设置：物资详情
	 */
	 
	public void setWuzixiangqing(String wuzixiangqing) {
		this.wuzixiangqing = wuzixiangqing;
	}
	
	/**
	 * 获取：物资详情
	 */
	public String getWuzixiangqing() {
		return wuzixiangqing;
	}
			
}
