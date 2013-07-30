package org.fr2eman.abstractuniversity.enrollment.domain;

import java.util.Date;
import java.util.List;

/**
 * @author Fr2eman
 * Специальность
 */
public class Statement {
	
	private List<Specialty> speciality;
	private Enrollee enrollee;
	private Date date;
	
	public Enrollee getEnrollee() {
		return enrollee;
	}
	public void setEnrollee(Enrollee enrollee) {
		this.enrollee = enrollee;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Specialty> getSpeciality() {
		return speciality;
	}
	public void setSpeciality(List<Specialty> speciality) {
		this.speciality = speciality;
	}
	public Statement(List<Specialty> speciality) {
		super();
		this.speciality = speciality;
	}
	
}
