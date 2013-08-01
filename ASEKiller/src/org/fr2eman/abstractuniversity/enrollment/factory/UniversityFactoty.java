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
			univer = new University("�����");

			Set<Faculty> faculies = new HashSet<Faculty>();
			Faculty f = new Faculty("��������� ������������ ������ � �����");
			f.getSpecialities()
					.add(new Specialty(
							"����������� ����������� �������������� ����������",
							70));
			f.getSpecialities().add(
					new Specialty("�������������� ������, ������� � ����", 90));
			f.getSpecialities().add(
					new Specialty("����������� � ���������� ����������������",
							50));
			faculies.add(f);

			f = new Faculty("��������� �������������� ���������� � ����������");
			f.getSpecialities().add(
					new Specialty("������������� ���������", 50));
			f.getSpecialities().add(
					new Specialty(
							"������������������ ������� ��������� ����������",
							55));
			f.getSpecialities()
					.add(new Specialty(
							"�������������� ���������� � ���������� � ����������� ��������",
							75));
			f.getSpecialities().add(
					new Specialty("������������ �����������", 30));
			faculies.add(f);

			f = new Faculty("���������-������������� ���������");
			f.getSpecialities()
					.add(new Specialty(
							"�������������� ������� � ���������� (� ���������)",
							25));
			f.getSpecialities().add(
					new Specialty(
							"�������������� ������� � ����������(� ���������)",
							60));
			f.getSpecialities().add(new Specialty("����������� ���������", 15));
			f.getSpecialities().add(
					new Specialty("��������� ������������ �������", 15));
			faculies.add(f);

			f = new Faculty("��������� ������������� ��������������");
			f.getSpecialities()
					.add(new Specialty(
							"���������-��������������� ����������� �������������� ����������",
							15));
			f.getSpecialities().add(
					new Specialty("��������������� ��������� �������", 15));
			f.getSpecialities()
					.add(new Specialty(
							"������������� � ������������ �������������� ���������������� �������",
							25));
			f.getSpecialities()
					.add(new Specialty(
							"�������������� � ������������ ���������������� �������",
							25));
			f.getSpecialities().add(
					new Specialty("����������� �����������", 20));
			f.getSpecialities().add(
					new Specialty("����������� ������� ������������", 30));
			f.getSpecialities().add(
					new Specialty("����������-���������� ������� � ����������",
							20));
			f.getSpecialities().add(
					new Specialty("����������� �������������� ��������", 25));
			f.getSpecialities()
					.add(new Specialty(
							"�������������� ������� � ���������� (� ����������� ������������ ������������)",
							15));
			faculies.add(f);

			f = new Faculty("��������� ������������ � �����������");
			f.getSpecialities().add(
					new Specialty("���������������� �������", 20));
			f.getSpecialities().add(new Specialty("����������������", 25));
			f.getSpecialities().add(
					new Specialty("���������������� ������ ����������", 25));
			f.getSpecialities()
					.add(new Specialty(
							"�����- � ��������������� ���������� � �������", 50));
			f.getSpecialities().add(
					new Specialty("��������� �������������� �������", 25));
			f.getSpecialities()
					.add(new Specialty(
							"�������������� � ������������� � �����������", 25));
			f.getSpecialities()
					.add(new Specialty(
							"������������(��������������� ���������������� ��������)",
							20));
			f.getSpecialities().add(
					new Specialty("������������(������� �������� ����������)",
							20));
			f.getSpecialities()
					.add(new Specialty(
							"����������� � �������������-����������� ������� ���������� ���������",
							30));
			faculies.add(f);

			f = new Faculty("��������� ����������������");
			f.getSpecialities()
					.add(new Specialty(
							"�������������������� ����������(������� ����������������)",
							25));
			f.getSpecialities()
					.add(new Specialty(
							"�������������������� ����������(���� ����������������)",
							15));
			f.getSpecialities()
					.add(new Specialty(
							"�������������������� ����������(�������� ����- � ������������)",
							20));
			f.getSpecialities()
					.add(new Specialty(
							"�������������������� ����������(������� ������������� �������������� ����������)",
							20));
			f.getSpecialities()
					.add(new Specialty(
							"�������������������� ����������(�������� �������������- ������������� �������)",
							15));
			f.getSpecialities()
					.add(new Specialty(
							"�������������������� �������(��������������, ������������ � �������� ����������)",
							20));
			f.getSpecialities().add(
					new Specialty("������ ���������� � �����������������", 20));
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
