package com.example.javase.myio;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UtilsXml {

    public void test(){
        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read(new File("CP.gwcfg"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Element rootElm = document.getRootElement();
        Element element = rootElm.element("slot_group_list");
        Attribute attribute = element.attribute("name");
        System.out.println(attribute.getValue());
    }
    public static void main(String[] args) {

        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read(new File("CP.gwcfg"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Element rootElm = document.getRootElement();
        Element element = rootElm.element("peer_gps");
        Element ageElm = element.addElement("lcp_site");
        ageElm.addAttribute("id", element.elements().size()+"");
        ageElm.addAttribute("wireline_gateway_channel_limit", "2");
        ageElm.addAttribute("rx_group_list", "List1");
        ageElm.addAttribute("gps_coordinates_flag", "false");
        ageElm.addAttribute("latitude", "2147483647");
        ageElm.addAttribute("longitude", "2147483647");
        System.out.println(element.elements().size());
        Attribute attribute = element.attribute("gps_coordinates_flag");
        System.out.println(attribute.getValue());
        XMLWriter writer = null;
        try {
            writer = new XMLWriter(new FileWriter("CP.gwcfg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.write(document);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        element.addAttribute("name", "list2");

//        SAXReader reader = new SAXReader();
//        Document document = null;
//        try {
//            document = reader.read(new File("gw_index.xml"));
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }
//
//        Element rootElm = document.getRootElement();
//
//        Element element = rootElm.element("active_cfg");
//        Attribute attribute = element.attribute("name");
//        element.addAttribute("name", "CP4.gwcfg");
//        System.out.println(attribute.getValue());
//
//        XMLWriter writer = null;
//        try {
//            writer = new XMLWriter(new FileWriter("gw_index.xml"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            writer.write(document);
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
