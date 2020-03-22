package copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Coyp_fanbianyi
{
  public static void main(String[] paramArrayOfString)
    throws Exception
  {
    work1("E:\\WallPaper\\134925.jpg", "C:\\Users\\16685\\Desktop\\1.jpg");
  }
  
  private static void work1(String paramString1, String paramString2)
  {
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(paramString1);Object localObject1 = null;
      try
      {
        FileOutputStream localFileOutputStream = new FileOutputStream(paramString2);Object localObject2 = null;
        try
        {
          byte[] arrayOfByte = new byte['?'];
          int i;
          while ((i = localFileInputStream.read(arrayOfByte)) != -1) {
            localFileOutputStream.write(arrayOfByte, 0, i);
          }
        }
        catch (Throwable localThrowable4)
        {
          localObject2 = localThrowable4;throw localThrowable4;
        }
        finally {}
      }
      catch (Throwable localThrowable2)
      {
        localObject1 = localThrowable2;throw localThrowable2;
      }
      finally
      {
        if (localFileInputStream != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream.close();
            }
            catch (Throwable localThrowable6)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable6);
            }
          } else {
            localFileInputStream.close();
          }
        }
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}
