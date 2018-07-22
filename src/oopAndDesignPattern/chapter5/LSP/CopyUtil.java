package oopAndDesignPattern.chapter5.LSP;

import java.io.InputStream;
import java.io.OutputStream;

public class CopyUtil {

    public static void copy(InputStream is , OutputStream os)throws  Exception {
        byte[] data = new byte[512];
        int len  = -1;


        while((len = is.read(data)) !=-1){
            System.out.println("------------data :" + data);
            os.write(data,0,len);
        }
    }

}
