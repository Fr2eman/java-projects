package org.fr2eman.abstractuniversity.enrollment.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Asus
 */
public class Faculty {

	private String name;
	private List<Specialty> specialities;
	
	public Faculty(String name) {
		this(name, new ArrayList<Specialty>());
	}
	public Faculty(String name, List<Specialty> specialities) {
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
	public List<Specialty> getSpecialities() {
		return specialities;
	}
	public void setSpecialities(List<Specialty> specialities) {
		this.specialities = specialities;
	}
	public int getPlaceCount() {
		int placeCount = 0;
		for (Specialty s : specialities) {
			placeCount += s.getPlaceCount();
		}
		return placeCount;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Faculty)) return false;
		Faculty faculty = (Faculty)obj;
		return name.equals(faculty.getName());
	} 
}
