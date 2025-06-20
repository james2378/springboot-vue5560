package com.entity.view;

import com.entity.WuzishenlingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物资申领
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-06 21:09:06
 */
@TableName("wuzishenling")
public class WuzishenlingView  extends WuzishenlingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuzishenlingView(){
	}
 
 	public WuzishenlingView(WuzishenlingEntity wuzishenlingEntity){
 	try {
			BeanUtils.copyProperties(this, wuzishenlingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
