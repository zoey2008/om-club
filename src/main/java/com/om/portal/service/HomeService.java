package com.om.portal.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.om.entity.Member;
import com.om.portal.dao.MemberCourseTimeDao;
import com.om.portal.dao.MemberDao;


 
@Component
//默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class HomeService {
	private static Logger logger = LoggerFactory.getLogger(HomeService.class);
	@Autowired
	private MemberCourseTimeDao memberCourseTimeDao;
	@Autowired
	private MemberDao memberDao;
	
	
	
	public List<Member> getMemberAllList(){
		return (List<Member>) memberDao.findAll();
	}
	

}
