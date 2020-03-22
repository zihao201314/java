package d2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

/**  
* 文件名: Demo8.java 
* 作者：梓灏 
* 时间： 2019年1月3日 下午11:10:28 
*/
public class Demo9 {
public static void main(String[] args) throws IOException {
	FileWriter fw =new FileWriter("F:\\学习\\\\Java基础代码\\777.txt");
	fw.write("1536546dad1ad561c1d1a56sd16啊");
	fw.flush();
	fw.write("63636363");
	fw.close();
	
}
}
