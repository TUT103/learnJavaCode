package Java1课本示例代码.Chapter10.Example10_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example10_16 {
    public static void main(String[] args) {
        String parent = "D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10\\Example10_15\\cost.txt";
        File file = new File(parent);
        Scanner scanner;
        int count = 0;
        double sum = 0;
        try {
            double price = 0;
            scanner = new Scanner(file);
            scanner.useDelimiter("[^0123456789.]+");
            while (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                sum += price;
                System.out.println(price);
                count++;
            }
            double average = sum / count;
            System.out.println(average);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
