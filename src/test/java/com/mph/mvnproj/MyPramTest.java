package com.mph.mvnproj;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyPramTest {
	private int x,y,result;
	Calculate calc;
	public MyPramTest(int x, int y, int result) {
		super();
		this.x = x;
		this.y = y;
		this.result = result;
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
	@Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][] {{10,20,30},{20,20,40},{20,70,90},{120,20,140},{1,22,30}});
		
		
	}
	@Test
	public void testSum()
	{
		System.out.print("test result");
		assertEquals(result,calc.add(x,y));
	}
}
