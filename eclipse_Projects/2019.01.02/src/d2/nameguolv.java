package d2;

import java.io.File;
import java.io.FilenameFilter;

/**  
* �ļ���: nameguolv.java 
* ���ߣ���� 
* ʱ�䣺 2019��1��3�� ����6:08:02 
*/
public class nameguolv implements FilenameFilter{

	/* ���� Javadoc��
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
