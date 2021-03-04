package Project2_AddFile;
//数组作为方法参数的值
public class ArrayMethod {
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] arr1={10,20,30,40};
        ArrayMethod am=new ArrayMethod();
        am.printArray(arr1);
        }
    
}
