package com.om.portal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.om.entity.AccountType;

public interface AccountTypeDao extends
		PagingAndSortingRepository<AccountType, Long> {

}
