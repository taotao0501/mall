package Project2_AddFile;
//3-4数组作为方法参数 下

import java.util.Scanner;

public class ArraySearch {
    //查找数组元素的值的方法
    public boolean search(int n,int[] arr) {
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        
        int[] arr1={1,2,3,45,5,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查找的数据");
        int n1=sc.nextInt();
        ArraySearch search1=new ArraySearch();
        boolean flag = search1.search(n1,arr1);
        if (flag){
            System.out.println("搜到了！");
        }
        else{
            System.out.println("没搜到！");
        }

    }


    
}
