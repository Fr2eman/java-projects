package org.fr2eman.abstractuniversity.enrollment.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.fr2eman.abstractuniversity.enrollment.domain.Faculty;
import org.fr2eman.abstractuniversity.enrollment.domain.Specialty;
import org.fr2eman.abstractuniversity.enrollment.domain.Statement;
import org.fr2eman.abstractuniversity.enrollment.domain.University;
import org.fr2eman.abstractuniversity.enrollment.factory.UniversityFactoty;
import org.fr2eman.abstractuniversity.enrollment.factory.UniversityFactoty.Universities;

public class RandomFacultyAndSpecialty {
	
	Random random = new Random();
	UniversityFactoty univerFacktory = new UniversityFactoty();
	University univer = null;
	Statement stat = null;
	int fac = 0;
	int spec = 0;
	List<Faculty> listFacultys = null;
	List<Specialty> listSpecialtys = null;
	List<Specialty> randomSpecialtys = new ArrayList<Specialty>();
	public Statement setStatement() {
		int numbSpecialtys = random.nextInt(6);
		numbSpecialtys++;
		for (int i = 1; i <= numbSpecialtys; i++) {
			univer = univerFacktory.getUniversity(Universities.BSUIR);
			fac = random.nextInt((univer.getListFaculty().size()) - 1);
			List<Faculty> listFacultys = new ArrayList<Faculty>(univer.getListFaculty());
			spec = random.nextInt((listFacultys.get(fac).getSpecialities().size()) - 1);
			listSpecialtys = new ArrayList<Specialty>(listFacultys.get(fac).getSpecialities());
			randomSpecialtys.add(listSpecialtys.get(spec));
		}
		return new Statement(randomSpecialtys);
	}
	
}
