package d3;

import java.io.Serializable;

/**  
* �ļ���: User.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��5�� ����4:06:51 
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
	// TODO �Զ����ɵĹ��캯�����
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
