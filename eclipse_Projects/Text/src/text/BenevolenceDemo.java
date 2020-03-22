package text;

/**  
* 文件名: 你发个.java 
* 作者：梓灏 
* 时间： 2019年11月15日 下午4:40:50 
*/
public class BenevolenceDemo {
	 
    private static final float X_DIVIDED_BY_Y = 0.5f;
    private static final float MAX_X = 35f / X_DIVIDED_BY_Y;
    private static final float MAX_Y = 35f;
    private static final float THRESHOLD = 0.5f;
    private static final float A = 13;
    private static final String LOVE_SENTENCE = "I love You!";
    private static int sentenceIndex = 0;
 
    private static char getSentenceChar() {
        while(true) {
            if (sentenceIndex >= LOVE_SENTENCE.length()) {
                sentenceIndex = 0;
            }
            char c = LOVE_SENTENCE.charAt(sentenceIndex++);
            if(' ' == c) {
                sentenceIndex++;
            } else {
                return c;
            }
        }
    }
 
    public static void main(String[] args) {
        for (int y = 0; y <= MAX_Y; y++) {
            for (int x = 0; x <= MAX_X; x++) {
                System.out.print(func(getY(y), getX(x)) ? getSentenceChar() : '=');
            }
            System.out.println();
        }
    }
 
    public static final float getX(float x) {
        return (x - MAX_X / 2) * X_DIVIDED_BY_Y;
    }
 
    public static final float getY(float y) {
        return MAX_Y / 7f - y;
    }
 
    public static boolean func(float x, float y) {
        return (Math.pow(x, 2) + Math.pow(y, 2) + 
              A * x - A * Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) < THRESHOLD;
    }
}