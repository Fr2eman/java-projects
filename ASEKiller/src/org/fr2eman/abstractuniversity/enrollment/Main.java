package org.fr2eman.abstractuniversity.enrollment;

import java.util.Map;

import org.fr2eman.abstractuniversity.enrollment.domain.Enrollee;
import org.fr2eman.abstractuniversity.enrollment.domain.EnrolleeDistribution;
import org.fr2eman.abstractuniversity.enrollment.domain.Faculty;
import org.fr2eman.abstractuniversity.enrollment.domain.Specialty;
import org.fr2eman.abstractuniversity.enrollment.domain.StudentList;
import org.fr2eman.abstractuniversity.enrollment.domain.University;
import org.fr2eman.abstractuniversity.enrollment.factory.UniversityFactoty;
import org.fr2eman.abstractuniversity.enrollment.factory.UniversityFactoty.Universities;
import org.fr2eman.abstractuniversity.enrollment.stream.EnrolleeSource;
import org.fr2eman.abstractuniversity.enrollment.stream.FixetEnrolleeSource;

public class Main {
	public static void main(String[] args) {
		
		EnrolleeSource source = new FixetEnrolleeSource(1000);
		EnrolleeDistribution distribute = new EnrolleeDistribution();
		UniversityFactoty factoty = new UniversityFactoty();
		University univer = factoty.getUniversity(Universities.BSUIR);
		
		Map<Specialty, StudentList> lists = distribute.distribution(source, univer);
		// 1. получить список абитуров
		// 2. скормить список распределителю
		// 3. получить список зачисленных
		StudentList listFromSpecialty = null;
		int number = 1;
		System.out.println();
		for (Faculty f: univer.getListFaculty()) {
			System.out.println(f.getName());
			for (Specialty s: f.getSpecialities()) {
				System.out.print("---");
				System.out.println(s.getName());
				listFromSpecialty = lists.get(s);
				for (Enrollee e: listFromSpecialty.getList()) {
					System.out.print("------");
					System.out.println("Enrollee №" + number + " / " + e.getScore());
					number++;
				}
			}
		}
	}
}
