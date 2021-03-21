package com.demo.socket.tcp;

import java.io.*; 
import java.net.*;
public class TestSockServer {
	
  public static void main(String[] args) {
    InputStream in = null; 
    OutputStream out = null;
    try {
      ServerSocket serverSocket = new ServerSocket(5888);
      Socket socket = serverSocket.accept();
      in = socket.getInputStream(); 
      out = socket.getOutputStream();
      DataOutputStream dos = new DataOutputStream(out);
      DataInputStream dis = new DataInputStream(in);
      String s = null;
      if((s=dis.readUTF())!=null) {
	      System.out.println(s);
	      System.out.println("from: "+socket.getInetAddress());
	      System.out.println("Port: "+socket.getPort());
	    }
      dos.writeUTF("hi��hello"); 
      dis.close();
      dos.close();
      socket.close();
      serverSocket.close();
    } catch (IOException e) {e.printStackTrace();}
  }
}