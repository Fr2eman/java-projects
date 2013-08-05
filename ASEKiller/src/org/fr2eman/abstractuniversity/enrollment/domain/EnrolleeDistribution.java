package org.fr2eman.abstractuniversity.enrollment.domain;

import java.util.ArrayList;
import java.util.List;

import org.fr2eman.abstractuniversity.enrollment.stream.EnrolleeSource;
import org.fr2eman.abstractuniversity.enrollment.stream.NoMoreEnrolleeException;

public class EnrolleeDistribution {
	
	private List<StudentList> listDistributedEnrollee;
	
	public List<StudentList> distribution(EnrolleeSource source) {
		List<Enrollee> listEnrollee = new ArrayList<Enrollee>();
		try {
			for (int i = 1; i <= 1000; i++) {
				listEnrollee.add(source.nextEnrollee());
			}
		} catch(NoMoreEnrolleeException e) {
			e.printStackTrace();
		}
		
		return listDistributedEnrollee;
	}
	
}