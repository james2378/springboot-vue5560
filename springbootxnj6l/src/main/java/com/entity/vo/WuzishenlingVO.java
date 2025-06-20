package com.entity.vo;

import com.entity.WuzishenlingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 物资申领
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-06 21:09:06
 */
public class WuzishenlingVO  implements Serializable {
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
	 * 申领数量
	 */
	
	private Integer shenlingshuliang;
		
	/**
	 * 申领说明
	 */
	
	private String shenlingshuoming;
		
	/**
	 * 申领日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenlingriqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：申领数量
	 */
	 
	public void setShenlingshuliang(Integer shenlingshuliang) {
		this.shenlingshuliang = shenlingshuliang;
	}
	
	/**
	 * 获取：申领数量
	 */
	public Integer getShenlingshuliang() {
		return shenlingshuliang;
	}
				
	
	/**
	 * 设置：申领说明
	 */
	 
	public void setShenlingshuoming(String shenlingshuoming) {
		this.shenlingshuoming = shenlingshuoming;
	}
	
	/**
	 * 获取：申领说明
	 */
	public String getShenlingshuoming() {
		return shenlingshuoming;
	}
				
	
	/**
	 * 设置：申领日期
	 */
	 
	public void setShenlingriqi(Date shenlingriqi) {
		this.shenlingriqi = shenlingriqi;
	}
	
	/**
	 * 获取：申领日期
	 */
	public Date getShenlingriqi() {
		return shenlingriqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
