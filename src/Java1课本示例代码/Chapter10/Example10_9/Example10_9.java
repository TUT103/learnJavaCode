package Java1课本示例代码.Chapter10.Example10_9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Example10_9 {
    public static void main(String[] args) {
        String parent = "D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10\\Example10_9\\Example10_9.java";
        RandomAccessFile in = null;
        try {
            in = new RandomAccessFile(parent, "rw");
            long length = in.length();
            long position = 0;
            in.seek(position);
            while (position < length) {
                String str = in.readLine();
                byte[] b = str.getBytes("iso-8859-1");
                str = new String(b);
                position = in.getFilePointer();
                System.out.println(str);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
