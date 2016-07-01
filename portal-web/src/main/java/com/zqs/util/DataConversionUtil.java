package com.zqs.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtilsBean;

/**
 * 数据转换工具类
 *
 * @author: qiushi.zhou
 * @since: 2016年6月30日下午2:45:36
 */
public class DataConversionUtil {
	
	/**
	 * map转数组
	 * 
	 * @return: Object[]
	 * @author: qiushi.zhou
	 * @since: 2016年6月30日下午3:01:09
	 */
	public static Object[] mapToArray(Map<String,Object> params){
		Object[] object = null;
		if(params !=null && params.size() !=0){
			object = params.values().toArray();
		}
		
		return object;
	}
	
	/**
	 * object 转 String
	 * 
	 * @return: String[]
	 * @author: qiushi.zhou
	 * @since: 2016年6月30日下午3:43:07
	 */
	public static String[] objectToString(Object object[]){
		String[] newString = null;
		if(object !=null && object.length >0){
			newString = new String[object.length];
			for(int i=0;i<object.length; i++){
				newString[i] = String.valueOf(object[i]);
			}
		}
		return newString;
	}
	
	/**
	 * object 转  map
	 * 
	 * @return: LinkedHashMap<String,Object>
	 * @author: qiushi.zhou
	 * @since: 2016年6月30日下午4:15:32
	 */
	public static Map<String,Object> object2Map(Object o){
		Map<String,Object> map = new HashMap<String,Object>();
		PropertyUtilsBean  propertyUtilsBean = new PropertyUtilsBean();
		PropertyDescriptor[] descriptor = propertyUtilsBean.getPropertyDescriptors(o);
		
		for(int i=0; i<descriptor.length; i++){
			String name = descriptor[i].getName();
			if(!"class".equals(name)){
				try {
					map.put(name, propertyUtilsBean.getNestedProperty(o, name));
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				}
			}
		}
		return map;
	}
}
