package com.mph.mvnproj;

public class Calculate {
	public int add(int...num)
	{
		int result=0;
		
		for(int i:num) {
			result+=i;
		}
		return result;
	}
	public int multiply(int ...mul)
	{
		int rs=1;
		for(int i:mul)
		{
			rs*=i;
		}
		return rs;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c=new Calculate();
		System.out.println(c.add(10,10));
		System.out.println(c.add(10,10,10));
		System.out.println(c.add(10,10,10,10));
		System.out.println(c.multiply(20,2));
		System.out.println(c.multiply(20,2,3));
		System.out.println(c.divide());
	}
	public int divide() throws ArithmeticException {
		// TODO Auto-generated method stub
		int z=1/1;
		return  z;
		
	}

}
