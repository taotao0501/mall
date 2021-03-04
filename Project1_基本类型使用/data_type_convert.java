package Project1_基本类型使用;
/*强制类型转换
特点：不能自动完成
规则：范围小的类型 范围小的变量名 = （范围小的类型）原本范围大的数据;
 */
public class data_type_convert {
    public static void main(String[] args) {
        int num1 = (int) 100L;
        System.out.println(num1);
    }
}
