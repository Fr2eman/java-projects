package org.fr2eman.abstractuniversity.enrollment.domain;

import java.util.List;

public class StudentList {
	
	private Specialty specialty;
	private List<Enrollee> list;
	
	public StudentList(Specialty specialty, List<Enrollee> list) {
		super();
		this.specialty = specialty;
		this.list = list;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public List<Enrollee> getList() {
		return list;
	}

	public void setList(List<Enrollee> list) {
		this.list = list;
	}
	
}