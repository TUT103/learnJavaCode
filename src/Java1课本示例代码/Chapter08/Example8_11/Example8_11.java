package Java1课本示例代码.Chapter08.Example8_11;

import java.util.Arrays;
import java.util.Scanner;

public class Example8_11 {
    public static void main(String[] args) {
        System.out.println("一行文本：");
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String regex = "[\\s\\d\\p{Punct}]+";
        String [] words = str.split(regex);
        System.out.println(Arrays.toString(words));
    }
}
