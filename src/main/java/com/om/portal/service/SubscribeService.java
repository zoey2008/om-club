package com.om.portal.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
//默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class SubscribeService {
	private static Logger logger = LoggerFactory.getLogger(SubscribeService.class);
	
}
