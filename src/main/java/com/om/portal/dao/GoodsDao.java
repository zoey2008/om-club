package com.om.portal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.om.entity.Goods;

public interface GoodsDao extends PagingAndSortingRepository<Goods, Long> {

}
