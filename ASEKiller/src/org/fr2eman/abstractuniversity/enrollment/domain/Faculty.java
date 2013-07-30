package org.fr2eman.abstractuniversity.enrollment.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Asus
 */
public class Faculty {

	private String name;
	private Set<Specialty> specialities;
	private int numberSpecialty;
	
	public Faculty(String name) {
		this(name, new HashSet<Specialty>());
	}
	public Faculty(String name, Set<Specialty> specialities) {
		super();
		this.name = name;
		this.specialities = specialities;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Specialty> getSpecialities() {
		return specialities;
	}
	public void setSpecialities(Set<Specialty> specialities) {
		this.specialities = specialities;
	}
	public int getPlaceCount() {
		int placeCount = 0;
		for (Specialty s : specialities) {
			placeCount += s.getPlaceCount();
		}
		return placeCount;
	}
	
}
