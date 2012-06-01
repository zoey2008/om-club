package com.om.portal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.om.entity.CourseTime;

public interface CourseTimeDao extends
		PagingAndSortingRepository<CourseTime, Long> {

}
