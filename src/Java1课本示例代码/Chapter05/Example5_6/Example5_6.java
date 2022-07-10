package Java1课本示例代码.Chapter05.Example5_6;

class A {
    Object get() {
        return null;
    }
}

class B extends A {
    Integer get() {
        return new Integer(100);
    }
}

public class Example5_6 {
    public static void main(String[] args) {
        B b = new B();
        Integer t = b.get();
        System.out.println(t.intValue());
    }
}
