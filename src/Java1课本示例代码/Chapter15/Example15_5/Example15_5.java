package Java1课本示例代码.Chapter15.Example15_5;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example15_5 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 10; i <= 50; i = i + 10) {
            list.add(new Integer(i));
        }
        System.out.println("洗牌前，链表中的数据：");
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer n = iter.next();
            System.out.printf("%d\t", n.intValue());
        }
        Collections.shuffle(list);
        System.out.printf("\n洗牌后，链表中的数据\n");
        iter = list.iterator();
        while (iter.hasNext()) {
            Integer n = iter.next();
            System.out.printf("%d\t", n.intValue());
        }
        System.out.printf("\n再向右旋转1次后，链表中的数据\n");
        Collections.rotate(list, 1);
        iter = list.iterator();
        while (iter.hasNext()) {
            Integer n = iter.next();
            System.out.printf("%d\t", n.intValue());
        }
    }
}
