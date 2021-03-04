package ValuePass;

/**
 * 基本数据类型：值传递
 */
public class PrimilitaryPass {
    public static void valuePass(int age,float weight) {
        System.out.println("传入的age值："+age);
        System.out.println("传入的weight值："+weight);
        age=23;
        weight=60;
        System.out.println("修改后的age值："+age);
        System.out.println("修改后的weight值："+weight);
    }

    public static void main(String[] args) {
        int age=10;
        int weight=50;
        valuePass(age,weight);
        System.out.println("方法执行后的age："+age);
        System.out.println("方法执行后的weight："+weight);
    }
}
