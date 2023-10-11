package com.mrpool720.loginsystem;

public class Runner {

	public static void main(String[] args) {
		IDandPasswords idAndPass = new IDandPasswords();
		
		LoginPage loginPage = new LoginPage(idAndPass.getLoginInfo());

	}

}
