package Java1课本示例代码.Chapter07.Example7_2;

public class OutputEnglish extends OutputAlphabet {
    @Override
    public void output() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.printf("%3c", c);
        }
    }
}
