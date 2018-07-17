package com.capg.bean;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountDetailsTest {
	AccountDetails details = new AccountDetails();

	@Test
	public void testGetUsername() {
		details.setUserName("Aman");
		assertEquals("Aman", details.getUserName());
		assertTrue("aman".equalsIgnoreCase(details.getUserName()));
		assertFalse("Anant".equalsIgnoreCase(details.getUserName()));
		assertFalse("Atharv".equalsIgnoreCase(details.getUserName()));
		

		
	}

	@Test
	public void testGetPassword() {
		details.setPassword("Ananth");
		assertEquals("Ananth", details.getPassword());
		assertTrue("Ananth".equalsIgnoreCase(details.getPassword()));
		//assertNull(" ".equalsIgnoreCase(details.getPassword()));
		
	}

	@Test
	public void testGetBankAccount() {
		details.setBankAccount(10000);
		assertFalse(89565 == details.getBankAccount());
		assertFalse(56464 == details.getBankAccount());
		assertFalse(141456464 == details.getBankAccount());
		assertTrue(10000==details.getBankAccount());

		
	}
	@Test
	public void testGetBankAccount2() {
		details.setBankAccount2(200000);
		assertTrue(200000 == details.getBankAccount2());
		assertFalse(56464 == details.getBankAccount2());
		assertFalse(141456464 == details.getBankAccount2());

		
	}
	@Test
	public void testGetAmount() {
		details.setAmount(10000);
		assertTrue(10000 == details.getAmount());
		assertFalse(543 == details.getAmount());
		assertFalse(141456464 == details.getAmount());

		
	}
   public void testTransactionId()
   {
	   details.setTransactionId(48787);
	   assertTrue(48787 == details.getTransactionId());
		assertFalse(543 == details.getTransactionId());
		assertFalse(141456464 == details.getTransactionId());
	   
   }

}
