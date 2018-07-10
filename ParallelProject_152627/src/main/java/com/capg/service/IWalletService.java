package com.capg.service;

import com.capg.bean.CustomerDetails;

public interface IWalletService {
	
		public boolean createAccount(CustomerDetails details);
		public boolean login(CustomerDetails details);
		public boolean deposit();
		public boolean withdraw();
		public void showBalance();
		public void printTransactions();

}
