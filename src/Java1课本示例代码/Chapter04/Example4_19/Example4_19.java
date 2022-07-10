package Java1课本示例代码.Chapter04.Example4_19;

public class Example4_19 {
    public static void main(String[] args) {
        Student zhang = new Student();
        Student geng = new Student();
        zhang.setAge(23);
        System.out.println("zhang的年龄" + zhang.getAge());
        geng.setAge(25);
        System.out.println("geng的年龄" + geng.getAge());
    }
}
