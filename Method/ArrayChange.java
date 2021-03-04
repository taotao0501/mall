package Method;
//数组的传值，这里涉及到了与前面基本类型数值传值的区别，
//就是主方法的数组和被调用的方法的数组都会被改变，因为这里传的数组d，而不是基本数据类型
//引用类型包括对象和数组 详细参考帖子，但是书上说，对象应用是按值调用
public class ArrayChange {
    //定义一个用于修改某个数组元素值的方法
    public void updateArray(int[] arr){
        arr[3]=12;
        System.out.print("数组的元素为: ");
        for(int n:arr){
            System.out.print(n+"    ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        ArrayChange update1= new ArrayChange();
        System.out.print("调用前数组的元素为: ");
        for(int n:a){
            System.out.print(n+"    ");
        }
        System.out.println();

        update1.updateArray(a);

        System.out.print("调用后数组的元素为: ");
        for(int n:a){
            System.out.print(n+"    ");
        }
    }
    
}
