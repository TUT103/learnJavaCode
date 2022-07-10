package Java1课本示例代码.Chapter07.Example7_2;

public class Example7_2 {
    public static void main(String[] args) {
        ShowBoard board = new ShowBoard();
        board.showMess(new OutputEnglish());
        board.showMess(new OutputAlphabet() {
            @Override
            public void output() {
                for (char c = 'α'; c <= 'μ'; c++) {
                    System.out.printf("%3c", c);
                }
            }
        });
    }
}
