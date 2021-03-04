package genericClass;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<String> a1=new ArrayList();
        a1.add("aa");
        a1.add("bb");

        System.out.println(getList(a1));

        List<Integer> a2=new ArrayList();
        a2.add(1);
        a2.add(2);
        System.out.println(getList(a2));
    }

    public static List getList(List<?> list){
        return list;
    }

}
