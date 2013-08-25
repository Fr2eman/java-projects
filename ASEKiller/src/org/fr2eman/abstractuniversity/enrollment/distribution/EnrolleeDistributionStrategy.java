package org.fr2eman.abstractuniversity.enrollment.distribution;

import java.util.Map;

import org.fr2eman.abstractuniversity.enrollment.domain.Specialty;
import org.fr2eman.abstractuniversity.enrollment.domain.StudentList;
import org.fr2eman.abstractuniversity.enrollment.domain.University;
import org.fr2eman.abstractuniversity.enrollment.stream.EnrolleeSource;

public interface EnrolleeDistributionStrategy {

	Map<Specialty, StudentList> distribution(EnrolleeSource source, University univer);	
}
