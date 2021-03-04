package Charstream;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("imooc2.txt");
            InputStreamReader isr=new InputStreamReader(fis,"GBK");
            BufferedReader br=new BufferedReader(isr);

            FileOutputStream fos=new FileOutputStream("imooc3.txt");
            OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK"); //isr && osw编码保持一致，默认UFT-8
            BufferedWriter bw=new BufferedWriter(osw);
            int n=0;
            char[] cbuf=new char[10];

            while((n=br.read(cbuf))!=-1) {
                //String s=new String(cbuf,0,n);
                //System.out.println(s);
                bw.write(cbuf,0,n);
                bw.flush();
            }
            fis.close();
            isr.close();
            br.close();

            fos.close();
            osw.close();
            bw.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }


}

