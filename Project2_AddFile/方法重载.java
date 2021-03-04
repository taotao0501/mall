package Project2_AddFile;
/**
 * 方法重载，方法名相同，参数不同
 */
public class 方法重载 {
    public int plus(int m,int n){
        return m+n;
    }

    public double plus(double m, double n){
        return m+n;
    }

    public int plus(int[] arr){
        int sum =0;
        for(int ele:arr)
        sum += ele;
        return sum;
    }


    public static void main(String[] args) {
        
    }
    
}
