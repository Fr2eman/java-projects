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
	public Statement setStatement() {
		univer = univerFacktory.getUniversity(Universities.BSUIR);
		int fac = random.nextInt((univer.getListFaculty().size()) - 1);
		List<Faculty> list = new ArrayList<Faculty>(univer.getListFaculty());
		int spec = random.nextInt((list.get(fac).getNumberSpecialty()) - 1);
		
		return null;
	}
	
}
