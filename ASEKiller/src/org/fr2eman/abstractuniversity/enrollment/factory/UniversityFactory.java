package org.fr2eman.abstractuniversity.enrollment.factory;

import org.fr2eman.abstractuniversity.enrollment.domain.University;

public interface UniversityFactory {
	public enum Universities {
		BSUIR, BSU, BNTU
	}

	public University getUniversity(Universities u);
}
