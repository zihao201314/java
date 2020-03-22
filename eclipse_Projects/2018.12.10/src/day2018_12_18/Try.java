package day2018_12_18;

/**  
* 文件名: Try.java 
* 作者：梓灏 
* 时间： 2018年12月20日 下午3:30:44 
*/
public class Try {

	public static void main(String[] args) {
		Try a=new Try();
			System.out.println(a.zxc("12","0"));
			
	}
	
	public int zxc(String a,String b) {
		int A;
		int B;
		int C=0;
		
		try {
		A=Integer.parseInt(a);
		B=Integer.parseInt(b);
		C=A/B;
		
		} catch (NumberFormatException e) {
	System.out.println("无法解析字符串");
		}catch (Exception e) {
			System.out.println("00000000");
		}finally {
	System.out.println("执行完毕");
		}
		return C;
	}
}
