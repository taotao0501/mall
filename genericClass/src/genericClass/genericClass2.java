package genericClass;

import java.util.ArrayList;
import java.util.List;

public class genericClass2 {
    public static void main(String[] args) {
        List<Integer> alist1=new ArrayList();
        alist1.add(1);

        List<String> alist2=new ArrayList();
        alist2.add("aaa");

        System.out.println(alist1.getClass() == alist2.getClass());
        System.out.println(alist1.getClass());

    }
}
