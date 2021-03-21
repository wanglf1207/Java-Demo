package com.demo.grammer.innerclass;

/**
 * ��̬�ڲ���demo
 * @author wanglf1207
 *
 */
public class StaticInnerClass {
	
	private static String name = "WANGLF";
	   
	@SuppressWarnings("unused")
	private String num = "123";
	
	public String age = "35";
	   
   /**
    * ��̬�ڲ����п��Զ��徲̬���߷Ǿ�̬�ĳ�Ա  
    *
    */
	static class User { 
		   
		private String username = "leify";
	    private static String password = "123456";
	    public String mail = "wanglf1207@163.com";
		   
	    /**
	     * �ڲ��෽��
	     */
	    public void display() {
		   
		   //System.out.println(num);//����ֱ�ӷ����ⲿ��ķǾ�̬��Ա
		   // ��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա(�����Ǿ�̬�����ͷǾ�̬����)
	       System.out.println(new StaticInnerClass().age);
		   System.out.println(name);//ֻ��ֱ�ӷ����ⲿ��ľ�̬��Ա
		   //��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա(������̬�����;�̬����)
		   //���ʱ��ڲ����Ա��
		   System.out.println("Inner class username : " + username);
	   }
     }
	    
   /**
    * �ⲿ�෽��
    */
   	public void printInfo() {
   		
	     User user = new User();
	
	     // �ⲿ������ڲ���ķǾ�̬��Ա:ʵ�����ڲ��༴��  
	
	     user.display();
	
	     //System.out.println(mail);//���ɷ���
	     //System.out.println(address);//���ɷ���
	     System.out.println(user.username);//���Է����ڲ����˽�г�Ա
	
	     System.out.println(User.password);// �ⲿ������ڲ���ľ�̬��Ա���ڲ���.��̬��Ա
	     System.out.println(user.mail);//���Է����ڲ���Ĺ��г�Ա
   }
	   
  /**
   * 
   * @param args
   */
   public static void main(String[] args) {
     StaticInnerClass staticTest = new StaticInnerClass();
     staticTest.printInfo();
   }
}

