package Project3_循环条件语句使用;
/*
1.多个case后面的数值不可以重复
2.switch后面的小括号当中只能是以下数据类型
基本数据类型：byte char short int
应用数据类型:string enum
3.switch语句可以很灵活，前后顺序可以颠倒
4.如果case中无break，将会穿透到下一个case语句执行直到break结束
*/
public class switch使用 {
    public static void main(String[] args) {
        int num = 6;
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Not right!");
                break;
        }
    }
    
}
