package FileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo2 {
    // 复制文件使用输出字节流
    public static void main(String[] args) {
        try {
            long startTime=System.currentTimeMillis();
            FileInputStream fis = new FileInputStream("test_copy.mp4");
            FileOutputStream fos=new FileOutputStream("testcopy2.mp4");

            int n=0;
            byte[] b=new byte[2048];
            while((n=fis.read(b))!=-1) {
                //System.out.println(n); 图片二进制流
                fos.write(b,0,n); //保证文件复制前后数据大小一致
            }
            fis.close();
            fos.close();
            long endTime=System.currentTimeMillis();
            System.out.println(endTime-startTime); // 742

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
