
package newdata;

/**  
* 文件名: Text.java 
* 作者：梓灏 
* 时间： 2018年12月25日 下午4:00:30 
*/
public class Text {
public static void main(String[] args) {
	New_Data a=new New_Data();
	
	a.add(125);
	a.add(122);
    a.add("451531bhkjgmvhbk");
    a.add('#');
    a.add(2.256);
    a.add(true);
   
	
	a.add(122);
	a.add(125);

System.out.println(a);
a.getnum();

System.out.println(a.getFirstIndex(true));
System.out.println(a.getIndex(2));
a.deleteElementByIndex(2);

System.out.println(a);
a.getnum();




}
}
