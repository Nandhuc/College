package org.college;

public class Student extends College{
private void studentName() {
System.out.println("Patrick");
}
private void studentDept() {
System.out.println("Civil");
}
private void studentId() {
System.out.println("Student ID is 123456");
}
public static void main(String[] args) {
	Student s = new Student();
	s.studentName();
	s.studentId();
	s.studentDept();
	s.collegeName();
	s.collegeCode();
	s.collegeRank();
	s.hostelName();
	s.deptName();
	
}
}
