package Java1课本示例代码.Chapter04.Example4_24;

public class Line {
    InputScore inputScore;
    DelScore delScore;
    ComputerAver computerAver;

    Line() {
        computerAver = new ComputerAver();
        delScore = new DelScore(computerAver);
        inputScore = new InputScore(delScore);
    }

    public void givePersonScore() {
        inputScore.inputScore();
    }
}
