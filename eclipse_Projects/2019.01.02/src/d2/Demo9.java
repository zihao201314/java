package d2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

/**  
* �ļ���: Demo8.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��3�� ����11:10:28 
*/
public class Demo9 {
public static void main(String[] args) throws IOException {
	FileWriter fw =new FileWriter("F:\\ѧϰ\\\\Java��������\\777.txt");
	fw.write("1536546dad1ad561c1d1a56sd16��");
	fw.flush();
	fw.write("63636363");
	fw.close();
	
}
}
