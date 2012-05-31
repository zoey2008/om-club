package org.springside.examples.miniweb.dao.account;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springside.examples.miniweb.entity.account.Subject;


public interface SubjectDao extends PagingAndSortingRepository<Subject, Long> {
 

}
