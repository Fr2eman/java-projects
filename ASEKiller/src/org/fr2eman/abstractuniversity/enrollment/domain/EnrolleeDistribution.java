package org.fr2eman.abstractuniversity.enrollment.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fr2eman.abstractuniversity.enrollment.stream.EnrolleeSource;
import org.fr2eman.abstractuniversity.enrollment.stream.NoMoreEnrolleeException;

public class EnrolleeDistribution {
	
	private List<StudentList> listDistributedEnrollee;
	
	public List<StudentList> distribution(EnrolleeSource source, University univer) {
		List<Enrollee> list = new ArrayList<Enrollee>();
		try {
			for (int i = 1; i <= 1000; i++) {
				list.add(source.nextEnrollee());
			}
		} catch(NoMoreEnrolleeException e) {
			e.printStackTrace();
		}
		List<Enrollee> listEnrollee = new ArrayList<Enrollee>();
		int maxScore = 0;
		int index = 0;
		int itorator = 0;
		while(list.size() != 0) {
			for(int i = 0; i < list.size(); i++) {
				if(maxScore < list.get(i).getScore()) {
					maxScore = list.get(i).getScore();
					index = i;
				}
			}
			listEnrollee.add(list.get(index));
			list.remove(index);
			itorator++;
			maxScore = 0;
		} 
		for(int i = 0; i < listEnrollee.size(); i++) {
			for(int j = 0; listEnrollee.get(i).getState().getSpeciality().size() > j; j++) {
				for(int k = 0; k < univer.getListFaculty().size(); k++) {
					if(listEnrollee.get(i).getState().getSpeciality().get(j).getFaculty().equals(univer.getListFaculty().get(k))) {
						for(int h = 0; h < univer.getListFaculty().get(k).getSpecialities().size(); h++) {
							if(listEnrollee.get(i).getState().getSpeciality().get(j).equals(univer.getListFaculty().get(k).getSpecialities().get(h))){
								if(univer.getListFaculty().get(k))
							}
						}
					}
				}
			}
		}
		
		Map<Specialty, StudentList> lists = new HashMap<Specialty, StudentList>();
		for (Faculty f : univer.getListFaculty()) {
			for (Specialty s : f.getSpecialities()) {
				lists.put(s, new StudentList(s, new ArrayList<Enrollee>()));
			}
		}
		
		return listDistributedEnrollee;
	}
	
}