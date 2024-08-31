package modul5;

public class Customer {
	private int custId;
	private String custName;
	private String addr;
	
	public Customer() {
		custId=3;
		custName="rani";
		addr="CDAC";
	}
	public Customer(int custId,String custName,String addr) {
		this.custId=custId;
		this.custName=custName;
		this.addr=addr;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", addr=" + addr + "]";
	}
	

}
