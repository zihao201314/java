package test;

import java.io.FileWriter;

/**  
* �ļ���: ���.java 
* ���ߣ���� 
* ʱ�䣺 2019��11��28�� ����5:06:41 
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

		    
		    
		    
		    
		    Element el1 = new Element("Ԫ��һ");

		    el1.setAttribute("����", "����һ");   

		    Text text1=new Text("Ԫ��ֵ");

		             Element em = new Element("Ԫ�ض�").addContent("�ڶ���Ԫ��");

		    el1.addContent(text1);

		             el1.addContent(em);            

		             Element el2 = new Element("Ԫ����").addContent("������Ԫ��");

		             root.addContent(el1);

		             root.addContent(el2);            

		             //�����ĸ��ո�,�Զ�����,gb2312����

		             Format format = Format.getCompactFormat();

		             format.setEncoding("gb2312"); //����xml�ļ����ַ�Ϊgb2312

		             format.setIndent("    "); //����xml�ļ�������Ϊ4���ո�
		             
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