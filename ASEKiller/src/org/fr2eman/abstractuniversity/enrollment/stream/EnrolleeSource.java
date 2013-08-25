package org.fr2eman.abstractuniversity.enrollment.stream;

import org.fr2eman.abstractuniversity.enrollment.domain.Enrollee;

public interface EnrolleeSource {
	
	public Enrollee nextEnrollee() throws NoMoreEnrolleeException;
	public boolean hasNextEnrollee();
}
