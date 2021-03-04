package Method;

public class AlternateArgs {
    //求和
    public void sum(int... n) {
        int sum=0;
        for(int i:n){
            sum+=i;
        }
        System.out.println("Sum="+sum);
    }
    public static void main(String[] args){
        AlternateArgs aa=new AlternateArgs();
        aa.sum(1);
        aa.sum(1,2);
        aa.sum(1,2,3);
    }
}
