package ObjectSerizable;

import java.io.*;

public class GoodsTest {
    public static void main(String[] args) {
       Goods goods1=new Goods("gd001","电脑",3000);
        try {
            FileOutputStream fos=new FileOutputStream("imooc.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            FileInputStream fis=new FileInputStream("imooc.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            //将Goods对象信息写入文件
            oos.writeObject(goods1);
            oos.writeBoolean(true);
            oos.flush();
            // System.out.println(ois.readBoolean()); 不要后写先读，无法匹配上
            try {
                Goods goods=(Goods)ois.readObject();
                System.out.println(goods);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            //System.out.println(ois.readBoolean()); //写入什么，读入什么，顺序要一致
            //先写先读

            fos.close();
            oos.close();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
