package Java1课本示例代码.Chapter10.Example10_18;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example10_18 {
    public static void main(String[] args) {
        byte[] b = new byte[30];
        try {
            File file = new File("D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10\\Example10_18\\Example10_18.java");
            FileInputStream input = new FileInputStream(file);
            ProgressMonitorInputStream in = new ProgressMonitorInputStream(null, "读取java文件", input);
            ProgressMonitor p = in.getProgressMonitor();
            while (in.read(b) != -1) {
                String s = new String(b);
                System.out.println(s);
                Thread.sleep(1000);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
