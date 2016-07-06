package com.zqs.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.druid.util.StringUtils;
import com.zqs.aop.dataSource.DBContextHolder;
import com.zqs.model.domain.DomainUrl;
import com.zqs.service.domain.IDomainUrlService;
import com.zqs.util.ApplicationContextHolder;
/**
 * 泛域名解析过滤器
 *
 * @author: qiushi.zhou
 * @since: 2016年7月4日下午2:26:02
 */
public class DomainFilter implements Filter {
	
	
	private static String DOMAIN = "domain";
	protected String context = "";
	private static String INDEX_URL = "www.zqs.com:8080/portal-web/admin/login";
	
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.context = arg0.getInitParameter(DOMAIN);
	}
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
 		//获取域名
		String serverName = request.getServerName();
		if(serverName.equals(context)){
			arg2.doFilter(request, response);
			return;
		}else{
			String realName = handleDomain(serverName);
			if(!StringUtils.isEmpty(realName)){
				//验证是否存在
				IDomainUrlService domainUrlService = (IDomainUrlService) ApplicationContextHolder.getBean("domainUrlService");
				DomainUrl domainUrl = domainUrlService.loadByName(realName);
				if(domainUrl != null){
					//切换数据源
				}else{
					response.sendRedirect(INDEX_URL);
				}
			}else{
				response.sendRedirect(INDEX_URL);
			}
		}
		
		//获取请求路径
//		String requestUrl = request.getRequestURI();
		
	}

	
	
	@Override
	public void destroy() {

	}
	
	private String handleDomain(String serverName){
		String name = null;
		if(!StringUtils.isEmpty(serverName)){
			String temp[] = serverName.split(".");
			if(temp.length == 4){
				name = temp[1];
			}
		}
		return name;
	}

}
