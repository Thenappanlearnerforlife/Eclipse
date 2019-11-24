package com.TestBase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class Practice {
	
	
	@Test
	public void Test1() {
		
		String given="Agni";
		StringBuffer buffer=new StringBuffer(given);
		
		System.out.println(buffer.reverse());
		
		System.out.println("Insert:"+buffer.insert(4, "Prasath"));
		System.out.println("Replace:"+buffer.replace(0, 4, "Agni"));
		
		System.out.println("Appaend:" +buffer.append(" How Are You!!!"));
		
		String s2="AgniPrasath";
		
		String reversetext="";
		
		
		for(int i=s2.length()-1;i>=0;i--)
		{
			
			reversetext=reversetext+s2.charAt(i);
			//System.out.println(reversetext);
		}
		
		System.out.println("Reversetext:"+reversetext);
		
		//buffer.reverse();
		
		//System.out.println("Actual String is:"+ buffer.substring(0, 4));
		
			String s3="Hello";
			char[] character1=s3.toCharArray();
			
			List<Character> array=new ArrayList<Character>();
			
			for(int i=0;i<character1.length;i++)
			{
				array.add(character1[i]);
			}
			
			System.out.println(array);
			
			ListIterator<Character> char1=array.listIterator();
			
			String lireverse="";
			
			while(char1.hasNext())
			{
				Character t1=char1.next();
				System.out.println(t1);
				lireverse=lireverse+String.valueOf(t1);
			}
			
			System.out.println("lireverse string:"+lireverse);
			
			int mysalary=20000;
			int mysuperior=50000;
			
			int thirdvariable;
			
			thirdvariable=mysalary;
			mysalary=mysuperior;
			mysuperior=thirdvariable;
			
			System.out.println(mysalary+":"+mysuperior);
			
			Integer number=1289;
			
			String rv=String.valueOf(number);
			
			String rv1="";
			
			for(int i=rv.length()-1;i>=0;i--)
			{
				
				rv1=rv1+rv.charAt(i);
				
			}
			
			System.out.println("Reverse Number is:"+Integer.parseInt(rv1));
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
