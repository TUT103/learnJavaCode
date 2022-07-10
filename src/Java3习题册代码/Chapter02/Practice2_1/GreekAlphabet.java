package Java3习题册代码.Chapter02.Practice2_1;

public class GreekAlphabet {
    public static void main(String[] args) {
        int staticPositions = 0, endPositions = 0;
        char cStart = 'α', cEnd = 'ω';
        staticPositions = (int) cStart;
        endPositions = (int) cEnd;
        System.out.println(staticPositions);
        for (int i = staticPositions; i <= endPositions; i++) {
            char c = '\0';
            c = (char) i;
            System.out.print(" " + c);
            if ((i - staticPositions + 1) % 10 == 0)
                System.out.println("");
        }
    }
}
