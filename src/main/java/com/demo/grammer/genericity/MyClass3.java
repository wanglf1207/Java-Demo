package com.demo.grammer.genericity;

public class MyClass3<T> {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return var.toString();
    }


/**
 * ͨ�������ʹ�� ����<?>��<��extends ����>��<�� super ����>
 */
public static void main(String [] args) {
	
    MyClass3<Boolean> clazz = new MyClass3<Boolean>();
    clazz.setVar(false);
    fun(clazz);//���˸÷�����ʱ�򣬶Է���û�����ƣ��κ����͵ķ��Ͷ�����ʹ��

    MyClass3<Integer> clazzInt = new MyClass3<Integer>();
    clazzInt.setVar(1);
    funExtends(clazzInt);//���˸÷�����ʱ��ֻ��ʹ��Number���ͻ�����������

    MyClass3<Double> clazzDouble = new MyClass3<Double>();
    clazzDouble.setVar(2.2);
    funExtends(clazzDouble);//���˸÷�����ʱ��ֻ��ʹ��Number���ͻ�����������


    MyClass3<String> clazzString = new MyClass3<String>();
    clazzString.setVar("string");
    funSuper(clazzString);//���˸÷�����ʱ��ֻ��ʹ��String���ͻ����丸����


    MyClass3<Object> clazzObject = new MyClass3<Object>();
    clazzObject.setVar(new Object());
    funSuper(clazzObject);//���˸÷�����ʱ��ֻ��ʹ��String���ͻ����丸����

}

public static void fun(MyClass3<?> clazz) {//û�����Ƶķ���ʹ��
    System.out.println(clazz);
}

public static void funExtends(MyClass3<? extends Number> clazz) {//ֻ��ʹ��Number��������ķ���
    System.out.println(clazz);
}

public static void funSuper(MyClass3<? super String> clazz) {//ֻ��ʹ��String���丸��ķ���
    System.out.println(clazz);
}
}

