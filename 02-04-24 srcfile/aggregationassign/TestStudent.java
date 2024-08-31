package aggregationassign;

public class TestStudent {

	public static void main(String[] args) {
		Address a2=new Address("pune", "mh", 412306);
		Address a3=new Address("mumbai", "mh", 412307);
		
	    Name n1=new Name("shiva", "bhhdf", "gade");
	    Name n2=new Name("visha", "bhhdf", "gade");
	    
	    Student s1=new Student(1, n2, a2, 88.8);
	    Student s2=new Student(2, n1, a3, 88.6);
	    
	    s1.display();
	    s2.display();
	    
		

	}

}
