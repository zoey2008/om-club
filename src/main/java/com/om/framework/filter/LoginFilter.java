package com.om.framework.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.om.framework.session.HttpSessionHelp;

public class LoginFilter implements Filter {

	private static Logger logger = LoggerFactory.getLogger(LoginFilter.class);
	private String[] whiteList;
	protected FilterConfig ftConfig;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.ftConfig = filterConfig;
		whiteList = ftConfig.getInitParameter("whiteList").split(",");
	}

	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/common/loginerr.htm");
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpresponse = (HttpServletResponse) response;
		 
		String requestURI = httpRequest.getRequestURI();
		String contextPath = httpRequest.getContextPath();
		
		logger.debug("requestURI=[{}],contextPath=[{}],whiteList=[{}]",new Object[]{requestURI,contextPath,whiteList});
		boolean hit = false;
		for (String white : whiteList) {
			if ((contextPath + white).equals(requestURI)) {
				hit = true;
				logger.debug("requestURI=[{}],contextPath=[{}],white-hit=[{}]",new Object[]{requestURI,contextPath,white});				
				break;
			}
			
		}

		if (hit) {
			chain.doFilter(request, response);
		} else {
			LoginSO loginObj = null;			
			try {
				loginObj = (LoginSO)HttpSessionHelp.getSessionObject(httpRequest, "LoginSO");
				chain.doFilter(request, response);
			} catch (ClassCastException e) {
				httpresponse.setHeader("Pragma", "No-cache");
				httpresponse.setHeader("Cache-Control", "no-cache");			 
				dispatcher.forward(request, response);
				return;
			}
			
			 
			if(loginObj==null){
				 httpresponse.setHeader("Pragma","No-cache");
				 httpresponse.setHeader("Cache-Control","no-cache");
				 dispatcher.forward(request,response);
				 return;
			 }
		} 
	}

	 
	public void destroy() { 
	}

	public FilterConfig getFtConfig() {
		return ftConfig;
	}

	public void setFtConfig(FilterConfig ftConfig) {
		this.ftConfig = ftConfig;
	}

}