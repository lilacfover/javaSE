package com.example.javase.myio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class DOM4_Jwriter
{
    public static void main(String[] args)
    {
        // 创建文档
        Document doc = DocumentHelper.createDocument();
        // 定义节点

        Element addresslist = doc.addElement("addresslist");
        Element linkman = addresslist.addElement("linkman");
        Element employee = addresslist.addElement("employee");
        Element name = linkman.addElement("name");
        Element email = linkman.addElement("email");
        Element salary = employee.addElement("salary");
        Element job = employee.addElement("engineer");
        name.setText("FTL1012");
        email.setText("www.44.com");
        salary.setText("15000+");
        job.setText("Java开发");
        // 定义输出格式
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("GBK");
        try
        {
            XMLWriter writer = new XMLWriter(new FileOutputStream(new File("D:"
                    + File.separator + "outputt.xml")), format);
            writer.write(doc);
            writer.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}