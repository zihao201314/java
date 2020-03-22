package text;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        Socket socket = new Socket("127.0.0.1", 8888);
        FileInputStream fis = new FileInputStream("D:\\Ñ¸À×ÏÂÔØ\\VPBjcYTGs.mp4");
        OutputStream fos = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        while((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        fis.close();
        socket.close();
        System.out.println(System.currentTimeMillis()-l);
    }
}
