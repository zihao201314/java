package newdata;


import java.util.Arrays;

/**  
* �ļ���: New_Data.java 
* ���ߣ���� 
* ʱ�䣺 2018��12��25�� ����4:00:23 
*/
public class New_Data {

private Object[] a;
/**��ʾ�����������û���ӵ�Ԫ�ظ���*/
private int i=0;

/**
 * 
 */
public New_Data(int b) {
a=new Object[b];
	
}
public New_Data() {
	this(5);
}

/**
 * ��ӷ���
 * 		�û�����һ�δ˷����Ϳ��Դ洢һ������
 * 		�˷�����Ҫ��ɵĹ��ܾ��� ��ele ����data������
 * @param ele  ��ʾ����ӵ�Ԫ��
 */
public void add(Object e) {
	/**
	 * �����֮ǰӦ�����ж��Ƿ��пռ䣬���û�У����ݣ�������дһ�����ݵķ�����
	 */
	if(i==a.length) {
		big();
	}
	a[i]=e;
	i++;
}

/**
 * 2����ָ��Ԫ�ص�����λ�ã���һ�γ��ֵ�λ�ã�
 * @param ele �����ҵ�Ԫ��
 * @return eleԪ�ص�һ�γ��ֵ�����,���û����ôһ��Ԫ��  ����һ��-1��
 * 		ԭ�� ����data������ҷ�ΧӦ����[0,size) 
 */
public int getFirstIndex(Object ele){
	for (int f = 0; f < i; f++) {
		if(a[f].equals(ele)){
			return f;
		}
	}
	return -1;
}


/**
 * ɾ����ԭ����ǰ�Ҫ��ɾ��������֮���ÿһ��Ԫ����ǰ�ƶ�һλ
 * @param index
 */
public void deleteElementByIndex(int index){
	if(index>=i || index<0){
		throw new ArrayIndexOutOfBoundsException("�ף�����Խ���ˣ���Ч������Χ[0,"+i+")");
	}
//��ʽ2  ֱ��ʹ�����鿽������  ԭ�����Ŀ�����鶼���Լ�
	System.arraycopy(a, index+1, a, index, i-index-1);
	
//��ʽ1	
//	for (int i = 0; i < size-index-1; i++) {
//		data[index+i] = data[index+1+i];
//	}
	
	i--;
}

/**
 *  ����ָ����������ֵ
 * @param index ���뱻���ҵ�����
 * @return index��������Ԫ��
 */
public Object getIndex(int z) {
	if(z>=i||z<0) {
		throw new ArrayIndexOutOfBoundsException("�ף�����Խ���ˣ���Ч������Χ[0,"+i+")");
	}
	return a[z];
}




/**
 * ���ݵķ�����
 * 		�� ����һ�������飬����ǰ�ĸ��󣨲��� data.length * 2��
 * 		�� ��ԭ�����е����ݿ�����������
 * 		�� ���ڲ���data����ָ��������
 */
private void big() {
	Object [] a1=new Object[a.length*2];
	System.arraycopy(a, 0, a1, 0, i);
	a=a1;
}
/**
 * ��������˶�������
 */
public void getnum() {
	System.out.println(i);
}
/**
 * ��Ҫ�ѵ�ǰ���������е����� ����   ת��    ----�� [123,345,33,44]�ַ���������
 * Ӧ��ֻȡ�����е� size��
 */
public String toString() {
	Object a1[]=new Object[i];
	System.arraycopy(a, 0, a1, 0, i);
	return Arrays.toString(a1);
}


}
