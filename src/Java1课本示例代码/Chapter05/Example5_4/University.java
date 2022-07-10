package Java1课本示例代码.Chapter05.Example5_4;

public class University {
    void enterRule(double math, double english, double chinese){
        double total = math + english + chinese;
        if (total >= 180)
            System.out.println(total + "分达到大学录取线");
        else
            System.out.println(total + "分未达到大学录取线");
    }
}
