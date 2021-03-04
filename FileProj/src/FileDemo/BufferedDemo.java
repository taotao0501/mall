package FileDemo;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("test_copy.mp4");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            FileInputStream fis=new FileInputStream("test_copy2.mp4");
            BufferedInputStream bis=new BufferedInputStream(fis);
            bos.write(50);
            bos.write('a');
            bos.flush();//缓冲区域很大，如果写入的数据很小，那么不会自动写入，需要flush()或者 bos.close()
                       //强制写入
            System.out.println(bis.read());
            System.out.println((char)bis.read());
            fos.close();
            bos.close();
            fis.close();
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
