package text;

/**  
* 文件名: fs.java 
* 作者：梓灏 
* 时间： 2019年11月15日 下午4:46:04 
*/
public class Hello {
    
    public static void main(String []args) {
        int x=0;
        int y=0;
        int a1=15;
        int a2=45;
        int b1=0;
        int b2=60;
        int z;
        /*
        for(x=0;x<61;x++) {
            if(x==a1) {
                System.out.print((char)3);
            }else if(x==a2) {
                System.out.print((char)3);
            }else {
                System.out.print(" ");
            }
        }
        */
        while(y<=45) {
            for(x=0;x<61;x++) {
                if(y>15) {
                    break;
                }
                if(x==a1+y) {
                    System.out.print((char)3);
                }else if(x==a1-y){
                    System.out.print((char)3);
                }else if(x==a2+y) {
                    System.out.print((char)3);
                }else if(x==a2-y) {
                    System.out.print((char)3);
                }else {
                    System.out.print(" ");
                }
             
            }
            if(y<=15) {
                System.out.print("\n");
            }
         
            for(x=0;x<61;x++) {
                if(y<=15) {
                    break;
                }
                if(x==b1+(y-15)) {
                    System.out.print((char)3);
                }else if(x==b2-(y-15)) {
                    System.out.print((char)3);
                }else {
                    System.out.print(" ");
                }
            }
            if(y>15) {
                System.out.print("\n");
            }
             
         
        y++;
        }
         
         
         
 
    }
} 