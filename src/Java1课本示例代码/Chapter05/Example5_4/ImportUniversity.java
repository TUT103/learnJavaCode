package Java1课本示例代码.Chapter05.Example5_4;

public class ImportUniversity extends University {
    void enterRule(double math, double english, double chinese){
        double total = math + english + chinese;
        if (total >= 220)
            System.out.println(total + "分达到大学录取线");
        else
            System.out.println(total + "分未达到大学录取线");
    }
}
