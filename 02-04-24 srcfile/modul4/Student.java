package modul4;

public class Student {
	private int rollNo;
	private String name;
	private double score;
	
	public Student() {
		System.out.println("this is my default constructor");
		rollNo=0;
		name=" ";
		score=0.0;
	}
	public Student(int rollNo,String name,double score) {
		System.out.println("this is my parameter constructor");
		this.rollNo=rollNo;
		this.name=name;
		this.score=score;
	}
	//getter setter
	
	
//	public void display() {
//		
//		System.out.println("rollno is"+rollNo);
//		System.out.println("name is"+name);
//		System.out.println("score is"+score);
//	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public void markAttendance() {
		System.out.println("marking the attendance");
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", score=" + score + "]";
	}
	

}
