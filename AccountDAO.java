package dao;


import java.util.HashMap;
import java.util.Set;

import bean.*;
public class AccountDAO 
{
	static HashMap <Long,Account>hash=new HashMap<Long,Account>();
	
	public void storeAccountsDetails(long ac,Account account1)
	{
		hash.put(ac, account1);
		System.out.println("Account created Successfully...!!");
		System.out.println(hash);
		
	}
	public Account showBal(long ac)
	{
		Set<Long>s=hash.keySet();
		for(long lo:s)
		{
			if(lo==ac)
			{
				return hash.get(lo);
			}
		}
		return null;
		
	}
	
	
}
