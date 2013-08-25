package org.fr2eman.abstractuniversity.enrollment;

import java.util.Map;

import org.fr2eman.abstractuniversity.enrollment.distribution.EnrolleeDistribution;
import org.fr2eman.abstractuniversity.enrollment.domain.Enrollee;
import org.fr2eman.abstractuniversity.enrollment.domain.Faculty;
import org.fr2eman.abstractuniversity.enrollment.domain.Specialty;
import org.fr2eman.abstractuniversity.enrollment.domain.StudentList;
import org.fr2eman.abstractuniversity.enrollment.domain.University;
import org.fr2eman.abstractuniversity.enrollment.factory.ConstUniversityFactory;
import org.fr2eman.abstractuniversity.enrollment.factory.UniversityFactory;
import org.fr2eman.abstractuniversity.enrollment.factory.UniversityFactory.Universities;
import org.fr2eman.abstractuniversity.enrollment.factory.XmlUniversityFactory;
import org.fr2eman.abstractuniversity.enrollment.stream.EnrolleeSource;
import org.fr2eman.abstractuniversity.enrollment.stream.FixetEnrolleeSource;

public class Main {
	public static void main(String[] args) {
		UniversityFactory factoty = new XmlUniversityFactory();
		University univer = factoty.getUniversity(Universities.BSUIR);
		
		EnrolleeSource source = new FixetEnrolleeSource(1000, univer);
		EnrolleeDistribution distribute = new EnrolleeDistribution();
		
		Map<Specialty, StudentList> lists = distribute.distribution(source, univer);

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
					System.out.println("Enrollee ¹" + number + " / " + e.getScore());
					number++;
				}
			}
		}
	}
}
