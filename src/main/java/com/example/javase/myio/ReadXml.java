package com.example.javase.myio;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class ReadXml {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\Administrator\\Desktop\\voice\\gw_index.xml");
//        SAXReader saxReader = new SAXReader();
        //创建DocumentBuilderFactory对象
        //创建DocumentBuilderFactory对象
        try {
//载入资源
            SAXBuilder saxBuilder = new SAXBuilder();
            Document doc = saxBuilder.build("prop.xml");
//获取根元素(prop)
            Element root = doc.getRootElement();
//获取根元素下面的所有子元素(mess)
            List<Element> messList = root.getChildren("mess");
//子根元素(mess)
            Element childrenRoot = null;
//property元素集合
            List<Element> propertyList = null;
//遍历根元素的子元素集合(即遍历mess元素)
            for(int i = 0; i < messList.size(); i++){
//将根元素prop下的mess子元素作为一个新的子根元素
                childrenRoot = messList.get(i);
//获取子根元素mess下的所有property子元素
                propertyList = childrenRoot.getChildren("property");
//遍历子根元素的子元素集合(即遍历property元素)
                for(int j = 0; j < propertyList.size(); j++){
//获取property元素
                    Element element = propertyList.get(j);
//element.getAttributeValue("name")：获取property中name属性的值
                    if(element.getAttributeValue("name").equals(name)){	//如果name的值一致
                        return element.getAttributeValue("value");	//取得name对应的value属性值
                    }
                }
            }
//遍历完没有查找到结果返回null
            return null;
        } catch (Exception e) {e.printStackTrace();}
        return null;
    }
    }
}
