package text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * 文件名: eq.java 作者：梓灏 时间： 2019年11月15日 下午3:56:26
 */
public class eq {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		map.put("e", "5");
		map.put("f", "6");
		map.put("g", "8");
		map.put("h", "9");

		HashMap map1 = new HashMap();
		Set<Entry> entrysAll = map.entrySet();
		for (Entry entryAll : entrysAll) {
			String key =  (String) entryAll.getKey();
			String value =  (String) entryAll.getValue();
			map1.put(key, value);
		}
		System.out.println(map1);
		System.out.println(map1);
	}
}
