package org.springside.examples.miniweb.dao.account;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springside.examples.miniweb.entity.account.Subject;
import org.springside.modules.test.spring.SpringTxTestCase;


@ContextConfiguration(locations = { "/applicationContext.xml" })
@ActiveProfiles("test")

public class SubjectDaoTest  extends SpringTxTestCase {

	@Autowired
	private SubjectDao subjectDao;

	@Test
	public void deleteGroup() {
		//新增测试权限组并与admin用户绑定.
		Subject subject=new Subject();
		subject.setName("111");
		subject.setSubjects("222");
		subjectDao.save(subject);
		
		List<Subject> groups = (List<Subject>) subjectDao.findAll();
		System.out.println(groups.size());
	}

	public SubjectDao getSubjectDao() {
		return subjectDao;
	}

	public void setSubjectDao(SubjectDao subjectDao) {
		this.subjectDao = subjectDao;
	}
	
	
}
