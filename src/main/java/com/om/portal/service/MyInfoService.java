package com.om.portal.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
//默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class MyInfoService {
	private static Logger logger = LoggerFactory.getLogger(MyInfoService.class);
	
}
