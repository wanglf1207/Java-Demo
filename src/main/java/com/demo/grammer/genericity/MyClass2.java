package com.demo.grammer.genericity;

public class MyClass2<K, V> {//�˴�����������������  
   private K var1;//��һ��������������K��Ӧ�ľ�������  
   private V var2;//�ڶ���������������V��Ӧ�ľ�������  
 
   public K getVar1() {  
       return var1;  
   }  
 
   public void setVar1(K var1) {  
        this.var1 = var1;  
    }  
  
    public V getVar2() {  
        return var2;  
    }  
  
    public void setVar2(V var2) {  
        this.var2 = var2;  
    }  
  
    /*
     * ���������������͵�ʹ�� 
     */
    public static void main(String args[]) {  
        //�˴�ȷ�������clazz����ĵ�һ������������Integer���ڶ�������������String  
        MyClass2<Integer, String> clazz = new MyClass2<Integer, String>();  
        clazz.setVar1(1); //�˴�ֻ����int���͵Ĳ���  
        clazz.setVar2("strValue");//�˴�ֻ����String���͵Ĳ���  
      
        System.out.println(clazz.getVar1() + "," + clazz.getVar2());  
    }  
}  
