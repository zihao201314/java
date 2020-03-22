package day1;

public class Text {
public static void main(String[] args) {
	User a=new worker("zhangsan");
	System.out.println(a.getUsername());

	System.out.println(a instanceof User);
	System.out.println(a instanceof Object);


}
}
