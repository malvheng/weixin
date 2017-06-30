package com.itogd.Test;

import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.XStream;

/**
 * Created by Administrator on 2017/6/29.
 */
public class XstreamTest {
    /**
     * java对象转换为XML
     * @param person java对象
     */
    public static String javaObject2Xml(Person person){
        XStream xstream = new XStream(new DomDriver());
        //给Person类定义别名
        xstream.alias("person",person.getClass());
        return xstream.toXML(person);
    }

    /**
     * xml转换为Java对象
     * @param xml
     * @return
     */
    public static Object xml2JavaObject(String xml){
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("person",Person.class);
        Person person = (Person) xStream.fromXML(xml);
        return person;
    }

    public static void main(String[] args) {
        //构造Person对象
        Person p1 = new Person();
        p1.setName("柳如是");
        p1.setSex("男");
        p1.setAddress("中国");
        //将p1对象转换成XML字符串
        System.out.println(javaObject2Xml(p1));

        //将XML字符串转换成Person对象
        String xml = "<person><name>路遥</name><sex>女</sex><address>长沙</address></person>";
        Person person = (Person)xml2JavaObject(xml);
        System.out.println(person.getAddress()+person.getName()+person.getSex());
    }


}

class Person{
private String name;
private String sex;
private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
