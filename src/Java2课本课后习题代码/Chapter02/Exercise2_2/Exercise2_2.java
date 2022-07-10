package Java2课本课后习题代码.Chapter02.Exercise2_2;

public class Exercise2_2 {
    public static void main(String[] args) {
        int a = (int)'α';
        int  i = 0;
        while (i<30){
            System.out.print((char) (a+i) + " ");
            i++;
        }
    }
}
