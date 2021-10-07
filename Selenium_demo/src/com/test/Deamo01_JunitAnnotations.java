package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Deamo01_JunitAnnotations {

	@BeforeClass
	public static void BeforeClass() {
		System.out.println("Inside the BeforeClass method");
	}
	@Before
	public void Before() {
		System.out.println("Inside the Before method");
	}
	
	@Test
	public void test() {
		System.out.println("Inside the test method");
	}
	
	@After
	public void After() {
		System.out.println("Inside the After method");
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("Inside the AfterClass method");
	}

}
