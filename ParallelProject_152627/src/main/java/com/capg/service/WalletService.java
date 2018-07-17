package com.capg.service;

import com.capg.bean.AccountDetails;
import com.capg.dao.WalletDao;

public class WalletService implements IWalletService {

	WalletDao dao = new WalletDao();

	public boolean createAccount(AccountDetails details) {

		return dao.createAccount(details);
	}

	public AccountDetails showBalance(AccountDetails details) {

		return dao.showBalance(details);
	}

	public AccountDetails depositBalance(double deposit, AccountDetails details) {

		return dao.depositBalance(deposit, details);

	}

	public AccountDetails withdrawBalance(double withdraw, AccountDetails details) {

		return dao.withdrawBalance(withdraw, details);
	}

	public AccountDetails transferFund(long bankaccount2, double amount, AccountDetails details) {

		return dao.transferFund(bankaccount2, amount, details);

	}

	public AccountDetails printTransaction() {

		return dao.printTransaction();

	}

}
