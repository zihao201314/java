package text;

/**  
* �ļ���: g.java 
* ���ߣ���� 
* ʱ�䣺 2019��11��16�� ����6:57:57 
*/
public class g {

	  public static void main(String argv[]){
          for(float y = (float) 1.5;y>-1.5;y -=0.1)
          {
                 for(float x= (float) -1.5;x<1.5;x+= 0.05)
                 {
                       float a = x*x+y*y-1;
                       if((a*a*a-x*x*y*y*y)<=0.0)
                       {
                              
                              
                              System.out.print("*");
                       
                       }
                       else
                              System.out.print(" ");
                 }
                 System.out.print("\n");
          }}
	  

}
