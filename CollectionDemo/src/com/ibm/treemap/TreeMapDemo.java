package com.ibm.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String,String> accounts = new TreeMap<String, String>();
		accounts.put("1","Account 1");
		accounts.put("2", "Account 2");
		System.out.println(accounts);
	}

}
