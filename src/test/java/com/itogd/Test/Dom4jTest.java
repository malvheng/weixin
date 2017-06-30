package com.itogd.Test;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.List;

/**
 * Dom4j解析XML的简单示例
 * Created by Administrator on 2017/6/29.
 */
public class Dom4jTest {
    public static void main(String[] args) throws Exception{
        //构造XML字符串
        StringBuffer buffer = new StringBuffer();
        buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        buffer.append("<person>");
        buffer.append("<name>汤姆</name>");
        buffer.append("<set>男</set>");
        buffer.append("<address>广东</address>");
        buffer.append("</person>");

        Document document = DocumentHelper.parseText(buffer.toString());
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        for(Element element : elements){
            System.out.println(element.getName() + " = >" +element.getText());
        }
    }
}
