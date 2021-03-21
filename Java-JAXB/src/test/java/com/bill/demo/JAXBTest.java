package com.bill.demo;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBTest {

    @Test
    public void ttt() {
       String str =  System.getProperty("user.dir");
        System.out.println(str);
    }

    @Test
    public void generateXML() {
        Person person = new Person("abc", "男", "北京", "朝阳区");

        String filePath = System.getProperty("user.dir") + File.separatorChar
                + "file" + File.separatorChar
                + "tmp" + File.separatorChar;

        File file = new File(filePath + "person.xml");

       // File file = new File("E:\\person.xml");
        JAXBContext jc = null;
        try {
            //根据Person类生成上下文对象
            jc = JAXBContext.newInstance(Person.class);
            //从上下文中获取Marshaller对象，用作将bean编组(转换)为xml
            Marshaller ma = jc.createMarshaller();
            //以下是为生成xml做的一些配置
            //格式化输出，即按标签自动换行，否则就是一行输出
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //设置编码（默认编码就是utf-8）
            ma.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            //是否省略xml头信息，默认不省略（false）
            ma.setProperty(Marshaller.JAXB_FRAGMENT, false);

            //编组
            ma.marshal(person, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void generateBean() {
        File file = new File("E:\\person.xml");
        JAXBContext jc = null;
        try {
            jc = JAXBContext.newInstance(Person.class);
            Unmarshaller uma = jc.createUnmarshaller();
            Person person = (Person) uma.unmarshal(file);
            System.out.println(person);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}