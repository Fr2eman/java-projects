package org.fr2eman.abstractuniversity.enrollment;

import java.util.List;

import org.fr2eman.abstractuniversity.enrollment.domain.EnrolleeDistribution;
import org.fr2eman.abstractuniversity.enrollment.domain.StudentList;
import org.fr2eman.abstractuniversity.enrollment.stream.EnrolleeSource;
import org.fr2eman.abstractuniversity.enrollment.stream.FixetEnrolleeSource;

public class Main {
	public static void main(String[] args) {
		
		EnrolleeSource source = new FixetEnrolleeSource(1000);
		EnrolleeDistribution distribute = new EnrolleeDistribution();
		
		List<StudentList> list = distribute.distribution(source);
		// 1. получить список абитуров
		// 2. скормить список распределителю
		// 3. получить список зачисленных
	}
}
