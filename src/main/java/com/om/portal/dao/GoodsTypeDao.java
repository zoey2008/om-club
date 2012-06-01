package com.om.portal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.om.entity.GoodsType;

public interface GoodsTypeDao extends
		PagingAndSortingRepository<GoodsType, Long> {

}
