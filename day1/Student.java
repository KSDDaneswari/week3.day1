package week3.day1;

public class Student extends Department{

	
	public void studentName() {
		System.out.println("enter the student Name");
	}
	
	public void studentDept() {
		System.out.println("enter the student DepartmentName");
	}
	
	public void studentId() {
		System.out.println("enter the student Id");
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Student stu = new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.departmentName();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
	}

}
