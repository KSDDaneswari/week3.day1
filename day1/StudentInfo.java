package week3.day1;

public class StudentInfo {

	
	public void getStudentInfo(int id) {
		System.out.println("enter the student id as 5678");
	}
	
	public void getStudentInfo(int id, String Name) {
		System.out.println("entering the id and Name");
		System.out.println("Name hamsa");
		System.out.println("id : 7576");
	}
	
	public void getStudentInfo(String email, int phno) {
		System.out.println("phno ius 97965763432");
		System.out.println("abc@abc.com");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo info = new StudentInfo();
		
		info.getStudentInfo(0);
		info.getStudentInfo(0, null);
		info.getStudentInfo(null,0);
		
		
	}

}
