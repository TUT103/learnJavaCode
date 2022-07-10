package Java1课本示例代码.Chapter06.Example6_4;

interface ComputeAverage {
    public double average(double a, double b);
}

class A implements ComputeAverage {
    @Override
    public double average(double a, double b) {
        double aver = 0;
        aver = (a + b) / 2;
        return aver;
    }
}

class B implements ComputeAverage {
    @Override
    public double average(double a, double b) {
        double aver = 0;
        aver = Math.sqrt(a * b);
        return aver;
    }
}

public class Example6_4 {
    public static void main(String[] args) {
        ComputeAverage compute;
        double a = 11.23;
        double b = 22.78;
        compute = new A();
        double result = compute.average(a, b);
        System.out.printf("%5.2f和%5.2f的算术平均值：%5.2f\n", a, b, result);
        compute = new B();
        result = compute.average(a, b);
        System.out.printf("%5.2f和%5.2f的算术平均值：%5.2f\n", a, b, result);
    }
}
