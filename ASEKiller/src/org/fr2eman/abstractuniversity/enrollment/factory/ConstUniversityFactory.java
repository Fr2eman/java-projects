package org.fr2eman.abstractuniversity.enrollment.factory;

import java.util.ArrayList;
import java.util.List;

import org.fr2eman.abstractuniversity.enrollment.domain.Faculty;
import org.fr2eman.abstractuniversity.enrollment.domain.Specialty;
import org.fr2eman.abstractuniversity.enrollment.domain.University;

public class ConstUniversityFactory implements UniversityFactory {

	private static ConstUniversityFactory instance;

	public University getUniversity(Universities u) {
		University univer = null;
		if (u == Universities.BSUIR) {
			univer = new University("�����");
			Specialty s = null;
			List<Faculty> faculies = new ArrayList<Faculty>();
			Faculty f = new Faculty("��������� ������������ ������ � �����");
			s = new Specialty("����������� ����������� �������������� ����������",
					70);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("�������������� ������, ������� � ����", 90);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("����������� � ���������� ����������������",
					50);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			f = new Faculty("��������� �������������� ���������� � ����������");
			s = new Specialty("������������� ���������", 50);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("������������������ ������� ��������� ����������",
					55);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"�������������� ���������� � ���������� � ����������� ��������",
					75);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("������������ �����������", 30);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			f = new Faculty("���������-������������� ���������");
			s = new Specialty(
					"�������������� ������� � ����������(� ���������)",
					25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"�������������� ������� � ����������(� ���������)",
					60);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("����������� ���������", 15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("��������� ������������ �������", 15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			f = new Faculty("��������� ������������� ��������������");
			s = new Specialty(
					"���������-��������������� ����������� �������������� ����������",
					15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("��������������� ��������� �������", 15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"������������� � ������������ �������������� ���������������� �������",
					25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"�������������� � ������������ ���������������� �������",
					25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("����������� �����������", 20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("����������� ������� ������������", 30);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("����������-���������� ������� � ����������",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("����������� �������������� ��������", 25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"�������������� ������� � ���������� (� ����������� ������������ ������������)",
					15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			f = new Faculty("��������� ������������ � �����������");
			s = new Specialty("���������������� �������", 20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("����������������", 25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("���������������� ������ ����������", 25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"�����- � ��������������� ���������� � �������", 50);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("��������� �������������� �������", 25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"�������������� � ������������� � �����������", 25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"������������(��������������� ���������������� ��������)",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("������������(������� �������� ����������)",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"����������� � �������������-����������� ������� ���������� ���������",
					30);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			f = new Faculty("��������� ����������������");
			s = new Specialty(
					"�������������������� ����������(������� ����������������)",
					25);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"�������������������� ����������(���� ����������������)",
					15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"�������������������� ����������(�������� ����- � ������������)",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"�������������������� ����������(������� ������������� �������������� ����������)",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"�������������������� ����������(�������� �������������- ������������� �������)",
					15);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty(
					"�������������������� �������(��������������, ������������ � �������� ����������)",
					20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			s = new Specialty("������ ���������� � �����������������", 20);
			f.getSpecialities().add(s);
			s.setFaculty(f);
			faculies.add(f);

			univer.setListFaculty(faculies);
		} else if (u == Universities.BSU) {
		} else if (u == Universities.BNTU) {
		}
		return univer;
	}

	public static ConstUniversityFactory getFactory() {
		return instance;
	}
}
