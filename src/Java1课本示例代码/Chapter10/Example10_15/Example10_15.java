package Java1课本示例代码.Chapter10.Example10_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example10_15 {
    public static void main(String[] args) {
        String parent = "D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10\\Example10_15\\cost.txt";
        File file = new File(parent);
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                try {
                    int price = scanner.nextInt();
                    sum += price;
                    System.out.println(price);
                }
                catch (InputMismatchException exp){
                    System.out.println(scanner.next());
                }
            }
            System.out.println("Total cost " + sum + " dollar");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
