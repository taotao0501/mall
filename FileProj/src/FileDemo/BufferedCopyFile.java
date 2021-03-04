package FileDemo;

import java.io.*;

public class BufferedCopyFile {
    public static void main(String[] args) {
        try {
            long startTime=System.currentTimeMillis();
            FileOutputStream fos=new FileOutputStream("test_copy.mp4");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            FileInputStream fis = new FileInputStream("test.mp4");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int n=0;
            byte[] b=new byte[2048];
            while((n=bis.read(b))!=-1) {
                //System.out.println(n); 图片二进制流
                bos.write(b,0,n); //保证文件复制前后数据大小一致
                bos.flush();
            }
            fos.close();
            bos.close();
            fis.close();
            bis.close();
            long endTime=System.currentTimeMillis();
            System.out.println(endTime-startTime); // 640
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
