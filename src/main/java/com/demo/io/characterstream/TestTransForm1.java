package com.demo.io.characterstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class TestTransForm1 {
  public static void main(String[] args) {
    try {
    	OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\" +
    			"coyote\\Java\\Workspace\\Java_IO\\file\\testtransform1.txt"));
        osw.write("mircosoftibmsunapplehp");
      System.out.println(osw.getEncoding());
      osw.close();
      
      //����true˵����ԭ���Ļ���֮�����,�����д����true����ԭ�����ַ���
      osw = new OutputStreamWriter(new FileOutputStream("E:\\coyote\\Java\\" +
      		"Workspace\\Java_IO\\file\\testtransform1.txt", true),
      								"ISO8859_1"); // latin-1
      osw.write("mircosoftibmsunapplehp");
      System.out.println(osw.getEncoding());
      osw.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}