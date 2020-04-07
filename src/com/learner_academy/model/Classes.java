package com.learner_academy.model;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Classes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "classId" , updatable = false, nullable = false)
	private int classId;
	private String className;
	// mapping

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "student_classes" , joinColumns ={ @JoinColumn(name = "classId") } , inverseJoinColumns = { @JoinColumn(name = "studentId") })
	private List<Student> student = new ArrayList<>();
	
	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	@JoinTable(name = "subject_classes" , joinColumns ={ @JoinColumn(name = "classId") } , inverseJoinColumns = { @JoinColumn(name = "subjectId") })
	private List<Subject> subject = new ArrayList<>();
	
	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "teacher_classes" , joinColumns ={ @JoinColumn(name = "classId") } , inverseJoinColumns = { @JoinColumn(name = "teacherId") })
	private List<Teacher> teacher = new ArrayList<>();
		
	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Classes(String className, List<Student> student, List<Subject> subject, List<Teacher> teacher) {
		super();
		this.className = className;
		this.student = student;
		this.subject = subject;
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", className=" + className + ", student=" + student + ", subject="
				+ subject + ", teacher=" + teacher + "]";
	}

	public Classes() {
	
	}


}
