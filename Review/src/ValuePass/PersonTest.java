package ValuePass;

public class PersonTest {
    public static void PersonPass(Person person) {
        System.out.println("传入person的name:" + person.getName());
        person.setName("伏地魔");
        System.out.println("方法内重新赋值后的name："+person.getName());
    }

    public static void main(String[] args) {
        // 1.part1
        Person p = new Person();
        p.setName("哈利波特");
        p.setAge(4);
        PersonPass(p);
        System.out.println("方法执行后的name："+p.getName());
    }
}
