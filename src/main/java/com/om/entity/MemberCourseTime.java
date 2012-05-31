package com.om.entity;
 

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springside.examples.miniweb.entity.IdEntity;


@Entity
@Table(name = "t_member_course_time")
public class MemberCourseTime  extends IdEntity {
	 @ManyToOne
	 @JoinColumn(name="member_id")  
	private Member member;
	 @ManyToOne
	 @JoinColumn(name="course_time_id")  
	private CourseTime courseTime;
	private String course_date;
	@Temporal(TemporalType.TIMESTAMP)
	
	private Date op_time;
	private int isontime;
	
	
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public CourseTime getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(CourseTime courseTime) {
		this.courseTime = courseTime;
	}
	public String getCourse_date() {
		return course_date;
	}
	public void setCourse_date(String course_date) {
		this.course_date = course_date;
	}
	public Date getOp_time() {
		return op_time;
	}
	public void setOp_time(Date op_time) {
		this.op_time = op_time;
	}
	public int getIsontime() {
		return isontime;
	}
	public void setIsontime(int isontime) {
		this.isontime = isontime;
	}
	
	
}

 