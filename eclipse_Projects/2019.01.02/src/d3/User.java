package d3;

import java.io.Serializable;

/**  
* 文件名: User.java 
* 作者：梓灏 
* 时间： 2019年1月5日 下午4:06:51 
*/
public class User implements Serializable{
private static final long serialVersionUID = -8400519353171604823L;
private String name;
private int ID;
/**
 * 
 */
public User() {
	super();
	// TODO 自动生成的构造函数存根
}

public User(String name, int iD) {
	super();
	this.name = name;
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
@Override
public String toString() {
	return "User [name=" + name + ", ID=" + ID + "]";
}

}
