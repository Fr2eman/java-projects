package org.fr2eman.abstractuniversity.enrollment.domain;

public class Specialty {
	
	private Faculty faculty;
	private String code;
	private String name;
	private String description;
	private int placeCount;
	
	public Specialty(String name) {
		this.name = name;
	}
	
	public Specialty(String code, String name, String description,
			int placeCount) {
		this.code = code;
		this.name = name;
		this.description = description;
		this.placeCount = placeCount;
	}
	public Specialty(String name, int placeCount) {
		this.name = name;
		this.placeCount = placeCount;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPlaceCount() {
		return placeCount;
	}
	public void setPlaceCount(int placeCount) {
		this.placeCount = placeCount;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
}
