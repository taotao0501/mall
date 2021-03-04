package genericClass;

import java.util.ArrayList;
import java.util.List;

public class BottomBoundWildCard {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        List<Double> a1=new ArrayList();
        a1.add(1.2);
        a1.add(1.3);

        //System.out.println(getList(a1));编译报错

        List<Integer> a2=new ArrayList();
        a2.add(1);
        a2.add(2);
        System.out.println(getList(a2));
    }

    public static List getList(List<? super Integer> list){
        return list;
    }
}
