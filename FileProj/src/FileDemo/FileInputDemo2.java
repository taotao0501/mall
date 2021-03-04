package FileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("imooc.txt"); //这个是放在该Project当前目录下的
            //1.一个一个读取
            int n=0;
            while((n=fis.read())!=-1) {
                System.out.println((char)n);
            }
            fis.close();

            //2.存放到数组中
            byte[] b=new byte[100];
            fis.read(b,0,9);
            //System.out.println(b);
            for(byte bb:b){
                System.out.println((char) bb);
            }
            System.out.println(new String(b));
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
