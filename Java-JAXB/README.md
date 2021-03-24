# JAXB介绍

JAXB（Java Architecture for XML Binding) 是一个业界的标准，是一项可以根据XML Schema产生Java类的技术。该过程中，JAXB也提供了将XML实例文档反向生成Java对象树的方法，并能将Java对象树的内容重新写到XML实例文档。从另一方面来讲，JAXB提供了快速而简便的方法将XML模式绑定到Java表示，从而使得Java开发者在Java应用程序中能方便地结合XML数据和处理函数。



# 入门实例

```java
package com.bill.demo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

    private int id;
    private String name;
    private String gender;
    private String addr;
    private String area;

    public Person() {
    }

    public Person(String name, String gender, String addr, String area) {
        this.name = name;
        this.gender = gender;
        this.addr = addr;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    @XmlElement
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddr() {
        return addr;
    }

    @XmlElement
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getArea() {
        return area;
    }

    @XmlElement
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", addr='" + addr + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}

```



在类上的注解@XmlRootElement表示XML的根元素，set方法上的    @XmlElement表示子元素



下面看一下如何将javabean转成xml以及如何将xml转成javabean：

```java
package com.bill.demo;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
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
```



本例中是将生成的xml文件写到了项目中的/file/tmp/person.xml文件中了。



