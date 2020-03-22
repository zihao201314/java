package d2;

import java.io.File;
import java.io.FilenameFilter;

/**  
* 文件名: nameguolv.java 
* 作者：梓灏 
* 时间： 2019年1月3日 下午6:08:02 
*/
public class nameguolv implements FilenameFilter{

	/* （非 Javadoc）
	 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
	 */
	@Override
	public boolean accept(File dir, String name) {
		if(name.endsWith(".java")) {
			return true;
		}else {
			return false;
		}
	}

}
