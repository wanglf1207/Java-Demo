package com.demo.io.bytestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream2 {
	
  public static void main(String[] args) {
	  
    String filename = args[0];
    
    if(filename!=null){list(filename,System.out);}
  }
  public static void list(String f,PrintStream fs){
    try {
      BufferedReader br = 
                  new BufferedReader(new FileReader(f));
      String s = null; 
      while((s=br.readLine())!=null){
        fs.println(s);            
      }
      br.close();
    } catch (IOException e) {
      fs.println("�޷���ȡ�ļ�");
    }
  }
}