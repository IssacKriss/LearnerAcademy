package com.learner_academy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId;
	private String teacherName;
	
//	@ManyToMany
//	@JoinColumn(name = "classId")
//	private List<Classes> clas;
//	
//	@JsonManagedReference	
//	public List<Classes> getClas() {
//		return clas;
//	}
//	public void setClas(List<Classes> clas) {
//		this.clas = clas;
//	}
//	@ManyToMany
//	@JoinColumn(name = "subjectId")
//	private List<Subject> subj;
//	@JsonManagedReference	
//	public List<Subject> getSubj() {
//		return subj;
//	}
//	public void setSubj(List<Subject> subj) {
//		this.subj = subj;
//	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Teacher() {
		
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + "]";
	}
	public Teacher(String teacherName) {
		super();
		this.teacherName = teacherName;
	}
	
	
}
