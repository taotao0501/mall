package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        // 创建对象
        File file1=new File("E:\\JavaProject\\FileProj\\imooc\\io\\abc.txt");
        //File file2=new File("E:\\JavaProject\\FileProj","imooc\\io\\score.txt");

        //判断是文件还是目录
        System.out.println("是否是目录: "+ file1.isDirectory());
        System.out.println("是否是文件: "+ file1.isFile());

        //创建目录
//        File file3=new File("E:\\JavaProject\\FileProj\\imooc\\set\\HashSet");
//        if(!file3.exists()){
//            file3.mkdirs();
//        }
        //创建文件
        if(!file1.exists()) {
            try {
                file1.createNewFile();
                //是否是绝对路径
                System.out.println(file1.isAbsolute());
                //获取相对路径
                System.out.println(file1.getPath());
                //获取绝对路径
                System.out.println(file1.getAbsolutePath());
                //获取文件名
                System.out.println(file1.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
