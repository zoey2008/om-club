package com.om.framework.session;

import javax.servlet.http.HttpServletRequest;

public class HttpSessionHelp {

	public static Object getSessionObject(HttpServletRequest request,String sessionName ){	 
		return  request.getSession().getAttribute(sessionName);
	}
	
	public static void setSessionObject(HttpServletRequest request,String sessionName ,Object sessionObject){
		request.getSession().setAttribute(sessionName, sessionObject);
	}
}
