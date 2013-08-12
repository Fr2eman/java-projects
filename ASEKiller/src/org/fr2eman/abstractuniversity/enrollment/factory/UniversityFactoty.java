package org.fr2eman.abstractuniversity.enrollment.factory;

import java.util.HashSet;
import java.util.Set;

import org.fr2eman.abstractuniversity.enrollment.domain.Faculty;
import org.fr2eman.abstractuniversity.enrollment.domain.Specialty;
import org.fr2eman.abstractuniversity.enrollment.domain.University;

public class UniversityFactoty {
	public enum Universities {
		BSUIR, BSU, BNTU
	}

	private static UniversityFactoty instance;

	public University getUniversity(Universities u) {
		University univer = null;
		if (u == Universities.BSUIR) {
			univer = new University("БГУИР");
			Specialty s = null;
			Set<Faculty> faculies = new HashSet<Faculty>();
			Faculty f = new Faculty("Факультет компьютерных систем и сетей");
			s = new Specialty("Программное обеспечение информационных технологий",
					70);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Вычислительные машины, системы и сети", 90);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Информатика и технологии программирования",
					50);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			f = new Faculty("Факультет информационных технологий и управления");
			s = new Specialty("Искусственный интеллект", 50);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Автоматизированные системы обработки информации",
					55);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Информационные технологии и управление в технических системах",
					75);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Промышленная электроника", 30);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			f = new Faculty("Инженерно-экономический факультет");
			s = new Specialty(
					"Информационные системы и технологии(в логистике)",
					25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Информационные системы и технологии(в экономике)",
					60);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Электронный маркетинг", 15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Экономика электронного бизнеса", 15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			f = new Faculty("Факультет компьютерного проектирования");
			s = new Specialty(
					"Инженерно-психологическое обеспечение информационных технологий",
					15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Программируемые мобильные системы", 15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Моделирование и компьютерное проектирование радиоэлектронных средств",
					25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Проектирование и производство радиоэлектронных средств",
					25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Медицинская электроника", 20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Электронные системы безопасности", 30);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Электронно-оптические системы и технологии",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Электронные вычислительные средства", 25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Информационные системы и технологии (в обеспечении промышленной безопасности)",
					15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			f = new Faculty("Факультет радиотехники и электроники");
			s = new Specialty("Радиоэлектронные системы", 20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Радиоинформатика", 25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Радиоэлектронная защита информации", 25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Микро- и наноэлектронные технологии и системы", 50);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Квантовые информационные системы", 25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Нанотехнологии и наноматериалы в электронике", 25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Радиотехника(программируемые радиоэлектронные средства)",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Радиотехника(техника цифровой радиосвязи)",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Электронные и информационно-управляющие системы физических установок",
					30);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			f = new Faculty("Факультет телекоммуникаций");
			s = new Specialty(
					"Инфокоммуникационные технологии(системы телекоммуникаций)",
					25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Инфокоммуникационные технологии(сети инфокоммуникаций)",
					15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Инфокоммуникационные технологии(цифровое теле- и радиовещание)",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Инфокоммуникационные технологии(системы распределения мультимедийной информации)",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Инфокоммуникационные технологии(лазерные информационно- измерительные системы)",
					15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"Инфокоммуникационные системы(стандартизация, сертификация и контроль параметров)",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("Защита информации в телекоммуникациях", 20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			univer.setListFaculty(faculies);
		} else if (u == Universities.BSU) {
		} else if (u == Universities.BNTU) {
		}
		return univer;
	}

	public static UniversityFactoty getFactory() {
		return instance;
	}
}
