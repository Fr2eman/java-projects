package org.fr2eman.abstractuniversity.enrollment.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.fr2eman.abstractuniversity.enrollment.domain.Faculty;
import org.fr2eman.abstractuniversity.enrollment.domain.Specialty;
import org.fr2eman.abstractuniversity.enrollment.domain.Statement;
import org.fr2eman.abstractuniversity.enrollment.domain.University;

public class RandomFacultyAndSpecialty {
	
	Random random = new Random();
	University univer = null;
	Statement stat = null;
	int fac = 0;
	int spec = 0;
	List<Faculty> listFacultys = null;
	List<Specialty> listSpecialtys = null;
	List<Specialty> randomSpecialtys = new ArrayList<Specialty>();
	
	public Statement buildStatement(University univer) {
		int numbSpecialtys = random.nextInt(6);
		numbSpecialtys++;
		for (int i = 1; i <= numbSpecialtys; i++) {
			fac = random.nextInt((univer.getListFaculty().size()));
			List<Faculty> listFacultys = new ArrayList<Faculty>(univer.getListFaculty());
			spec = random.nextInt((listFacultys.get(fac).getSpecialities().size()));
			listSpecialtys = new ArrayList<Specialty>(listFacultys.get(fac).getSpecialities());
			randomSpecialtys.add(listSpecialtys.get(spec));
			if(i == 1) {
				System.out.print(listSpecialtys.get(spec).getName());
			} else {
				System.out.print(" --> " + listSpecialtys.get(spec).getName());
			}
		}
		return new Statement(randomSpecialtys);
	}
	
}
