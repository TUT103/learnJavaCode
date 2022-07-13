package Java1课本示例代码.Chapter15.Example15_3;

import java.util.Iterator;
import java.util.LinkedList;

public class Example15_3 {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.add("你");
        myList.add("好");
        int number = myList.size();
        for (int i = 0; i < number; i++) {
            String temp = (String) myList.get(i);
            System.out.println("第" + i + "结点中的数据：" + temp);
        }
        Iterator iter = myList.iterator();
        while (iter.hasNext()) {
            String te = (String) iter.next();
            System.out.println(te);
        }
    }
}
