package Java1课本示例代码.Chapter05.Example5_1;

public class Example5_1 {
    public static void main(String[] args) {
        Student zhang = new Student();
        zhang.age = 17;
        zhang.number = 100101;
        zhang.showPeopleMess();
        zhang.tellNumber();

        int x = 9, y = 29;
        System.out.print("会做加法：");
        int result = zhang.add(x, y);
        System.out.printf("%d+%d=%d\n", x, y, result);
        UniverStudent geng = new UniverStudent();
        geng.age = 21;
        geng.number = 6609;
        geng.showPeopleMess();
        geng.tellNumber();
        System.out.print("会做加法：");
        result = geng.add(x, y);
        System.out.printf("%d+%d=%d\t", x, y, result);
        System.out.print("会做乘法：");
        result = geng.muti(x, y);
        System.out.printf("%d*%d=%d\n", x, y, result);

        System.out.println(zhang instanceof Student);
        System.out.println(zhang instanceof People);
        System.out.println(geng instanceof People);
        System.out.println(geng instanceof UniverStudent);
        System.out.println(zhang instanceof UniverStudent);
    }
}
