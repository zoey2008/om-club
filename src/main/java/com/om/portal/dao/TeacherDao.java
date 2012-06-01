package com.om.portal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.om.entity.Teacher;

public interface TeacherDao extends PagingAndSortingRepository<Teacher, Long> {

}
