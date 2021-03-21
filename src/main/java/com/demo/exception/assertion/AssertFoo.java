package com.demo.exception.assertion;

public class AssertFoo {
	
    public static void main(String args[]) {
        //����1���Ϊtrue�����������ִ��
        assert true;
        System.out.println("����1û�����⣬Go��");
 
        System.out.println("\n-----------------\n");
 
        //����2���Ϊfalse,������ֹ
        assert false : "����ʧ�ܣ��˱��ʽ����Ϣ�������׳��쳣��ʱ�������";
        System.out.println("����2û�����⣬Go��");
    }
}