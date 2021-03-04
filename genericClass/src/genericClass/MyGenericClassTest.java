package genericClass;

public class MyGenericClassTest {
    public static void main(String[] args) {
        MyGenericClass<String> test1=new MyGenericClass<String>();
        test1.setT("abc");
        String aa = test1.getT();
        System.out.println(aa);

        MyGenericClass<Integer> test2=new MyGenericClass();
        test2.setT(123);
        System.out.println(test2.getT().getClass());
        Integer bb = test2.getT();
        System.out.println(bb);

    }
}
