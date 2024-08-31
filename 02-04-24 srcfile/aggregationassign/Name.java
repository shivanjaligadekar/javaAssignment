package aggregationassign;

public class Name {
	private String fname;
	private String mname;
	private String lname;
	
	//cost--para
	public Name(String fname, String mname, String  lname) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Name [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	

}
