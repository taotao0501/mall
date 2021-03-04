package Method;
//可变参数列表
//一个方法只能有一个可变参数列表
public class AlternateArgs1 {
    //查找，与数组类似，但是在main方法传递参数赋值中就有差别，数组作为参数时，是不能将多个值传递给数组的
    public void search(int n,int... a) { //可变参数最后放置
        boolean flag=false;
        for(int i:a){
            if(i==n){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("找到了"+n);
        }
        else{
            System.out.println("没找到"+n);
        }
    }
    public static void main(String[] args){
        AlternateArgs1 aa=new AlternateArgs1();
        aa.search(1,1,2,3,4);
        aa.search(1,2);
        aa.search(1,2,3);
    }
}
