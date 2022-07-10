package Java2课本课后习题代码.Chapter03.Exercise3_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise3_4 {
    public static void main(String[] args) {
        System.out.println("1000以内的完数：");
        int i = 1, n = 1000, temp = 0;
        for (; i <= 1000; i++) {
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    list.add(j);
                    list.add(i / j);
                }
            }
            if (list.size() == 0)
                continue;
            List<Integer> list2 = new ArrayList<>();
            for (int i_:list){
                if (list2.contains(i_)){
                    continue;
                }else {
                    list2.add(i_);
                }
            }
            Collections.sort(list2);
//            System.out.print(i);
//            System.out.print(list2);
            for (int item:list2) {
                sum += item;
            }
//            System.out.println(sum);
            if (sum == 2*i)
                System.out.println(i);
        }

    }
}
