package com.demo.jvm;
//ͨ������������ڴ�ռ�
class BirthDate {
	//��Ա�������ݶ��󣬹ʴ洢�ڶ���
    private int day;
    private int month;
    private int year;
    
    public BirthDate(int d, int m, int y) {
        day = d; 
        month = m; 
        year = y;
    }
    public void setDay(int d) {
    	day = d;
  	}
    public void setMonth(int m) {
    	month = m;
    }
    public void setYear(int y) {
    	year = y;
    }
    public int getDay() {
    	return day;
    }
    public int getMonth() {
    	return month;
    }
    public int getYear() {
    	return year;
    }
    public void display() {
    	System.out.println
        (day + " - " + month + " - " + year);
    }
}

public class AnalyzeMemTest{
    public static void main(String args[]){
        AnalyzeMemTest test = new AnalyzeMemTest();//����һ���ֲ���������ջ�����ռ�洢test������new�����Ķ�����ڶ���
        int date = 9;//�ֲ���������ջ��������͵ı�����һ���ڴ棬�������͵�������
        //�����ִ����֮��Ϊ�ֲ�����d,m,y������ڴ�ռ���ʧ
        BirthDate d1= new BirthDate(7,7,1970);
        BirthDate d2= new BirthDate(1,1,2000);    
        /**	�������������ʱ�����ȸ��β���ջ�ڷ���ռ䣬�;ֲ�������ͬ��ֵ��ʵ�ε�ֵ
         *	���Է������ý���ֵ����
         *	����Ҫע�ⷽ��ִ������Ժ�Ϊ�����ֲ��������ڴ�ռ�ȫ����ʧ
         *  ��ʵ����change1�������֮��i��ֵ��ʧ�ˣ�date��ֵû�䣬��Ȼ��9
         */
        test.change1(date);
        /**������ִ��֮ǰ,b��d1ָ��ͬһ����
         * ����ִ�����֮��ջ��ı���b������ʧ������Ķ���ȴ���������������
         * ����ͨ��change2����ķ�ʽ���d1������ת����2004.2.22���ǰ첻����
         */
        test.change2(d1);
        /**
         * �������ִ����ǰb��d2ָ��ͬһ�����󣬶�ָ��2000��1��1�������
         * ����ִ�����֮�����b��ʧ
         */
        test.change3(d2);
        System.out.println("date=" + date);
        d1.display();
        d2.display();
    }
    
    public void change1(int i){
    	i = 1234;
    }
    public void change2(BirthDate b) {
    	b = new BirthDate(22,2,2004);
    }
    public void change3(BirthDate b) {
    	b.setDay(22);
    }
}
