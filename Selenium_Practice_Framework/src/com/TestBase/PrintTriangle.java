package com.TestBase;

import org.testng.annotations.Test;

public class PrintTriangle {

	@Test
	public void test2()
	{
		
	int count=1;	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(count+" ");
			count=count+1;
		}
		System.out.println();
		
	}
	}
	
	
}
