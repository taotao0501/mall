package com.imooc.mgallery.utils;

import com.imooc.mgallery.entity.Painting;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据源类，用于将XML文件解析为Java对象
 */
public class XmlDataSource {
    // 通过static keyword保证数据全局唯一
    private static List<Painting> data = new ArrayList<>();
    private static String dataFile;
    static {
        //编译后,本类.class与 painting.xml都在头一个目录下，因此就得到painting.xml文件完整物理路径
        //这里要注意，要写成painting.xml
        dataFile = XmlDataSource.class.getResource("painting.xml").getPath();
        //dataFile = XmlDataSource.class.getResource("../painting.xml").getPath();

        //考虑到路径可能有空格，导致 dataFile有特殊字符
        URLDecoder decoder = new URLDecoder();
        try {
            dataFile = decoder.decode(dataFile, "UTF-8");
            //System.out.println(dataFile);
            //利用Dom4j对XML进行解析
            SAXReader reader = new SAXReader();
            Document document = reader.read(dataFile);
            // Xpath获取painting节点
            List<Node> nodes = document.selectNodes("/root/painting");
            for(Node node: nodes) {
                Element ele = (Element) node;
                String id =ele.attributeValue("id");
                String pname = ele.elementText("pname");

                Painting pt = new Painting();
                pt.setId(Integer.parseInt(id));
                pt.setPname(pname);
                pt.setCategory(Integer.parseInt(ele.elementText("category")));
                pt.setPrice(Integer.parseInt(ele.elementText("price")));
                pt.setPreview(ele.elementText("preview"));
                pt.setDescription(ele.elementText("description"));
                data.add(pt);

            }
        } catch (UnsupportedEncodingException | DocumentException e) {
            e.printStackTrace();
        }
    }

    public static List<Painting> getRawData() {
        return data;
    }

    public static void main(String[] args) {
        List<Painting> ps = XmlDataSource.getRawData();
        for(Painting p:ps){
            System.out.println(p.getPreview());
        }

    }
}
