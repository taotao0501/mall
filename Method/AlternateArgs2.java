package Method;
//可变参数列表作为方法参数的重载问题
/**
 * @author bentaoShe
 * @version 1.0
 */
public class AlternateArgs2 {
    
    /*public int plus(int a,int b){
        System.out.println("不带可变参数的方法被调用！");
        return a+b;
    }*/
    
    public int plus(int... a){
        int sum=0;
        for(int n:a){
            sum+=n;
        }
        System.out.println("带可变参数的方法被调用！");
        return sum;
    }

    public static void main(String[] args) {
        AlternateArgs2 test=new AlternateArgs2();
        System.out.println("和为:"+test.plus(1,2));
        //System.out.println("和为:"+test.plus(1,2,3,4,5,6));
    }
}
