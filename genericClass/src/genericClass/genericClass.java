package genericClass;

import java.util.*;

public class genericClass {
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList();
        arrayList.add("aaa");
        arrayList.add("bbb");
        //arrayList.add(1);
        Iterator<String> it=arrayList.iterator();
        while(it.hasNext()) {
            String str= it.next();
            System.out.println("str：" + str);
        }
        LinkedList


    }
}
