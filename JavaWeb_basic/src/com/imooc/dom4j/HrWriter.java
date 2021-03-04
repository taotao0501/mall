package com.imooc.dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class HrWriter {
    public void writeXml() {
        String file = "E:\\JavaProject\\JavaWeb_basic\\src\\xml\\hr.xml";
        SAXReader reader = new SAXReader();

        try {
            //写入内存
            Document document = reader.read(file);
            Element root = document.getRootElement();
            Element employee = root.addElement("employee");
            employee.addAttribute("no", "3313");
            Element name = employee.addElement("name");
            name.setText("李铁柱");

            employee.addElement("age").setText("37");
            employee.addElement("salary").setText("3600");
            Element department = employee.addElement("department");
            department.addElement("dname").setText("人事部");
            department.addElement("address").setText("xx-大厦-B105");

            //写入文件中
            Writer writer = new OutputStreamWriter(new FileOutputStream(file));
            document.write(writer);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        HrWriter hrWriter = new HrWriter();
        hrWriter.writeXml();
    }
}
