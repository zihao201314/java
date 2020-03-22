package cqcb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * 文件名: CreateXml.java 作者：梓灏 时间： 2019年11月11日 下午5:13:51
 */
public class CreateXml {
	/**
	 * 
	 * @param xml
	 * @param ID
	 * @param Id_Text
	 * @return
	 */
	public static ArrayList createDocument(Map xml, String ID, Map Id_Text) {
		int guoJiHuaNo = 0;
		Map guoJiHua = new HashMap();

		ArrayList xmlAndGuoJiHua = new ArrayList();

		Document document = DocumentHelper.createDocument();
		// 在此为dc，content添加命名空间
		Element root = document.addElement("dc:Scene").addAttribute("xmlns", "com.dcfs.teller.client.ui")
				.addNamespace("", "com.dcfs.teller.client.ui").addNamespace("content", "com.dcfs.teller.client.ui")
				.addNamespace("dc", "com.dcfs.teller.client.ui").addAttribute("coordinate", "0,0")
				.addAttribute("dc:id", ID).addAttribute("dc:text", ID + "_0");
		guoJiHua.put(ID + "_0", ID);

		Element ViewLayout = root.addElement("dc:ViewLayout").addAttribute("xwidth", "740");

		Set<Entry> entrysAll = xml.entrySet();
		int size = -1;
		for (Entry entryAll : entrysAll) {
			size++;
			String keyA = (String) entryAll.getKey();
			Map valueA = (Map) entryAll.getValue();

			// 无栏目条
			if (keyA.contains("compositeBox")) {
				System.out.println(keyA + "-----------------------------------------------------");
				Set<Entry> entrysOut = valueA.entrySet();
				for (Entry entryOut : entrysOut) {
					
					String feature = (String) entryOut.getKey();
					Map box = (Map) entryOut.getValue();
					if (feature.contains("Label")) {
						String text = (String) box.get("text");
						String coordinate = (String) box.get("constraints#xy_location");
						ArrayList reCheck = CreateXml.reCheck(guoJiHua, text, guoJiHuaNo, ID);
						guoJiHua = (Map)reCheck.get(0);
						guoJiHuaNo=(Integer) reCheck.get(1);
						String  guoJiHuaWrite=(String) reCheck.get(2);
						Element label = ViewLayout.addElement("dc:Label").addAttribute("dc:text", guoJiHuaWrite)
								.addAttribute("coordinate", coordinate);
					} else if (feature.contains("Combo") && !feature.contains("CalendarCombo")) {
						String id = (String) box.get("id");
						String[] split = id.split("_");

						String string = split[1].replaceAll("\\d+", "");
						String dcId = "";
						// 避免重复的标识符
						if (size == 0) {
							dcId = (String) Id_Text.get(string);
						} else if (!"".equals((String) Id_Text.get(string)) && (String) Id_Text.get(string) != null) {

							dcId = (String) Id_Text.get(string) + size;

						}
						String ref = (String) box.get("combo_items_list_name");
						String coordinate = (String) box.get("constraints#xy_location");
						Element Combo = ViewLayout.addElement("dc:ListBox").addAttribute("dc:showtype", "border")
								.addAttribute("xwidth", "205").addAttribute("enabled", "true")
								.addAttribute("coordinate", coordinate).addAttribute("dc:ref", ref);
						if (!"".equals(dcId)) {
							Combo.addAttribute("dc:id", dcId);
							;
						}

					} else if (feature.contains("Text")) {
						String id = (String) box.get("id");
						String[] split = id.split("_");
						String string = split[1].replaceAll("\\d+", "");
						String dcId = "";
						// 避免重复的标识符
						if (size == 0) {
							dcId = (String) Id_Text.get(string);
						} else if (!"".equals((String) Id_Text.get(string)) && (String) Id_Text.get(string) != null) {

							dcId = (String) Id_Text.get(string) + size;

						}
						String coordinate = (String) box.get("constraints#xy_location");
						String constraints = (String) box.get("constraints#xy_size");
						String xwidth = "";
						if ("170,20".equals(constraints)) {
							xwidth = "205";
						} else {
							String[] split2 = constraints.split(",");
							String string2 = split2[0];
							xwidth = string2;
						}

						Element Text = ViewLayout.addElement("dc:TextField").addAttribute("xwidth", xwidth)
								.addAttribute("enabled", "true").addAttribute("coordinate", coordinate);

						if (!"".equals(dcId)) {
							Text.addAttribute("dc:id", dcId);
							;
						}

					} else if (feature.contains("CalendarCombo")) {

						String id = (String) box.get("id");
						String[] split = id.split("_");
						String string = split[1].replaceAll("\\d+", "");
						String dcId = "";
						// 避免重复的标识符
						if (size == 0) {
							dcId = (String) Id_Text.get(string);
						} else if (!"".equals((String) Id_Text.get(string)) && (String) Id_Text.get(string) != null) {

							dcId = (String) Id_Text.get(string) + size;

						}

						String coordinate = (String) box.get("constraints#xy_location");
						Element CalendarCombo = ViewLayout.addElement("dc:CalendarText").addAttribute("xwidth", "205")
								.addAttribute("enabled", "true").addAttribute("coordinate", coordinate);

						if (!"".equals(dcId)) {
							CalendarCombo.addAttribute("dc:id", dcId);
							;
						}

					} else if (false) {

					}

				}
			}
			// 有栏目条无数据网格
			else if (keyA.contains("groupBox")) {

				Set<Entry> entrysOutHead = valueA.entrySet();
				String headCoordinate = "";
				String headText = "";
				String  guoJiHuaWrite0="";
				for (Entry entryOut : entrysOutHead) {
					
					String feature = (String) entryOut.getKey();
					Map box = (Map) entryOut.getValue();
					if (feature.contains("head")) {
						headCoordinate = (String) box.get("constraints#xy_location");
						headText = (String) box.get("text");
						ArrayList reCheck = CreateXml.reCheck(guoJiHua, headText, guoJiHuaNo, ID);
						guoJiHua = (Map)reCheck.get(0);
						guoJiHuaNo=(int) reCheck.get(1);
						guoJiHuaWrite0=(String) reCheck.get(2);
						
					}
				}

				Element subArea = ViewLayout.addElement("dc:SubArea").addAttribute("dc:text", guoJiHuaWrite0)
						.addAttribute("coordinate", headCoordinate);

				System.out.println(keyA + "-----------------------------------------------------");
				Set<Entry> entrysOut = valueA.entrySet();
				for (Entry entryOut : entrysOut) {
					
					String feature = (String) entryOut.getKey();
					Map box = (Map) entryOut.getValue();
					if (feature.contains("Label")) {
						String text = (String) box.get("text");
						String coordinate = (String) box.get("constraints#xy_location");
						ArrayList reCheck = CreateXml.reCheck(guoJiHua, text, guoJiHuaNo, ID);
						guoJiHua = (Map)reCheck.get(0);
						guoJiHuaNo=(int) reCheck.get(1);
						String guoJiHuaWrite=(String) reCheck.get(2);
						Element label = subArea.addElement("dc:Label").addAttribute("dc:text", guoJiHuaWrite)
								.addAttribute("coordinate", coordinate);
					} else if (feature.contains("Combo") && !feature.contains("CalendarCombo")) {
						String id = (String) box.get("id");
						String[] split = id.split("_");
						String string = split[1].replaceAll("\\d+", "");
						String dcId = "";
						// 避免重复的标识符
						if (size == 0) {
							dcId = (String) Id_Text.get(string);
						} else if (!"".equals((String) Id_Text.get(string)) && (String) Id_Text.get(string) != null) {

							dcId = (String) Id_Text.get(string) + size;

						}

						String ref = (String) box.get("combo_items_list_name");
						String coordinate = (String) box.get("constraints#xy_location");
						Element Combo = subArea.addElement("dc:ListBox").addAttribute("dc:showtype", "border")
								.addAttribute("xwidth", "205").addAttribute("enabled", "true")
								.addAttribute("coordinate", coordinate).addAttribute("dc:ref", ref);
						if (!"".equals(dcId)) {
							Combo.addAttribute("dc:id", dcId);
						}
					} else if (feature.contains("Text")) {
						String id = (String) box.get("id");
						String[] split = id.split("_");
						String string = split[1].replaceAll("\\d+", "");
						String dcId = "";
						// 避免重复的标识符
						if (size == 0) {
							dcId = (String) Id_Text.get(string);
						} else if (!"".equals((String) Id_Text.get(string)) && (String) Id_Text.get(string) != null) {

							dcId = (String) Id_Text.get(string) + size;

						}
						String coordinate = (String) box.get("constraints#xy_location");
						String constraints = (String) box.get("constraints#xy_size");
						String xwidth = "";
						if ("170,20".equals(constraints)) {
							xwidth = "205";
						} else {
							String[] split2 = constraints.split(",");
							String string2 = split2[0];
							xwidth = string2;
						}
						Element Text = subArea.addElement("dc:TextField").addAttribute("xwidth", xwidth)
								.addAttribute("enabled", "true").addAttribute("coordinate", coordinate);
						if (!"".equals(dcId)) {
							Text.addAttribute("dc:id", dcId);

						}
					} else if (feature.contains("CalendarCombo")) {

						String id = (String) box.get("id");
						String[] split = id.split("_");
						String string = split[1].replaceAll("\\d+", "");
						String dcId = "";
						// 避免重复的标识符
						if (size == 0) {
							dcId = (String) Id_Text.get(string);
						} else if (!"".equals((String) Id_Text.get(string)) && (String) Id_Text.get(string) != null) {

							dcId = (String) Id_Text.get(string) + size;

						}

						String coordinate = (String) box.get("constraints#xy_location");
						Element CalendarCombo = subArea.addElement("dc:CalendarText").addAttribute("xwidth", "205")
								.addAttribute("enabled", "true").addAttribute("coordinate", coordinate);

						if (!"".equals(dcId)) {
							CalendarCombo.addAttribute("dc:id", dcId);

						}
					} else if (false) {

					}

				}
			}
			// 有栏目条有数据网格
			else if (keyA.contains("groupTableBox")) {

				Set<Entry> entrysOutHead = valueA.entrySet();
				String headCoordinate = "";
				String headText = "";
				String guoJiHuaWrite0="";
				for (Entry entryOut : entrysOutHead) {
					
					String feature = (String) entryOut.getKey();
					Map box = (Map) entryOut.getValue();
					if (feature.contains("head")) {
						headCoordinate = (String) box.get("constraints#xy_location");
						headText = (String) box.get("text");
						ArrayList reCheck = CreateXml.reCheck(guoJiHua, headText, guoJiHuaNo, ID);
						guoJiHua = (Map)reCheck.get(0);
						guoJiHuaNo=(int) reCheck.get(1);
						guoJiHuaWrite0=(String) reCheck.get(2);
					}
				}

				Element subArea = ViewLayout.addElement("dc:SubArea").addAttribute("dc:text", guoJiHuaWrite0)
						.addAttribute("coordinate", headCoordinate);

				System.out.println(keyA + "-----------------------------------------------------");
				Set<Entry> entrysOut = valueA.entrySet();
				for (Entry entryOut : entrysOut) {
					
					String feature = (String) entryOut.getKey();
					Map box = (Map) entryOut.getValue();
					if (feature.contains("Label")) {
						String text = (String) box.get("text");
						String coordinate = (String) box.get("constraints#xy_location");
						ArrayList reCheck = CreateXml.reCheck(guoJiHua, text, guoJiHuaNo, ID);
						guoJiHua = (Map)reCheck.get(0);
						guoJiHuaNo=(int) reCheck.get(1);
						String guoJiHuaWrite=(String) reCheck.get(2);
						Element label = subArea.addElement("dc:Label").addAttribute("dc:text", guoJiHuaWrite)
								.addAttribute("coordinate", coordinate);
					} else if (feature.contains("Combo") && !feature.contains("CalendarCombo")) {
						String id = (String) box.get("id");
						String[] split = id.split("_");
						String string = split[1].replaceAll("\\d+", "");
						String dcId = "";
						// 避免重复的标识符
						if (size == 0) {
							dcId = (String) Id_Text.get(string);
						} else if (!"".equals((String) Id_Text.get(string)) && (String) Id_Text.get(string) != null) {

							dcId = (String) Id_Text.get(string) + size;

						}
						String ref = (String) box.get("combo_items_list_name");
						String coordinate = (String) box.get("constraints#xy_location");
						Element Combo = subArea.addElement("dc:ListBox").addAttribute("dc:showtype", "border")
								.addAttribute("xwidth", "205").addAttribute("enabled", "true")
								.addAttribute("coordinate", coordinate).addAttribute("dc:ref", ref);
						if (!"".equals(dcId)) {
							Combo.addAttribute("dc:id", dcId);

						}

					} else if (feature.contains("Text")) {
						String id = (String) box.get("id");
						String[] split = id.split("_");
						String string = split[1].replaceAll("\\d+", "");
						String dcId = "";
						// 避免重复的标识符
						if (size == 0) {
							dcId = (String) Id_Text.get(string);
						} else if (!"".equals((String) Id_Text.get(string)) && (String) Id_Text.get(string) != null) {

							dcId = (String) Id_Text.get(string) + size;

						}
						String coordinate = (String) box.get("constraints#xy_location");
						String constraints = (String) box.get("constraints#xy_size");
						String xwidth = "";
						if ("170,20".equals(constraints)) {
							xwidth = "205";
						} else {
							String[] split2 = constraints.split(",");
							String string2 = split2[0];
							xwidth = string2;
						}
						Element Text = subArea.addElement("dc:TextField").addAttribute("xwidth", xwidth)
								.addAttribute("enabled", "true").addAttribute("coordinate", coordinate);

						if (!"".equals(dcId)) {
							Text.addAttribute("dc:id", dcId);

						}
					} else if (feature.contains("CalendarCombo")) {

						String id = (String) box.get("id");
						String[] split = id.split("_");
						String string = split[1].replaceAll("\\d+", "");
						String dcId = "";
						// 避免重复的标识符
						if (size == 0) {
							dcId = (String) Id_Text.get(string);
						} else if (!"".equals((String) Id_Text.get(string)) && (String) Id_Text.get(string) != null) {

							dcId = (String) Id_Text.get(string) + size;

						}

						String coordinate = (String) box.get("constraints#xy_location");
						Element CalendarCombo = subArea.addElement("dc:CalendarText").addAttribute("xwidth", "205")
								.addAttribute("enabled", "true").addAttribute("coordinate", coordinate);
						if (!"".equals(dcId)) {
							CalendarCombo.addAttribute("dc:id", dcId);

						}
					} else if (feature.contains("Table")) {

						String id = (String) box.get("id");
						String[] split = id.split("_");
						String string = split[1].replaceAll("\\d+", "");
						String dcId = "";
						// 避免重复的标识符
						if (size == 0) {
							dcId = (String) Id_Text.get(string);
						} else if (!"".equals((String) Id_Text.get(string)) && (String) Id_Text.get(string) != null) {

							dcId = (String) Id_Text.get(string) + size;

						}

						String coordinate = (String) box.get("constraints#xy_location");

						Element DataGrid = subArea.addElement("dc:DataGrid").addAttribute("export", "true")
								.addAttribute("readonly", "true").addAttribute("enabled", "true")
								.addAttribute("coordinate", coordinate);
						if (!"".equals(dcId)) {
							DataGrid.addAttribute("dc:id", dcId);
						}
						// 当子节点的XMLNS属性与父节点命名空间相同时，子节点不显示XMLNS属性
						Element columnsO = DataGrid.addElement("columns","com.dcfs.teller.client.ui");
						
						// 遍历box，取出每一列
						Set<Entry> entrysTable = box.entrySet();
						for (Entry entrystable : entrysTable) {
							// 此处 entrystable.getValue() 的强转肯定会有不能实现的时候，所以用try-catch块包围
							try {
								Map tableValue = (Map) entrystable.getValue();

								String title = (String) tableValue.get("title");
								String constraints = (String) tableValue.get("constraints#table_item_width");
								String visible = (String) tableValue.get("visible");
								String ColumnId = "";
								// 避免重复的标识符
								ColumnId = (String) Id_Text.get(title);
								if ("true".equals(visible)) {
									ArrayList reCheck = CreateXml.reCheck(guoJiHua, title, guoJiHuaNo, ID);
									guoJiHua = (Map)reCheck.get(0);
									guoJiHuaNo=(int) reCheck.get(1);
									String guoJiHuaWrite=(String) reCheck.get(2);
									Element ColumnI = columnsO.addElement("dc:DataGrid.Column")
											.addAttribute("width", constraints).addAttribute("controltype", "TextField")
											.addAttribute("dc:text", guoJiHuaWrite);

									if (!"".equals(dcId)) {
										ColumnI.addAttribute("name", ColumnId);
									}
								}
							} catch (Exception e) {
							}
						}
					}
				}
			}

		}
		xmlAndGuoJiHua.add(guoJiHua);
		xmlAndGuoJiHua.add(document);
		return xmlAndGuoJiHua;
	}

	/**
	 * 
	 * @param fileAddress
	 * @param document
	 */
	public static void writeXml(String fileAddress, Document document) {
		FileWriter out = null;
		try {
			File file = new File(fileAddress);
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("UTF-8");
			format.setIndent("	");
			format.setIndent(true);
			format.setNewlines(true);

			XMLWriter writerSee = new XMLWriter(System.out, format);
			writerSee.write(document);

			XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(file), format);
			xmlWriter.write(document);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 
	 * @param guoJiHua
	 * @param text
	 * @param guoJiHuaNo
	 * @param ID
	 * @return	检查国际化文本是否已存在
	 */
	public static ArrayList reCheck(Map guoJiHua, String text, int guoJiHuaNo, String ID) {
		Set<Entry> Entrys = guoJiHua.entrySet();
		boolean a = false;
		String	key = "";
		for (Entry entry : Entrys) {
			String key1 = (String) entry.getKey();
			String value = (String) entry.getValue();
			if (text.equals(value)) {
				a = true;
				key=key1;
				break;
			}
		}
		if (!a) {
			guoJiHuaNo++;
			guoJiHua.put(ID + "_" + guoJiHuaNo, text);
			key=ID + "_" + guoJiHuaNo;
		}
		ArrayList b = new ArrayList();
		b.add(guoJiHua);
		b.add(guoJiHuaNo);
		b.add(key);

		return b;

	}
}
