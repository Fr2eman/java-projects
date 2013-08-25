package org.fr2eman.abstractuniversity.enrollment.distribution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fr2eman.abstractuniversity.enrollment.domain.Enrollee;
import org.fr2eman.abstractuniversity.enrollment.domain.Faculty;
import org.fr2eman.abstractuniversity.enrollment.domain.Specialty;
import org.fr2eman.abstractuniversity.enrollment.domain.StudentList;
import org.fr2eman.abstractuniversity.enrollment.domain.University;
import org.fr2eman.abstractuniversity.enrollment.stream.EnrolleeSource;
import org.fr2eman.abstractuniversity.enrollment.stream.NoMoreEnrolleeException;

public class EnrolleeDistribution implements EnrolleeDistributionStrategy {
	
	public Map<Specialty, StudentList> distribution(EnrolleeSource source, University univer) {
		List<Enrollee> list = new ArrayList<Enrollee>();
		try {
			while(source.hasNextEnrollee()) {
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
			index = 0;
			itorator++;
			maxScore = 0;
		} 
		Map<Specialty, StudentList> lists = new HashMap<Specialty, StudentList>();
		for (Faculty f : univer.getListFaculty()) {
			for (Specialty s : f.getSpecialities()) {
				lists.put(s, new StudentList(s, new ArrayList<Enrollee>()));
			}
		}
		distribute:
		for(int i = 0; i < listEnrollee.size(); i++) {
			distribute2:
			for(int j = 0; listEnrollee.get(i).getState().getSpeciality().size() > j; j++) {
				for(int k = 0; k < univer.getListFaculty().size(); k++) {
					if(listEnrollee.get(i).getState().getSpeciality().get(j).getFaculty().equals(univer.getListFaculty().get(k))) {
						for(int h = 0; h < univer.getListFaculty().get(k).getSpecialities().size(); h++) {
							if(listEnrollee.get(i).getState().getSpeciality().get(j).equals(univer.getListFaculty().get(k).getSpecialities().get(h))){
								if(univer.getListFaculty().get(k).getSpecialities().get(h).getPlaceCount() != 0) {
									lists.get(univer.getListFaculty().get(k).getSpecialities().get(h)).getList().add(listEnrollee.get(i));
									univer.getListFaculty().get(k).getSpecialities().get(h).setPlaceCount(univer.getListFaculty().get(k).getSpecialities().get(h).getPlaceCount() - 1);
									continue distribute;
								} else continue distribute2;
							}
						}
					}
				}
			}
		}
		return lists;
	}
	
}