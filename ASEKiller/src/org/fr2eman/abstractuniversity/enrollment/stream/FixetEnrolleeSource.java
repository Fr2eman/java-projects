package org.fr2eman.abstractuniversity.enrollment.stream;

import java.util.Random;

import org.fr2eman.abstractuniversity.enrollment.domain.Enrollee;

public class FixetEnrolleeSource implements EnrolleeSource {
	
	private Random random = new Random();
	private int eCount;
	int i = 0;
	int math = 0;
	int phys = 0;
	int lang = 0;
	int cert = 0;
	int scor = 0;
	
	public FixetEnrolleeSource(int eCount) {
		this.eCount = eCount;
	}
	
	public Enrollee nextEnrollee() throws NoMoreEnrolleeException {
		scor = 0;
		boolean inQ = false;
		if (i < eCount) {
			i++;
			cert = random.nextInt(50) + 50;
			phys = random.nextInt(85) + 15;
			math = random.nextInt(85) + 15;
			lang = random.nextInt(90) + 10;
			inQ = random.nextBoolean();
			scor = cert + phys + math + lang;
			System.out.println();
			System.out.print("Enrollee " + scor + " : ");
			
			RandomFacultyAndSpecialty randomStatement = new RandomFacultyAndSpecialty();
			Enrollee enroll = new Enrollee(scor, randomStatement.buildStatement(), inQ);
			// TODO создание заявления
			
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
