package com.zqs.web.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.druid.util.DruidWebUtils;
import com.alibaba.druid.util.PatternMatcher;
import com.alibaba.druid.util.ServletPathMatcher;
import com.zqs.model.sys.member.SysMember;
import com.zqs.service.sys.ISysMemberService;
import com.zqs.util.ApplicationContextHolder;

public class LoginFilter implements Filter{

	private static String NO_CHECK = "noCheck";
	protected String contextPath;
	private Set<String> patternSet;
	protected PatternMatcher pathMatcher  = new ServletPathMatcher();
	
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		String noCheck = arg0.getInitParameter(NO_CHECK);
		this.contextPath = DruidWebUtils.getContextPath(arg0.getServletContext());
		if(noCheck != null && noCheck.trim().length() != 0){
			patternSet = new HashSet<String>(Arrays.asList(noCheck.split("\\s*,\\s*")));
		}
	}
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		
		String requestUrl = request.getRequestURI();
		if(isExclusion(requestUrl)){
			arg2.doFilter(request, response);
			return;
		}
		if(request.getSession().getAttribute("loginName") == null){
			response.sendRedirect(request.getContextPath()+"/admin/login");
		}else{
			ISysMemberService sysMemberSercice = (ISysMemberService)ApplicationContextHolder.getBean("sysMemberSercice");
			SysMember sysMember = sysMemberSercice.loadByLoginName(request.getSession().getAttribute("loginName").toString());
			if(sysMember == null){
				response.sendRedirect(request.getContextPath()+"/admin/login");
			}else{
				arg2.doFilter(request, response);
			}
		}
	}

	
	@Override
	public void destroy() {
		
	}
	
	private boolean isExclusion(String requestURI) {
        if (patternSet == null) {
            return false;
        }

        if (contextPath != null && requestURI.startsWith(contextPath)) {
            requestURI = requestURI.substring(contextPath.length());
            if (!requestURI.startsWith("/")) {
                requestURI = "/" + requestURI;
            }
        }

        for (String pattern : patternSet) {
            if (pathMatcher.matches(pattern, requestURI)) {
                return true;
            }
        }

        return false;
    }

}
