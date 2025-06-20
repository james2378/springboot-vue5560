package com.entity.model;

import com.entity.WuzirukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 物资入库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-06 21:09:06
 */
public class WuzirukuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物资名称
	 */
	
	private String wuzimingcheng;
		
	/**
	 * 物资分类
	 */
	
	private String wuzifenlei;
		
	/**
	 * 物资图片
	 */
	
	private String wuzitupian;
		
	/**
	 * 物资数量
	 */
	
	private Integer wuzishuliang;
		
	/**
	 * 入库日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rukuriqi;
		
	/**
	 * 入库备注
	 */
	
	private String rukubeizhu;
				
	
	/**
	 * 设置：物资名称
	 */
	 
	public void setWuzimingcheng(String wuzimingcheng) {
		this.wuzimingcheng = wuzimingcheng;
	}
	
	/**
	 * 获取：物资名称
	 */
	public String getWuzimingcheng() {
		return wuzimingcheng;
	}
				
	
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
	 * 设置：入库日期
	 */
	 
	public void setRukuriqi(Date rukuriqi) {
		this.rukuriqi = rukuriqi;
	}
	
	/**
	 * 获取：入库日期
	 */
	public Date getRukuriqi() {
		return rukuriqi;
	}
				
	
	/**
	 * 设置：入库备注
	 */
	 
	public void setRukubeizhu(String rukubeizhu) {
		this.rukubeizhu = rukubeizhu;
	}
	
	/**
	 * 获取：入库备注
	 */
	public String getRukubeizhu() {
		return rukubeizhu;
	}
			
}
