package org.fr2eman.abstractuniversity.enrollment.stream;

import java.util.Random;

import org.fr2eman.abstractuniversity.enrollment.domain.Enrollee;

public class FixetEnrolleeSource implements EnrolleeSource {
	
	private Random random;
	private int eCount;
	int i = 0;
	public Enrollee nextEnrollee() throws NoMoreEnrolleeException {
		if (i < eCount) {
			i++;
			int scor = random.nextInt(400);
			boolean inQ = random.nextBoolean();
			
			RandomFacultyAndSpecialty randomStatement = new RandomFacultyAndSpecialty();
			Enrollee enroll = new Enrollee(scor, randomStatement.buildStatement(), inQ);
			// TODO создание заявления
			
			return enroll;
		} else throw new NoMoreEnrolleeException();
	}
	public FixetEnrolleeSource(int eCount) {
		this.eCount = eCount;
	}
	
}
