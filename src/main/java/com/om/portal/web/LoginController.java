package com.om.portal.web;

 
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.om.entity.Member;
import com.om.framework.filter.LoginSO;
import com.om.framework.session.HttpSessionHelp;
import com.om.portal.service.HomeService;

/**
 * LoginController负责打开登录页面(GET请求)和登录出错页面(POST请求)，

 * 真正登录的POST请求由Filter完成,
 * 
 * @author calvin
 */
@Controller
public class LoginController {
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private HomeService homeService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String fail(HttpServletRequest request, String username, String password,Model model) {
		//model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, userName);
		LoginSO so=new LoginSO();
		HttpSessionHelp.setSessionObject(request, "LoginSO", so);
		List<Member> a=homeService.getMemberAllList();
		logger.info("---------------"+a.size());
		return "redirect:home";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	

}
