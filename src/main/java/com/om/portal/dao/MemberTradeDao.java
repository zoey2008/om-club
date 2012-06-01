package com.om.portal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.om.entity.MemberTrade;

public interface MemberTradeDao extends
		PagingAndSortingRepository<MemberTrade, Long> {

}
