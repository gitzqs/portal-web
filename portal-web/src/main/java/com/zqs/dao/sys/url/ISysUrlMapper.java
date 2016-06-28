package com.zqs.dao.sys.url;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zqs.model.sys.url.SysUrl;
@Repository
public interface ISysUrlMapper {
	
	/**
	 * 根据level查询
	 * 
	 * @return: List<SysUrl>
	 * @author: qiushi.zhou
	 * @since: 2016年6月24日下午3:02:10
	 */
	List<SysUrl> loadByLevel(int level);
	
	/**
	 * 根据highId查询
	 * 
	 * @return: List<SysUrl>
	 * @author: qiushi.zhou
	 * @since: 2016年6月24日下午3:02:37
	 */
	List<SysUrl> loadByHighId(Long highId);
	
	/**
	 * 分页查询
	 * 
	 * @return: List<SysUrl>
	 * @author: qiushi.zhou
	 * @since: 2016年6月28日上午10:15:01
	 */
	List<Map<String,Object>> page(Map<String,Object> params);
	
	/**
	 * 计算总数
	 * 
	 * @return: Long
	 * @author: qiushi.zhou
	 * @since: 2016年6月28日上午10:23:55
	 */
	Long total(Map<String,Object> params);
}
