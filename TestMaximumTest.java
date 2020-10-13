package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.problemDay13.TestMaximum;

public class TestMaximumTest 
{
	@Test
	public void maximumNumber_WhenInputIsInteger() {
		 TestMaximum testMaximum=new TestMaximum();
		 Integer a=23,b=9,c=12;
		 Integer d=32,e=67,f=9;
		 Integer k=7,l=76,m=98;
		 testMaximum.maximumNumber(a,b,c);
		 Assert.assertEquals(a,testMaximum.maximumNumber(a,b,c));
		 Assert.assertEquals(e,testMaximum.maximumNumber(d,e,f));
		 Assert.assertEquals(m,testMaximum.maximumNumber(k,l,m));
	}
	
}
