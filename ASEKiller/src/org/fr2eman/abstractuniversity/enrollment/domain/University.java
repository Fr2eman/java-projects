package org.fr2eman.abstractuniversity.enrollment.domain;

import java.util.ArrayList;
import java.util.List;

public class University {
	// ���, ��������, ������ �����������
	private String name;
	private String descrition;
	private List<Faculty> listFaculty;
	

	public University(String name) {
		this(name, new ArrayList<Faculty>());
	}
	
	public University(String name, List<Faculty> listFaculty) {
		super();
		this.name = name;
		this.listFaculty = listFaculty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	public List<Faculty> getListFaculty() {
		return listFaculty;
	}
	public void setListFaculty(List<Faculty> listFaculty) {
		this.listFaculty = listFaculty;
	}
}
