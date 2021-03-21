package com.demo.io.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;
 
 /**
  * <p>ClassName: TestObjSerializeAndDeserialize<p>
  * <p>Description: ���Զ�������л��ͷ�����<p>
  * @author wanglf
  * @version 1.0 V
  */
 public class SerializePerson {
    
     /**
      * MethodName: SerializePerson 
      * Description: ���л�Person����
      * @throws FileNotFoundException
      * @throws IOException
      */
     private static void serializePerson() throws FileNotFoundException,IOException {
    	 
         Person person = new Person();
         person.setName("gacl");
         person.setAge("25");
         person.setGender("��");
         // ObjectOutputStream �������������Person����洢��E�̵�Person.txt�ļ��У���ɶ�Person��������л�����
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(
                 new File("E:/Study/Java/workspace/Java_03_Object/src/com/cn/serialized/Person.txt")));
         objectOutputStream.writeObject(person);
         System.out.println("Person�������л��ɹ���");
         objectOutputStream.close();
     }
 
     /**
      * MethodName: DeserializePerson 
      * Description: ������Perons����
      * @author xudp
      * @return
      * @throws Exception
      * @throws IOException
      */
     private static Person DeserializePerson() throws Exception, IOException {
    	 
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                 new File("E:/Study/Java/workspace/Java_03_Object/src/com/cn/serialized/Person.txt")));
         Person person = (Person) ois.readObject();
         System.out.println("Person�������л��ɹ���" + person.getName());
         
         ois.close();
         return person;
     }
     
     /**
      * 
      * @param args
      * @throws Exception
      */
     public static void main(String[] args) throws Exception {
         
    	 serializePerson();
    	 
         Person p = DeserializePerson();
         
         System.out.println(MessageFormat.format("name={0},age={1},sex={2}", p.getName(), p.getAge(), p.getGender()));
     }
 
 }