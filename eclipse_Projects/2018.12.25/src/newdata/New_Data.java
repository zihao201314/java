package newdata;


import java.util.Arrays;

/**  
* 文件名: New_Data.java 
* 作者：梓灏 
* 时间： 2018年12月25日 下午4:00:23 
*/
public class New_Data {

private Object[] a;
/**表示的是容器中用户添加的元素个数*/
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
 * 添加方法
 * 		用户调用一次此方法就可以存储一个数据
 * 		此方法需要完成的功能就是 把ele 放在data数组中
 * @param ele  表示被添加的元素
 */
public void add(Object e) {
	/**
	 * 在添加之前应该先判断是否还有空间，如果没有，扩容（单独的写一个扩容的方法）
	 */
	if(i==a.length) {
		big();
	}
	a[i]=e;
	i++;
}

/**
 * 2返回指定元素的索引位置（第一次出现的位置）
 * @param ele 被查找的元素
 * @return ele元素第一次出现的索引,如果没有这么一个元素  返回一个-1；
 * 		原理： 遍历data数组查找范围应该是[0,size) 
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
 * 删除的原理就是把要求删除的索引之后的每一个元素向前移动一位
 * @param index
 */
public void deleteElementByIndex(int index){
	if(index>=i || index<0){
		throw new ArrayIndexOutOfBoundsException("亲，索引越界了，有效索引范围[0,"+i+")");
	}
//方式2  直接使用数组拷贝方法  原数组和目标数组都是自己
	System.arraycopy(a, index+1, a, index, i-index-1);
	
//方式1	
//	for (int i = 0; i < size-index-1; i++) {
//		data[index+i] = data[index+1+i];
//	}
	
	i--;
}

/**
 *  返回指定索引处的值
 * @param index 传入被查找的索引
 * @return index索引处的元素
 */
public Object getIndex(int z) {
	if(z>=i||z<0) {
		throw new ArrayIndexOutOfBoundsException("亲，索引越界了，有效索引范围[0,"+i+")");
	}
	return a[z];
}




/**
 * 扩容的方法：
 * 		① 创建一个新数组，比以前的更大（策略 data.length * 2）
 * 		② 把原数组中的数据拷贝到新数组
 * 		③ 让内部的data变量指向新数组
 */
private void big() {
	Object [] a1=new Object[a.length*2];
	System.arraycopy(a, 0, a1, 0, i);
	a=a1;
}
/**
 * 获得输入了多少数据
 */
public void getnum() {
	System.out.println(i);
}
/**
 * 需要把当前容器对象中的数据 数组   转成    ----》 [123,345,33,44]字符串并返回
 * 应该只取出其中的 size个
 */
public String toString() {
	Object a1[]=new Object[i];
	System.arraycopy(a, 0, a1, 0, i);
	return Arrays.toString(a1);
}


}
