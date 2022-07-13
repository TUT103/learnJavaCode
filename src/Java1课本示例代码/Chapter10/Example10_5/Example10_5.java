package Java1课本示例代码.Chapter10.Example10_5;

import java.io.*;

public class Example10_5 {
    public static void main(String[] args) {
        String parent = "D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10\\Example10_5";
        byte[] a = "新年快乐".getBytes();
        byte[] b = "Happy New Year".getBytes();
        File file = new File(parent, "a.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            System.out.println(file.getName() + "的大小" + file.length() + "字节");
            out.write(a);
            out.close();
            out = new FileOutputStream(file, true);
            System.out.println(file.getName() + "的大小" + file.length() + "字节");
            out.write(b, 0, b.length);
            System.out.println(file.getName() + "的大小" + file.length() + "字节");
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
