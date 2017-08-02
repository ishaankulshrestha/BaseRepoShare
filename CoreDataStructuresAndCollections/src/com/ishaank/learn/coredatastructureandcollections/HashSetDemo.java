package com.ishaank.learn.coredatastructureandcollections;

import java.util.*;
public class HashSetDemo {

   public static void main(String args[]) {
      // create a hash set
      HashSet<String> hs = new HashSet<String>();
      
      //OR may use LinkedHashSet hs = new LinkedHashSet();
      //OR may use TreeSet ts = new TreeSet();
      
      // add elements to the hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      System.out.println(hs);
   }
}