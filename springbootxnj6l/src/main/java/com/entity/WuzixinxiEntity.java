package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 物资信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-06 21:09:06
 */
@TableName("wuzixinxi")
public class WuzixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WuzixinxiEntity() {
		
	}
	
	public WuzixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
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
