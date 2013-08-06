package org.fr2eman.abstractuniversity.enrollment.domain;

import java.util.ArrayList;
import java.util.List;

import org.fr2eman.abstractuniversity.enrollment.stream.EnrolleeSource;
import org.fr2eman.abstractuniversity.enrollment.stream.NoMoreEnrolleeException;

public class EnrolleeDistribution {
	
	private List<StudentList> listDistributedEnrollee;
	
	public List<StudentList> distribution(EnrolleeSource source) {
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
		return listDistributedEnrollee;
	}
	
}