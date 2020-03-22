package day1;

public class Dem2 {
public static void main(String[] args) {
Student a=new Student();
a.setName("张三");
a.setAge(15);

Student b=new Student();
b.setName("张三");
b.setAge(16);

System.out.println(a.toString());

System.out.println(a.getAge());

System.out.println(a.equals(b));
	}

}

