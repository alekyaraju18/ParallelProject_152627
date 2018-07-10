package com.capg.bean;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.junit.Test;

import junit.framework.TestCase;

public class CustomerDetailsTest extends TestCase {
	CustomerDetails details=new CustomerDetails();
	@Test
	public void testGetName() {
		details.setUsername("Anant");
		assertEquals("Anant",details.getUsername());
		assertTrue("Anant".equals(details.getUsername()));
		assertFalse("Aman".equals(details.getUsername()));
		assertFalse("gfdfg".equals(details.getUsername()));
		//fail("Not yet implemented");
	}

	@Test
	public void testGetPhoneNo() {
		details.setPhoneNo("9876543210");
		assertFalse("986457310".equals(details.getPhoneNo()));
		assertFalse("9864574310".equals(details.getPhoneNo()));
		assertFalse(" ".equals(details.getPhoneNo()));
		assertTrue("9876543210".equals(details.getPhoneNo()));
		//fail("Not yet implemented");
	}

	@Test
	public void testGetEmail() {
		details.setEmail("Anant@gmail.com");
		assertEquals("Anant@gmail.com",details.getEmail());
		assertFalse("Aman@gmail.com".equals(details.getEmail()));
		assertTrue("Anant@gmail.com".equals(details.getEmail()));
		assertFalse("Amangmail.com".equals(details.getEmail()));
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAge() {
		details.setAge(18);
		assertEquals(18,18);
		assertEquals(18,details.getAge());
		assertNotSame(21,details.getAge());
		assertNotSame(0,details.getAge());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetUsername() {
		details.setUsername("Amarnath");
		assertEquals("Amarnath",details.getUsername());
		assertFalse("Ananthu".equalsIgnoreCase(details.getUsername()));
		assertFalse("Aman".equalsIgnoreCase(details.getUsername()));
		assertFalse("Anant".equalsIgnoreCase(details.getUsername()));
		
		//fail("Not yet implemented");
	}

	@Test
	public void testGetPassword() {
		details.setPassword("ananth");
		assertEquals("ananth",details.getPassword());
		assertFalse("Ananthu".equalsIgnoreCase(details.getPassword()));
		assertFalse("Ananthu".equalsIgnoreCase(details.getPassword()));
		assertNull(" ".equalsIgnoreCase(details.getPassword()));
		//fail("Not yet implemented");
	}

	@Test
	public void testGetGender() {
		details.setGender("Female");
		assertFalse("male".equalsIgnoreCase(details.getGender()));
		assertFalse("female".equalsIgnoreCase(details.getGender()));
		assertEquals("male",details.getGender());
		assertEquals("female",details.getGender());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAccNo() {
			details.setAccNo(10000);
		assertFalse(89565==details.getAccNo());
		assertFalse(56464==details.getAccNo());
		assertFalse(141456464==details.getAccNo());
		assertTrue(10000==details.getAccNo());
		//fail("Not yet implemented");
	}

}
