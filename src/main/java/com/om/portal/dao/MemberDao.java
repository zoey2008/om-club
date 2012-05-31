package com.om.portal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.om.entity.Member;

public interface MemberDao  extends PagingAndSortingRepository<Member, Long> {
}

