package Charstream;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("imooc2.txt");
            InputStreamReader isr=new InputStreamReader(fis,"GBK");
            FileOutputStream fos=new FileOutputStream("imooc3.txt");
            OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK"); //isr && osw编码保持一致，默认UFT-8
            int n=0;
            char[] cbuf=new char[10];

            while((n=isr.read(cbuf))!=-1) {
                //String s=new String(cbuf,0,n);
                //System.out.println(s);
                osw.write(cbuf,0,n);
                osw.flush();
            }
            fis.close();
            isr.close();
            fos.close();
            osw.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }


}
