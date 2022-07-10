package Java1课本示例代码.Chapter04.Example4_22;

public class Rational {
    int numerator = 1;
    int denomerator = 1;

    public void setNumerator(int a) {
        int c = f(Math.abs(a), denomerator);
        numerator = a / c;
        denomerator = denomerator / c;
//        System.out.println(c + numerator + denomerator);
        if (numerator < 0 && denomerator < 0) {
            numerator = -numerator;
            denomerator = -denomerator;
        }
    }

    public void setDenomerator(int b) {
        int c = f(numerator, Math.abs(b));
        numerator = numerator / c;
        denomerator = b / c;
        if (numerator < 0 && denomerator < 0) {
            numerator = -numerator;
            denomerator = -denomerator;
        }
    }

    public int getNumerator() {
        return numerator;
    }


    public int getDenomerator() {
        return denomerator;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denomerator=" + denomerator +
                '}';
    }

    int f(int a, int b) {
        if (a == 0) return 1;
        if (a < b) {
            int c = a;
            a = b;
            b = c;
        }
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public Rational add(Rational r) {
        int a = r.getNumerator();
        int b = r.getDenomerator();
        int newNumerator = numerator * b + denomerator * a;
        int newDenominator = denomerator * b;
        System.out.println("加法：");
        System.out.println(numerator + "*" + b + "+" + denomerator + "*" + a);
        System.out.println(denomerator + "*" + b);
        Rational result = new Rational();
        result.setNumerator(newNumerator);
        result.setDenomerator(newDenominator);
        return result;
    }

    public Rational sub(Rational r) {
        int a = r.getNumerator();
        int b = r.getDenomerator();
        int newNumerator = numerator * b - denomerator * a;
        int newDenominator = denomerator * b;
        System.out.println("减法：");
        System.out.println(numerator + "*" + b + "-" + denomerator + "*" + a);
        System.out.println(denomerator + "*" + b);
        Rational result = new Rational();
        result.setNumerator(newNumerator);
        result.setDenomerator(newDenominator);
        return result;
    }

    public Rational muti(Rational r) {
        int a = r.getNumerator();
        int b = r.getDenomerator();
        int newNumerator = numerator * a;
        int newDenominator = denomerator * b;
        System.out.println("乘法：");
        System.out.println(numerator + "*" + a);
        System.out.println(denomerator + "*" + b);
        Rational result = new Rational();
        result.setNumerator(newNumerator);
        result.setDenomerator(newDenominator);
        return result;
    }

    public Rational div(Rational r) {
        int a = r.getNumerator();
        int b = r.getDenomerator();
        int newNumerator = numerator * b;
        int newDenominator = denomerator * a;
        System.out.println("除法：");
        System.out.println(numerator + "*" + b);
        System.out.println(denomerator + "*" + b);
        Rational result = new Rational();
        result.setNumerator(newNumerator);
        result.setDenomerator(newDenominator);
        return result;
    }
}
