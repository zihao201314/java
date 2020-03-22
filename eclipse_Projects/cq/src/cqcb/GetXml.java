package cqcb;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

/**
 * 文件名: GetXml.java 作者：梓灏 时间： 2019年11月12日 上午11:33:15
 */
public class GetXml {
	/**
	 * 取出所有的控件，和其属性
	 * 
	 * @param pathAndName
	 * @return Map------key: String 控件類型 value Map 控件屬性------key: String 控件屬性 String
	 *         屬性值
	 * 
	 */
	public static Map getXml(String pathAndName) {
		// 最大的map，相当于 dc:ViewLayout
		Map all = new HashMap<String, Map>();

		SAXBuilder sb = new SAXBuilder();
		// 获取 Document对象

		Document document = null;
		try {
			document = sb.build(new File(pathAndName));
		} catch (JDOMException e) {
			System.out.println("读取的文件不是xml类型文件");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(".abf文件读取失败");
		}

		// 获取根节点
		Element root = document.getRootElement();

		// 遍历根节点，取出下面所有的<bean/>
		List<Element> EltsBean1 = null;
		try {
			EltsBean1 = XPath.selectNodes(root, "bean");
		} catch (JDOMException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		// 记录bean节点的数目
		int boxNumber = 0;
		for (Element bean1 : EltsBean1) {
			// 记录bean节点的类型
			String featureFirst = bean1.getAttributeValue("feature");
			// bean节点是栏目条*********************************start*******************************************
			if ("Group".equals(featureFirst)) {
				boxNumber++;
				Map groupBox = new HashMap<String, Map>();
				List<Element> Elts1 = null;
				try {
					Elts1 = XPath.selectNodes(bean1, "bean");
				} catch (JDOMException e) {
					System.out.println("Group下没有bean");
				}
				int size = 0;
				String featureCkeck = "";

				// 获取栏目条坐标
				List<Element> Entry = null;
				try {
					Entry = XPath.selectNodes(bean1, "entry");
				} catch (JDOMException e) {
					System.out.println("bean下没有entry");
				}
				if (true) {
					Map box = new HashMap<String, String>();
					for (Element entry : Entry) {
						String key = entry.getAttributeValue("key");
						String value = entry.getAttributeValue("value");

						if ("constraints#xy_location".equals(key)) {
							size++;
							box.put("constraints#xy_location", value);
						} else if ("text".equals(key)) {
							size++;
							box.put("text", value);
							groupBox.put("head", box);
						}
					}
					groupBox.put("head", box);
				}

				for (Element elt1 : Elts1) {
					String feature = elt1.getAttributeValue("feature");
					featureCkeck += feature;
				}

				// 有数据网格
				if (featureCkeck.contains("Table")) {

					for (Element elt1 : Elts1) {
//							取出当前第二层bean的feature
						String feature = elt1.getAttributeValue("feature");
						size++;

						// 取出当前第二层bean的所有entry
						List<Element> Elts2 = null;
						try {
							Elts2 = XPath.selectNodes(elt1, "entry");
						} catch (JDOMException e) {
							System.out.println("Table下没有entry");
						}
						// 循环entry

						if ("Table".equals(feature)) {
							// 定义每个空件
							Map box = new HashMap<String, Object>();

							// 获取表格的属性
							for (Element elt2 : Elts2) {
								// 取出entry定义里的值
								String featureIn = elt2.getAttributeValue("feature");

								String key = elt2.getAttributeValue("key");
								String value = elt2.getAttributeValue("value");
								box.put(key, value);
							}

							// 获取表格的元素
							List<Element> Elts2_1 = null;
							try {
								Elts2_1 = XPath.selectNodes(elt1, "bean");
							} catch (JDOMException e) {
								System.out.println("Table下没有bean");
							}
							// 计数表格的列
							int lie = 0;
							// 遍历表格的元素
							for (Element elt2 : Elts2_1) {
								Map tableMap = new HashMap();
								// 取出entry定义里的值
								String featureIn = elt2.getAttributeValue("feature");
								lie++;
								List<Element> Elts3 = null;
								try {
									Elts3 = XPath.selectNodes(elt2, "entry");
								} catch (JDOMException e) {
									System.out.println("Table下的bean没有entry");
								}
								for (Element elt3 : Elts3) {
									// 取出entry定义里的值
									// String featureTA = elt3.getAttributeValue("feature");
									String key = elt3.getAttributeValue("key");
									String value = elt3.getAttributeValue("value");
									tableMap.put(key, value);
								}
								box.put("Table" + lie, tableMap);
							}
							// 将控件放到栏目条里
							groupBox.put(feature + size, box);
						} else {
							// 定义每个空件
							Map box = new HashMap<String, Object>();
							for (Element elt2 : Elts2) {
								// 取出entry定义里的值
								String featureIn = elt2.getAttributeValue("feature");

								String key = elt2.getAttributeValue("key");
								String value = elt2.getAttributeValue("value");
								box.put(key, value);
							}
							// 将控件放到栏目条里
							groupBox.put(feature + size, box);
						}

					}

					all.put("groupTableBox" + boxNumber, groupBox);

				}
				// 无数据网格
				else {
					for (Element elt1 : Elts1) {
						// 取出当前第二层bean的feature
						String feature = elt1.getAttributeValue("feature");
						size++;
						// 定义每个空件
						Map box = new HashMap<String, String>();
						// 取出当前第二层bean的所有entry
						List<Element> Elts2 = null;
						try {
							Elts2 = XPath.selectNodes(elt1, "entry");
						} catch (JDOMException e) {
							System.out.println("Group下的bean没有entry");
						}
						// 循环entry
						for (Element elt2 : Elts2) {
							// 取出entry定义里的值
							String featureIn = elt2.getAttributeValue("feature");
							String key = elt2.getAttributeValue("key");
							String value = elt2.getAttributeValue("value");
							box.put(key, value);
						}
						groupBox.put(feature + size, box);
					}
					all.put("groupBox" + boxNumber, groupBox);
				}
			}
			// bean节点是栏目条*********************************end*******************************************

			// 没有栏目条的bean
			else if ("Composite".equals(featureFirst)) {

				boxNumber++;
				Map compositeBox = new HashMap<String, Map>();
//			获取所有第二层的bean
				List<Element> Elts1 = null;
				try {
					Elts1 = XPath.selectNodes(bean1, "bean");
				} catch (JDOMException e) {
					System.out.println("Composite下没有bean");
				}
//			循环第二层bean
				int size = 0;
				for (Element elt1 : Elts1) {
//				取出当前第二层bean的feature
					String feature = elt1.getAttributeValue("feature");
					size++;
//				定义每个空件
					Map box = new HashMap<String, String>();
//				取出当前第二层bean的所有entry	
					List<Element> Elts2 = null;
					try {
						Elts2 = XPath.selectNodes(elt1, "entry");
					} catch (JDOMException e) {
						System.out.println("Composite下的bean没有entry");
					}
//				循环entry
					for (Element elt2 : Elts2) {
//					取出entry定义里的值
						String featureIn = elt2.getAttributeValue("feature");
						String key = elt2.getAttributeValue("key");
						String value = elt2.getAttributeValue("value");
						box.put(key, value);
					}
					compositeBox.put(feature + size, box);
				}
				all.put("compositeBox" + boxNumber, compositeBox);

			} else if ("".equals(featureFirst) || featureFirst == null) {

//					System.out.println(featureFirst);
				// all.put("tableBox", groupTableBox);
			}

		}

		return all;
	}

}
