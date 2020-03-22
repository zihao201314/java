package copy;

import java.util.Arrays;

/**
 * 容器类，内部基于int数组存储数据
 * @author Administrator
 * @version 3.0;
 * 		新增功能：
 * 			1 自动扩容（原理）
 * 				当内部存储数据的数组data存满的时候，创建一个新的更大的数组
 * 			2 可以存储任意类型的数据  ---》其实内部使用Object[] 	
 * 		
 */
public class IntArray3 {
	private Object[] data;
	/**表示的是容器中用户添加的元素个数*/
	private int size = 0;
	
	public IntArray3(int len){
		data = new Object[len];
	}
	
	public IntArray3(){
		this(5);
	}
	
	public int getSize(){
		return this.size;
	}
	
	/**
	 * 添加方法
	 * 		用户调用一次此方法就可以存储一个数据
	 * 		此方法需要完成的功能就是 把ele 放在data数组中
	 * @param ele  表示被添加的元素
	 */
	public void add(Object ele){
		/**
		 * 在添加之前应该先判断是否还有空间，如果没有，扩容（单独的写一个扩容的方法）
		 */
		if(size>=data.length){
			ensureCapacity();
		}
		
		data[size] = ele;
		size++;
	}
	
	/**
	 * 扩容的方法：
	 * 		① 创建一个新数组，比以前的更大（策略 data.length * 2）
	 * 		② 把原数组中的数据拷贝到新数组
	 * 		③ 让内部的data变量指向新数组
	 */
	private void ensureCapacity() {
		Object[] temp = new Object[data.length*2];
		System.arraycopy(data, 0, temp, 0, size);
		data = temp;
	}

	/**
	 * 需要把当前容器对象中的数据 数组   转成    ----》 [123,345,33,44]字符串并返回
	 * 应该只取出其中的 size个
	 */
	@Override
	public String toString() {
		
//		return Arrays.toString(data);
		/*
		 * 定义一个新数组，长度   size
		 * 把data中前size个拷贝到新数组
		 * return Arrays.toString(新数组);
		 */
		Object[] temp = new Object[size];
		System.arraycopy(data, 0, temp, 0, size);
		return Arrays.toString(temp);
		
		
		// 方法一
	/*	String str = "[";
		for (int i = 0; i < size; i++) {
			if(i==size-1){
				str += data[i];
			}else{
				str += data[i]+",";
			}
		}
		str += "]";
		return str;*/
	}
}
