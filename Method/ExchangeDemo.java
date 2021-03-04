package Method;
//基本数据类型的传值
public class ExchangeDemo {
    //交换方法
    public void swap(int a,int b){
        int temp;
        System.out.println("交换前: a=" + a +",b=" +b);
        temp=a;a=b;b=temp;
        System.out.println("交换后: a=" + a + ",b=" +b);
    }
    public void swapTest(){
        int m=4,n=5;
        ExchangeDemo ed = new ExchangeDemo();
        System.out.println("交换前: m="+m + ",n=" + n);
        swap(m,n);
        System.out.println("交换后: m="+m + ",n=" + n); 
    }
    public static void main(String[] args) {
        ExchangeDemo ed = new ExchangeDemo();
        //把所有的具体执行方法单独封装好，在主方法种进行调用
        ed.swapTest();
        //结果是 a.b被替换了，而m,n没有任何影响
        //总结：方法中n的值的改变不会改变main方法中n值
    }
}

