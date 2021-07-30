package com.mph.mvnproj;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;


public class CalculateTest {
	
	Calculate calc;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
		System.out.println("@Before Class Called");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws java.lang.Exception
	{
		System.out.println("@AfterClass Called");
	}
	
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("@Before Called");
		calc = new Calculate();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		calc=null;
		System.out.println("@After Called");
	}
	
	@Test
	public void testAdd()
	{
		System.out.println("Add Test");
		//assertNotEquals(130,calc.add(10,20,30));
		assertEquals(121,calc.add(100,21));
		
	}
	@Test
	public void testMultiply()
	{
		System.out.println("Multiply Test");
		//assertNotEquals(20,calc.multiply(4,5));
		assertEquals(200,calc.multiply(100,2));
		
	}
	@Rule
	public ExpectedException exception=ExpectedException.none();
	@Test
	public void testDivide()
	{
		System.out.println("Divide Test");
		calc.divide();
		exception.expect(ArithmeticException.class);
		exception.expectMessage("Rule says Dont divide by 0!");
	}
	
	
	
	
	
	
}