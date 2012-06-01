package com.om.portal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.om.entity.CourseType;

public interface CourseTypeDao extends
		PagingAndSortingRepository<CourseType, Long> {

}
