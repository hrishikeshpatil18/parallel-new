package bean;
public class Customer 
{
	String custname;
	String custaddress;
	long custphnNo;
	String custmail;
	
	
	public Customer(String custname, String custaddress, long custphnNo, String custmail) {
		super();
		this.custname = custname;
		this.custaddress = custaddress;
		this.custphnNo = custphnNo;
		this.custmail = custmail;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustaddress() {
		return custaddress;
	}

	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}

	public long getCustphnNo() {
		return custphnNo;
	}

	public void setCustphnNo(long custphnNo) {
		this.custphnNo = custphnNo;
	}

	public String getCustmail() {
		return custmail;
	}

	public void setCustmail(String custmail) {
		this.custmail = custmail;
	}

	@Override
	public String toString() {
		return "Customer [custname=" + custname + ", custaddress=" + custaddress + ", custphnNo=" + custphnNo
				+ ", custmail=" + custmail + "]";
	}
	
}
