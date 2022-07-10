package Java1课本示例代码.Chapter08.Example8_18;


import java.util.Random;

public class GetRandomNumber {
    public static int[] getRandomNumber(int max, int amount) {
        int[] randomNumber = new int[amount];
        int index = 0;
        randomNumber[0] = -1;
        Random random = new Random(123);
        while (index < amount) {
            int number = random.nextInt(max) + 1;
            boolean isInArray = false;
            for (int m : randomNumber) {
                if (m == number) {
                    isInArray = true;
                }
            }
            if (isInArray == false) {
                randomNumber[index] = number;
                index++;
            }
        }
        return randomNumber;
    }
}
