package aggregationassign;

public class Student {
	private int rollNo;
	private Name name;
	private Address address;
	private double score;
	public Student(int rollNo, Name name, Address address, double score) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", score=" + score + "]";
	}
	
	public void display() {
		System.out.println("Rollno is"+rollNo);
		System.out.println("Student name is"+name);
		System.out.println("address is"+address);
		System.out.println("Total Score is"+score);
	}
	

}
