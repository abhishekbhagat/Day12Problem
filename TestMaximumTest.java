package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.problemDay13.TestMaximum;

public class TestMaximumTest 
{
	@Test
	public void maximumNumber_WhenInputIsInteger() {
		 Integer a=23,b=9,c=12;
		 Integer d=32,e=67,f=9;
		 Integer k=7,l=76,m=98;
		 Assert.assertEquals(a,new TestMaximum(a, b, c).testMaximum());
		 Assert.assertEquals(e,new TestMaximum(d,e,f).testMaximum());
		 Assert.assertEquals(m,new TestMaximum(k, l, m).testMaximum());
	}
	@Test
	public void maximumNumber_WhenInputIsFloat() {

		 Float a=23f,b=9f,c=12f;
		 Float d=32f,e=67f,f=9f;
		 Float k=7f,l=76f,m=98f;

		 Assert.assertEquals(a,new TestMaximum(a, b, c).testMaximum());
		 Assert.assertEquals(e,new TestMaximum(d,e,f).testMaximum());
		 Assert.assertEquals(m,new TestMaximum(k, l, m).testMaximum());
	}
	@Test
	public void stringWhocome_Last_Inlexicographically_WhenInput_IsString() {

		 String a="dhoni",b="abhi",c="bhagat";
		 String d="naman",e="sashi",f="abhishek";
		 String k="bhagat",l="abhishek",m="sashi";

		 Assert.assertEquals(a,new TestMaximum(a, b, c).testMaximum());
		 Assert.assertEquals(e,new TestMaximum(d,e,f).testMaximum());
		 Assert.assertEquals(m,new TestMaximum(k, l, m).testMaximum());
	}
	
}
