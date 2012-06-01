package com.om.portal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.om.entity.AccountSale;

public interface AccountSaleDao extends
		PagingAndSortingRepository<AccountSale, Long> {
}
