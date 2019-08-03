package ui;
import service.*;

import java.util.Scanner;
import service.*;
import bean.*;
import service.*;

public class Main {
	public static void main(String args[])
	{
		CustomerService cs=new CustomerService();
		Scanner sc=new Scanner(System.in);
		int ch;
		String s="";
		do{
			
			System.out.println("[1] Create Acount");
			System.out.println("[2] Show Balance");
			System.out.println("[3] Deposite Amount");
			System.out.println("[4] Withdraw amount");
			System.out.println("[5] Transfer Amount");
			System.out.println("[6] Print Transaction");
			System.out.println("Enter your choice");
			
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter the customer name: ");
					String cname=sc.next();
					System.out.println("Enter the customer address: ");
					String address=sc.next();
					System.out.println("Enter the customer contact number: ");
					long phn=sc.nextLong();
					System.out.println("Enter the customer mail id: ");
					String mail=sc.next();
					Customer cus=new Customer(cname, address, phn, mail);
					Account account=new Account(cus);
					CustomerService cservice=new CustomerService();
					cservice.createAccount(account.getAccountNo(), account);
					break;
					
				case 2:
					System.out.println("Enter your account no:");
					long ac=sc.nextLong();
					Account a1=cs.getAccountService(ac);
					System.out.println("Account no: "+a1.getAccountNo());
					System.out.println("Balance: "+a1.getBalance());
					//System.out.println(a1);
					break;
				case 3:
					CustomerService empserv=new CustomerService();
					System.out.println("Enter the amount u want to deposite");
					double amount=sc.nextDouble();
					
					empserv.depositeAmount(amount);
					break;
				case 4:
					break;
				default:	
					System.out.println("Invalid choice");
			}
			
			System.out.println("Do you want to continue..??");
			s=sc.next();
		}while(s.equals("y")||s.equals("Y"));
		
	}

}
