package Method;
//基本数据类型的传值
public class ExchangeDemo1 {
    public void add(int n){
        n++;
        System.out.println("方法中n="+n);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println("方法调用前n的值:"+n);
        ExchangeDemo1 ed=new ExchangeDemo1();
        ed.add(n);
        System.out.println("方法调用后n的值:"+n);

        //总结：方法中n的值的改变不会改变main方法中n值
    }
}
