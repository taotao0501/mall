package com.imooc.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class HrReader2_demo {
    public void ReadXml() {
        String file = "E:\\JavaProject\\JavaWeb_basic\\src\\xml\\hr.xml";
        SAXReader reader = new SAXReader();
        try {
            Document document=reader.read(file);

            Element root=document.getRootElement();
            List<Element> employees = root.elements("employee");
            for(Element employee : employees) {
                Element name = employee.element("name");
                String empName = name.getText();
                System.out.println(empName);

                System.out.println(employee.elementText("age"));

                Element department = employee.element("department");
                System.out.println(department.element("dname").getText());

                Attribute att = employee.attribute("no");
                System.out.println(att.getText());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HrReader2_demo test = new HrReader2_demo();
        test.ReadXml();
    }
}
