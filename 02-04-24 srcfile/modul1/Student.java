package modul1;

public class Student {
	//mv
	int rollNo;
	String name;
	double score;
	//mf
	public
	void markAttendance() {
		System.out.println("marking the attendence");
	}
	void checkResult(){
		System.out.println("checking for the result");
	}
	void apperExam() {
		System.out.println("appearing the exam");
	}
	void display() {
		System.out.println("rollno is"+rollNo);
		System.out.println("Name is"+name);
		System.out.println("Score is"+score);
	}

	public static void main(String[] args) {
		//1st obj
		Student student=new Student();
		student.rollNo=1;
		student.name="shiv";
		student.score=80;
		
		System.out.println("calling method");
		student.display();
		student.markAttendance();
		student.apperExam();
		System.out.println("---------------------------------------");
		
		//2nd obj
		Student student1=new Student();
		student1.rollNo=2;
		student1.name="raj";
		student1.score=88;
		
		
		System.out.println("calling method");
		student1.display();
		student1.markAttendance();
		student1.apperExam();
		System.out.println("---------------------------------------");
		
		//3rd obj
		Student student3=new Student();
		student3.rollNo=3;
		student3.name="priya";
		student3.score=90;
		
		System.out.println("calling method");
		student3.display();
		student3.markAttendance();
		student3.apperExam();
		
		
		
	}

}
