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
 * 物资入库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-06 21:09:06
 */
@TableName("wuziruku")
public class WuzirukuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WuzirukuEntity() {
		
	}
	
	public WuzirukuEntity(T t) {
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
	 * 入库编号
	 */
					
	private String rukubianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date rukuriqi;
	
	/**
	 * 入库备注
	 */
					
	private String rukubeizhu;
	
	
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
	 * 设置：入库编号
	 */
	public void setRukubianhao(String rukubianhao) {
		this.rukubianhao = rukubianhao;
	}
	/**
	 * 获取：入库编号
	 */
	public String getRukubianhao() {
		return rukubianhao;
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
