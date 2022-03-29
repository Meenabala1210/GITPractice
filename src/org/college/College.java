package org.college;

public class College {
	private void collegeName() {
		System.out.println("SIET Colg");
	}
	private void collegeCode() {
		System.out.println("code 1234");
	}
	private void collegeRank() {
		System.out.println("colg rank 1");
	}
	public static void main(String[] args) {
		College c=new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		Student s=new Student();
		s.studentName();
		s.studentId();
		s.studentDept();
		Hostel h=new Hostel();
		h.hostelName();
		Dept d=new Dept();
		d.deptName();
	}
}
