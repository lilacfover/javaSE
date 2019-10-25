package com.example.javase.myio;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class UpdateXMLDataDemo {

    static File file = new File("D:" + File.separator+"person.xml");//Persons.xml文件绝对路径

    public static void main(String[] args) throws Exception {
        //①获得解析器DocumentBuilder的工厂实例DocumentBuilderFactory  然后拿到DocumentBuilder对象
        DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        //②获取一个与磁盘文件关联的非空Document对象
        Document doc = newDocumentBuilder.parse(file);
        //③通过文档对象获得该文档对象的根节点
        Element root = doc.getDocumentElement();
        Element lcp = doc.createElement("lcp_site");
        lcp.setTextContent("test");

        //查找指定节点
        //通过根节点获得子节点
        NodeList personList = root.getElementsByTagName("person");
        //这里获取第1个节点
        Node item = personList.item(0);
//		System.out.println(item.getTextContent());
        Element personElement = (Element) item;
        //获取personElement下面的子节点
        NodeList nameList = personElement.getElementsByTagName("name");
//		System.out.println(nameList.item(0).getTextContent());
        //修改
        System.out.println();
        Node node = nameList.item(0).getAttributes().getNamedItem("wildcard_flag");
        System.out.println(node.getNodeValue());
        node.setNodeValue("true");
        nameList.item(0).getAttributes().setNamedItem(node);
//        nameList.item(0).getAttributes().setNamedItem();
//        nameList.item(0).setTextContent("这里是我修改的名字");

        //注意：XML文件是被加载到内存中 修改也是在内存中 ==》因此需要将内存中的数据同步到磁盘中
        /*
         * static TransformerFactory newInstance():获取 TransformerFactory 的新实例。
         * abstract  Transformer newTransformer():创建执行从 Source 到 Result 的复制的新 Transformer。
         * abstract  void transform(Source xmlSource, Result outputTarget):将 XML Source 转换为 Result。
         */
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        //DOMSource source = new DOMSource(doc);
        Source source = new DOMSource(doc);
        //StreamResult result = new StreamResult();
        Result result = new StreamResult(file);
        transformer.transform(source, result);//将 XML==>Source 转换为 Result
    }

}
