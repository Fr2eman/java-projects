package org.fr2eman.abstractuniversity.enrollment.stream;

import java.util.Random;

import org.fr2eman.abstractuniversity.enrollment.domain.Enrollee;
import org.fr2eman.abstractuniversity.enrollment.domain.University;

public class FixetEnrolleeSource implements EnrolleeSource {
	
	private Random random = new Random();
	private int eCount;
	private University univer;
	int i = 0;
	
	public FixetEnrolleeSource(int eCount, University univer) {
		this.eCount = eCount;
		this.univer = univer;
	}
	
	public Enrollee nextEnrollee() {
		int scor = 0;
		boolean inQ = false;
		if (i < eCount) {
			i++;
			int cert = random.nextInt(50) + 50;
			int phys = random.nextInt(85) + 15;
			int math = random.nextInt(85) + 15;
			int lang = random.nextInt(90) + 10;
			inQ = random.nextBoolean();
			scor = cert + phys + math + lang;
			System.out.println();
			System.out.print("Enrollee " + scor + " : ");
			
			RandomFacultyAndSpecialty randomStatement = new RandomFacultyAndSpecialty();
			Enrollee enroll = new Enrollee(scor, randomStatement.buildStatement(univer), inQ);
			
			return enroll;
		} else throw new NoMoreEnrolleeException();
	}
	
	@Override
	public boolean hasNextEnrollee() {
		if(i < eCount) {
			return true;
		} else return false;
	}
}
