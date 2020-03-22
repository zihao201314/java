package test;

import java.io.FileWriter;

/**  
* 文件名: 哥儿.java 
* 作者：梓灏 
* 时间： 2019年11月28日 下午5:06:41 
*/
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;
import org.jdom.input.DOMBuilder;
import org.jdom.output.DOMOutputter;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class jdom  {

		  public void Create() {

		   try {

		    Document doc = new Document();  

		    Namespace ns = Namespace.getNamespace("com.dcfs.teller.client.ui" );

		    Namespace ns1 = Namespace.getNamespace("dc", "com.dcfs.teller.client.ui" );
		    
		    Namespace ns2 = Namespace.getNamespace("content", "com.dcfs.teller.client.ui" );

		    Element root = new Element("Scene", ns1);

		    root.addNamespaceDeclaration(ns);
		    root.addNamespaceDeclaration(ns2);
		    root.setAttribute("coordinate","0,0");
		    
		    root.setAttribute("id","6024",ns1);
		    root.setAttribute("text","6024_0",ns1);
		    
		    
		    doc.setRootElement(root);

		    
		    
		    
		    
		    Element el1 = new Element("元素一");

		    el1.setAttribute("属性", "属性一");   

		    Text text1=new Text("元素值");

		             Element em = new Element("元素二").addContent("第二个元素");

		    el1.addContent(text1);

		             el1.addContent(em);            

		             Element el2 = new Element("元素三").addContent("第三个元素");

		             root.addContent(el1);

		             root.addContent(el2);            

		             //缩进四个空格,自动换行,gb2312编码

		             Format format = Format.getCompactFormat();

		             format.setEncoding("gb2312"); //设置xml文件的字符为gb2312

		             format.setIndent("    "); //设置xml文件的缩进为4个空格
		             
		             XMLOutputter outputter = new XMLOutputter(format);

		             outputter.output(doc, new FileWriter("test.xml"));

		         }catch(Exception e)  {

		          System.out.println(e);

		         }

		     }    

		     public static void main(String args[]) {

		      new jdom().Create();

		     }    

		 }