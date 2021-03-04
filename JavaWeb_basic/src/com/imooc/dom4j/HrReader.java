package com.imooc.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class HrReader {
    public void readXml() {
        String file="E:\\JavaProject\\JavaWeb_basic\\src\\xml\\hr.xml";
        //SAXRead类是读取XML文件的核心类，用于将XML解析后以“树”的形式保存在内存中
        SAXReader reader = new SAXReader();
        try {
            Document document=reader.read(file);
            //获取XML文档的根节点，即hr标签
            Element root=document.getRootElement();
            //elements方法用于获取指定的标签集合
            List<Element> employees=root.elements("employee");
            for(Element employee:employees){
                Element name = employee.element("name");
                String empName = name.getText();
                System.out.println(empName);

                System.out.println(employee.elementText("age"));
                System.out.println(employee.elementText("salary"));

                Element department = employee.element("department");
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HrReader reader = new HrReader();
        reader.readXml();

    }
}
