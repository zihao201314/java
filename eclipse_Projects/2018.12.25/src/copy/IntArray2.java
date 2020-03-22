package copy;

import java.util.Arrays;

/**
 * 容器类，内部基于int数组存储数据
 * @author Administrator
 * @version 2.0;
 * 		新增功能：
 * 			1可以创建指定容量的容器对象
 * 			2提供查看用户添加的元素个数的方法
 * 		
 */
public class IntArray2 {
	private int[] data;
	/**表示的是容器中用户添加的元素个数*/
	private int size = 0;
	
	public IntArray2(int len){
		data = new int[len];
	}
	
	public IntArray2(){
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
	public void add(int ele){
		data[size] = ele;
		size++;
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
		int[] temp = new int[size];
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
