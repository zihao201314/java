package day1;

public class Student {
private String name;
private int age;

 

public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public int getAge() {
	return age;
}



public void setAge(int age) {
	this.age = age;
}



public boolean equals(Object obj) {
	Student s=(Student)obj;
	if(this.name.equals(s.name) && this.age==s.age){
		return true;
	}else {
		return false;
	}
}
 
public String toString() {
	return this.name+","+this.age;
}



}
