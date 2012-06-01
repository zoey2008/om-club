package org.springside.examples.miniweb.entity.account;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.om.framework.entity.IdEntity;


@Entity
//表名与类名不相同时重新定义表名.
@Table(name = "acct_subject")
//默认的缓存策略.
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Subject extends IdEntity {
	private String name;
	private String subjects;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
 
	
	

}
