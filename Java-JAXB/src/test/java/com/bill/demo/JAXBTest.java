package com.bill.demo;

import org.junit.Test;

import javax.xml.bind.*;
import java.io.File;

public class JAXBTest {

    /**
     * JavaBean转XML
     */
    @Test
    public void generateXML() {

        Person person = new Person("abc", "男", "北京", "朝阳区");

        File file = new File(getFilePath() + "person.xml");

        JAXBContext jaxbContext = null;
        try {
            // 根据Person类生成上下文对象
            jaxbContext = JAXBContext.newInstance(Person.class);
            // 从上下文中获取Marshaller对象，用作将bean编组(转换)为xml
            Marshaller marshaller = jaxbContext.createMarshaller();
            // 以下是为生成xml做的一些配置
            // 格式化输出，即按标签自动换行，否则就是一行输出
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            // 设置编码（默认编码就是utf-8）
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            // 是否省略xml头信息，默认不省略（false）
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);
            // 编组
            marshaller.marshal(person, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * XML转JavaBean
     */
    @Test
    public void generateBean() {
        File file = new File(getFilePath() + "person.xml");
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

    @Test
    public void generateXML1() {
        Person person = new Person("abc", "男", "北京", "朝阳区");
        File file = new File(getFilePath() +"person.xml");
        JAXB.marshal(person, file);
    }

    /**
     * 或许当前项目中的xml存放路径
     * @return
     */
    private String getFilePath() {
        String filePath = System.getProperty("user.dir") + File.separatorChar
                + "file" + File.separatorChar
                + "tmp" + File.separatorChar;
        return filePath;
    }
}