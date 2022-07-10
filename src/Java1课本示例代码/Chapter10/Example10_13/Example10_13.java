package Java1课本示例代码.Chapter10.Example10_13;

import java.io.*;

public class Example10_13 {
    public static void main(String[] args) {
        String parent = "D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10\\Example10_13";
        TV changhong = new TV();
        changhong.setName("长虹电视");
        changhong.setPrice(5678);
        File file = new File(parent, "television.txt");
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(changhong);
            objectOut.close();
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            TV xinfei = (TV) objectIn.readObject();
            System.out.println(xinfei.getName() + xinfei.getPrice());
            objectIn.close();
            xinfei.setName("新飞电视");
            xinfei.setPrice(6666);
            System.out.println("changhong的名字：" + changhong.getName());
            System.out.println("changhong的价格：" + changhong.getPrice());
            System.out.println("xinfei的名字：" + xinfei.getName());
            System.out.println("xinfei的价格：" + xinfei.getPrice());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
