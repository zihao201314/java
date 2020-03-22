package copy;

public class IntArray3Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1 创建一个自定义容器类的对象
		IntArray3 ia1 = new IntArray3(2);
		// 2 向容器中添加数据
		ia1.add(123);
		ia1.add(33);
		ia1.add(33);
		ia1.add(33);
		ia1.add(33);
		ia1.add(12.0);
		ia1.add("adflkjasd");
		ia1.add(new Object());
		ia1.add(true);
		// 3 验证是否添加成功
		System.out.println(ia1);//cn.it.source.list.IntArray@5a2264c
		// 希望得到  [123,345,33,44]  ---> 覆写IntArray的toString方法
		System.out.println(ia1.getSize());
		
	}
}
