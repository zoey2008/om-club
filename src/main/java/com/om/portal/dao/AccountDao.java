package com.om.portal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.om.entity.Account;

public interface AccountDao extends PagingAndSortingRepository<Account, Long> {
}
