package day1;

public class Dem2 {
public static void main(String[] args) {
Student a=new Student();
a.setName("����");
a.setAge(15);

Student b=new Student();
b.setName("����");
b.setAge(16);

System.out.println(a.toString());

System.out.println(a.getAge());

System.out.println(a.equals(b));
	}

}

