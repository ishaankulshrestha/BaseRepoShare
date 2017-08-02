package com.ishaank.learn.coredatastructureandcollections;

import java.util.*;

/*
 * The Enumeration interface isn't itself a data structure, 
 * but it is very important within the context of other data structures. 
 * The Enumeration interface defines a means to retrieve successive elements
 *  from a data structure.For example, Enumeration defines a 
 *  method called nextElement that is used to get the next element 
 *  in a data structure that contains multiple elements.
 */

public class EnumerationDemo {
	   public static void main(String args[]) {
		      Enumeration days;
		      Vector<String> dayNames = new Vector<String>();
		      
		      dayNames.add("Sunday");
		      dayNames.add("Monday");
		      dayNames.add("Tuesday");
		      dayNames.add("Wednesday");
		      dayNames.add("Thursday");
		      dayNames.add("Friday");
		      dayNames.add("Saturday");
		      days = (Enumeration) dayNames.elements();
		      
		      while (((java.util.Enumeration) days).hasMoreElements()) {
		         System.out.println(((java.util.Enumeration) days).nextElement()); 
		      }
		   }

	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return false;
	}
		}