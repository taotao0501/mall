package Method;
//方法的调试,主要就是可以直接跳进方法内一步一步去运行，在Vscode中，快捷键时是 F11，然后可以F10 step over 单步调试
public class Method_debug_demo {
    //计算长方形的面积
    public int area() {
        int length=10;
        int width=5;
        int getArea=length*width;
        return getArea;
    }

    public static void main(String[] args) {
        Method_debug_demo rc=new Method_debug_demo();
        int area=rc.area();
        System.out.println("长方形的面积为："+ area);
    }
}
