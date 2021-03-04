
package Project4_array使用;

public class bubble_order {
    public static void main(String[] args) {
        int[] a = {34, 53, 12, 32, 56, 17};
        System.out.print("排序前的数组元素为：");
        for(int n:a){
            System.out.print(n + " ");
        }
        int temp;
        for(int i=0; i<a.length -1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j] > a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print("从小到大排序后的数组元素为：");
        for(int n:a){
            System.out.print(n + " ");
        }

    }
    
}
