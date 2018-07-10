package com.capg.dao;

import com.capg.bean.CustomerDetails;

public interface IWalletDao {
public boolean createAccount(CustomerDetails details);
public boolean login(CustomerDetails details);
public boolean deposit();
public boolean withdraw();
public void showBalance();
public void printTransactions();

}
