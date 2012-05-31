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
@Table(name = "t_course_time")
public class CourseTime  extends IdEntity {
 private String name;
 @ManyToOne
 @JoinColumn(name="course_type_id")  	
 private CourseType courseType;
 
 @ManyToOne
 @JoinColumn(name="teacher_id")  	
 private Teacher teacher;
 private String week;
 private String begin_time;
 private String end_time;
 @Temporal(TemporalType.TIMESTAMP)
	
 private Date create_time;
 private int  isactive;
 
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	

public CourseType getCourseType() {
	return courseType;
}
public void setCourseType(CourseType courseType) {
	this.courseType = courseType;
}
public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
public String getWeek() {
	return week;
}
public void setWeek(String week) {
	this.week = week;
}
public String getBegin_time() {
	return begin_time;
}
public void setBegin_time(String begin_time) {
	this.begin_time = begin_time;
}
public String getEnd_time() {
	return end_time;
}
public void setEnd_time(String end_time) {
	this.end_time = end_time;
}
public Date getCreate_time() {
	return create_time;
}
public void setCreate_time(Date create_time) {
	this.create_time = create_time;
}
public int getIsactive() {
	return isactive;
}
public void setIsactive(int isactive) {
	this.isactive = isactive;
}
 
 
 
 
}

 