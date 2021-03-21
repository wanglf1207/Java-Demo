package com.demo.io.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream1 { 
  public static void main(String[] args) {
    PrintStream ps = null;
    try {
      FileOutputStream fos = 
              new FileOutputStream("E:/coyote/Java/" +
					"Workspace/Java_IO/file/print.txt");
      ps = new PrintStream(fos);
    } catch (IOException e) {
      e.printStackTrace();
    }
    if(ps != null){
      //���·��䡰��׼���������
      System.setOut(ps);
    }
    int ln = 0;
    for(int c = 0; c <= 60000; c++){
      System.out.print((char)c+ " ");
      if(ln++ >=100){ System.out.println(); ln = 0;}
    }
  }
}