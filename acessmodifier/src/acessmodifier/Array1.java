package acessmodifier;

import java.util.*;
	 public class Array1
     {
   	  public static void main(String[] args) {
   		  
   		  String[] name = new String[5];
   		  
			Account[] accounts = new Account[5];
			for(int i = 0; i<5;i++)
			{
			 accounts[i] = new Account("Ram"+i, i*1500.5f);
			}
			List<Account> accounts =  new ArrayList<Account>();
			for(int i=0;i<accounts.length;i++) {
				
		}
     }
}
