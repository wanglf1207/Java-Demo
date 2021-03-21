package com.demo.grammer.innerclass;
  
interface Person {}
/**
 * 
 * @author wanglf1207
 *
 */
public class Goods2 {
	
     public Person value(String s) {
    	 
          class User implements Person{
        	  public User(String mobileNo) {
        		  System.out.println(mobileNo);
        	  }
          }
          return new User(s);
     }

     public static void main(String[] args) {
    	 new Goods2().value("18621922383");
     }
}
 