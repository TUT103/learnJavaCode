package Java1课本示例代码.Chapter10.Example10_4;

import java.io.*;

public class Example10_4 {
    public static void main(String[] args) {
        int n = -1;
        byte[] a = new byte[1000];
        try {
            String parent = "D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10";
            File f = new File(parent, "Example10_4.java");
            InputStream in = new FileInputStream(f);
            while ((n = in.read(a, 0, a.length)) != -1) {
                String s = new String(a, 0, n);
                System.out.println(s);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
