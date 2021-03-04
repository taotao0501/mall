package FileDemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {
    public static void main(String[] args) throws IOException {
        try{
            FileInputStream fis=new FileInputStream("imooc.txt"); //这个是放在该Project当前目录下的
            int n=0;
            while((n=fis.read())!=-1) {
                System.out.println((char)n);

            }
            fis.close();
        } catch (FileNotFoundException e) {
             e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
