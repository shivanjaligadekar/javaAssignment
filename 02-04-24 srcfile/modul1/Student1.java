package modul1;

public class Student1 {
	//mv
		int rollNo;
		String name;
		double score;
		//mf
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

}
