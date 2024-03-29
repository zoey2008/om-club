package org.springside.examples.miniweb.entity.account;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.google.common.collect.Lists;
import com.om.framework.entity.IdEntity;

/**
 * 权限组.
 * 
 * 注释见{@link User}.
 * 
 * @author calvin
 */
@Entity
@Table(name = "acct_group")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class Group extends IdEntity {

	@Column(nullable = false, unique = true)
	
	private String name;
	
	@ElementCollection
	@CollectionTable(name = "acct_group_permission", joinColumns = { @JoinColumn(name = "group_id") })
	@Column(name = "permission")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

	private List<String> permissionList = Lists.newArrayList();

	public Group() {
	}

	public Group(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		public List<String> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(List<String> permissionList) {
		this.permissionList = permissionList;
	}

	@Transient
	public String getPermissionNames() {
		List<String> permissionNameList = Lists.newArrayList();
		for (String permission : permissionList) {
			permissionNameList.add(Permission.parse(permission).displayName);
		}
		return StringUtils.join(permissionNameList, ",");
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
