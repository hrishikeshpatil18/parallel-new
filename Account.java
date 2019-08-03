package bean;

enum AccountType{
	SAVING,CURRENT;
}
public class Account 
{
	static int i=0;
	long accountNo=1800500L;
	static String bankName="HDFC";
	static String ifsc="Hdfc190065";
	double balance=0.0;
	Customer customer;
	public Account()
	{
		
	}
	
	public Account(Customer cus) {
		super();
		this.accountNo=accountNo+i;
		Account(accountNo,bankName,ifsc,balance,cus);
		i++;
	}
	
	public void Account(long accountNo, String bankName, String ifsc, double balance, Customer customer) 
	{
		this.accountNo = accountNo;
		this.bankName=bankName;
		this.ifsc=ifsc;
		this.balance = balance;
		this.customer = customer;
		
	}
	
	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + ", customer=" + customer + "]";
	}
	
}
