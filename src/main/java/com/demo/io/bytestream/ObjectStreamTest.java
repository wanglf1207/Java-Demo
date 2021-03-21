package com.demo.io.bytestream;

import java.io.*;

public class ObjectStreamTest {

	public static void main(String args[]) throws Exception {

		T t = new T();
		t.k = 8;
		FileOutputStream fos = new FileOutputStream("E:/Temp/testObjectio.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("E:/Temp/testObjectio.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T tReaded = (T)ois.readObject();
		System.out.println(tReaded.i + " " + tReaded.j + " " + tReaded.d + " " + tReaded.k);
		ois.close();
	}
}

class T implements Serializable {

    private static final long serialVersionUID = 1L;
    int i = 10;
    int j = 9;
    double d = 2.3;
    transient int k = 15;
}