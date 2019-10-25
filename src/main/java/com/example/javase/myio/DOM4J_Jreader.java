package com.example.javase.myio;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DOM4J_Jreader
{

    public static void main(String[] args)
    {
        // TODO 自动生成的方法存根
        File file = new File("D:" + File.separator + "outputt.xml");
        SAXReader reader = new SAXReader();
        Document doc = null;
        try
        {
            doc = reader.read(file);
        } catch (DocumentException e)
        {
            e.printStackTrace();
        }
        Element root = doc.getRootElement();
        Iterator iter = root.elementIterator();
        while (iter.hasNext())
        {
            Element linkman = (Element) iter.next();
            System.out.println("姓名：" + linkman.elementText("name"));
            System.out.println("邮件：" + linkman.elementText("email"));
            Element employee = (Element) iter.next();
            System.out.println("薪资：" + employee.elementText("salary"));
            System.out.println("工作：" + employee.elementText("engineer"));

        }
    }

}