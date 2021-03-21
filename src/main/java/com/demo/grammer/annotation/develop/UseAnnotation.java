package com.demo.grammer.annotation.develop;

@TestAnnotation(ann = @MetaAnnotation("lhm"),color = "red", value = "abc",arr={3,3,3})
public class UseAnnotation {
	//����ֻ��value����ʡ�Բ�д�����������߸���������Ĭ��ֵ
	@TestAnnotation("str")
	public static void main(String[] args) {
		//���ָ�����͵�ע�ʹ����ڴ�Ԫ���ϣ��򷵻� true�����򷵻� false��
		//�˷�����Ҫ��Ϊ�˱��ڷ��ʱ��ע�Ͷ���Ƶġ� 
		if(UseAnnotation.class.isAnnotationPresent(TestAnnotation.class)) {
			//������ھͻ�����ע��
			TestAnnotation anno = UseAnnotation.class.getAnnotation(TestAnnotation.class);
			System.out.println(anno.color());
			System.out.println(anno.value());
			System.out.println(anno.arr().length);
			System.out.println(anno.ann().value());
		}
	}
}
