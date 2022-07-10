package Java1课本示例代码.Chapter10.Example10_19;

import java.io.File;

public class Example10_19 {
    public static void main(String[] args) {
        File file = new File("D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10\\Example10_19\\WindowFileLock.java");
        WindowFileLock win = new WindowFileLock(file);
        win.setTitle("使用文件锁");
    }
}
