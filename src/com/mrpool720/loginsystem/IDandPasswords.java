package com.mrpool720.loginsystem;

import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	IDandPasswords() {
		loginInfo.put("pizza", "cheese");
		loginInfo.put("mrpool", "720");
		loginInfo.put("Steve", "!jobs");
	}
	
	protected HashMap getLoginInfo() {
		return loginInfo;
	}
}
