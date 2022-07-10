package Java1课本示例代码.Chapter03;


public class Example3_8 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        char b[] = {'a', 'b', 'c', 'd'};
        for (int n = 0; n < a.length; n++) {
            System.out.println(a[n]);
        }
        for (int n = 0; n < b.length; n++) {
            System.out.println(b[n]);
        }
        for (int i : a) {
            System.out.println(i);
        }
        for (int ch : b) {
            System.out.println(ch);
        }
    }
}
