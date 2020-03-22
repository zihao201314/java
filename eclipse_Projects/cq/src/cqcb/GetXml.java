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
 * �ļ���: GetXml.java ���ߣ���� ʱ�䣺 2019��11��12�� ����11:33:15
 */
public class GetXml {
	/**
	 * ȡ�����еĿؼ�����������
	 * 
	 * @param pathAndName
	 * @return Map------key: String �ؼ���� value Map �ؼ�����------key: String �ؼ����� String
	 *         ����ֵ
	 * 
	 */
	public static Map getXml(String pathAndName) {
		// ����map���൱�� dc:ViewLayout
		Map all = new HashMap<String, Map>();

		SAXBuilder sb = new SAXBuilder();
		// ��ȡ Document����

		Document document = null;
		try {
			document = sb.build(new File(pathAndName));
		} catch (JDOMException e) {
			System.out.println("��ȡ���ļ�����xml�����ļ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(".abf�ļ���ȡʧ��");
		}

		// ��ȡ���ڵ�
		Element root = document.getRootElement();

		// �������ڵ㣬ȡ���������е�<bean/>
		List<Element> EltsBean1 = null;
		try {
			EltsBean1 = XPath.selectNodes(root, "bean");
		} catch (JDOMException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		// ��¼bean�ڵ����Ŀ
		int boxNumber = 0;
		for (Element bean1 : EltsBean1) {
			// ��¼bean�ڵ������
			String featureFirst = bean1.getAttributeValue("feature");
			// bean�ڵ�����Ŀ��*********************************start*******************************************
			if ("Group".equals(featureFirst)) {
				boxNumber++;
				Map groupBox = new HashMap<String, Map>();
				List<Element> Elts1 = null;
				try {
					Elts1 = XPath.selectNodes(bean1, "bean");
				} catch (JDOMException e) {
					System.out.println("Group��û��bean");
				}
				int size = 0;
				String featureCkeck = "";

				// ��ȡ��Ŀ������
				List<Element> Entry = null;
				try {
					Entry = XPath.selectNodes(bean1, "entry");
				} catch (JDOMException e) {
					System.out.println("bean��û��entry");
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

				// ����������
				if (featureCkeck.contains("Table")) {

					for (Element elt1 : Elts1) {
//							ȡ����ǰ�ڶ���bean��feature
						String feature = elt1.getAttributeValue("feature");
						size++;

						// ȡ����ǰ�ڶ���bean������entry
						List<Element> Elts2 = null;
						try {
							Elts2 = XPath.selectNodes(elt1, "entry");
						} catch (JDOMException e) {
							System.out.println("Table��û��entry");
						}
						// ѭ��entry

						if ("Table".equals(feature)) {
							// ����ÿ���ռ�
							Map box = new HashMap<String, Object>();

							// ��ȡ��������
							for (Element elt2 : Elts2) {
								// ȡ��entry�������ֵ
								String featureIn = elt2.getAttributeValue("feature");

								String key = elt2.getAttributeValue("key");
								String value = elt2.getAttributeValue("value");
								box.put(key, value);
							}

							// ��ȡ����Ԫ��
							List<Element> Elts2_1 = null;
							try {
								Elts2_1 = XPath.selectNodes(elt1, "bean");
							} catch (JDOMException e) {
								System.out.println("Table��û��bean");
							}
							// ����������
							int lie = 0;
							// ��������Ԫ��
							for (Element elt2 : Elts2_1) {
								Map tableMap = new HashMap();
								// ȡ��entry�������ֵ
								String featureIn = elt2.getAttributeValue("feature");
								lie++;
								List<Element> Elts3 = null;
								try {
									Elts3 = XPath.selectNodes(elt2, "entry");
								} catch (JDOMException e) {
									System.out.println("Table�µ�beanû��entry");
								}
								for (Element elt3 : Elts3) {
									// ȡ��entry�������ֵ
									// String featureTA = elt3.getAttributeValue("feature");
									String key = elt3.getAttributeValue("key");
									String value = elt3.getAttributeValue("value");
									tableMap.put(key, value);
								}
								box.put("Table" + lie, tableMap);
							}
							// ���ؼ��ŵ���Ŀ����
							groupBox.put(feature + size, box);
						} else {
							// ����ÿ���ռ�
							Map box = new HashMap<String, Object>();
							for (Element elt2 : Elts2) {
								// ȡ��entry�������ֵ
								String featureIn = elt2.getAttributeValue("feature");

								String key = elt2.getAttributeValue("key");
								String value = elt2.getAttributeValue("value");
								box.put(key, value);
							}
							// ���ؼ��ŵ���Ŀ����
							groupBox.put(feature + size, box);
						}

					}

					all.put("groupTableBox" + boxNumber, groupBox);

				}
				// ����������
				else {
					for (Element elt1 : Elts1) {
						// ȡ����ǰ�ڶ���bean��feature
						String feature = elt1.getAttributeValue("feature");
						size++;
						// ����ÿ���ռ�
						Map box = new HashMap<String, String>();
						// ȡ����ǰ�ڶ���bean������entry
						List<Element> Elts2 = null;
						try {
							Elts2 = XPath.selectNodes(elt1, "entry");
						} catch (JDOMException e) {
							System.out.println("Group�µ�beanû��entry");
						}
						// ѭ��entry
						for (Element elt2 : Elts2) {
							// ȡ��entry�������ֵ
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
			// bean�ڵ�����Ŀ��*********************************end*******************************************

			// û����Ŀ����bean
			else if ("Composite".equals(featureFirst)) {

				boxNumber++;
				Map compositeBox = new HashMap<String, Map>();
//			��ȡ���еڶ����bean
				List<Element> Elts1 = null;
				try {
					Elts1 = XPath.selectNodes(bean1, "bean");
				} catch (JDOMException e) {
					System.out.println("Composite��û��bean");
				}
//			ѭ���ڶ���bean
				int size = 0;
				for (Element elt1 : Elts1) {
//				ȡ����ǰ�ڶ���bean��feature
					String feature = elt1.getAttributeValue("feature");
					size++;
//				����ÿ���ռ�
					Map box = new HashMap<String, String>();
//				ȡ����ǰ�ڶ���bean������entry	
					List<Element> Elts2 = null;
					try {
						Elts2 = XPath.selectNodes(elt1, "entry");
					} catch (JDOMException e) {
						System.out.println("Composite�µ�beanû��entry");
					}
//				ѭ��entry
					for (Element elt2 : Elts2) {
//					ȡ��entry�������ֵ
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
