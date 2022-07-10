package Java1课本示例代码.Chapter10.Example10_1;

import java.io.File;
import java.io.IOException;

public class Example10_1 {
    public static void main(String[] args) {
        String parent = "D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10";
        File f = new File(parent, "Example10_1");
        System.out.println(f.getName() + "是可读的吗：" + f.canRead());
        System.out.println(f.getName() + "的长度：" + f.length());
        System.out.println(f.getName() + "的绝对路径：" + f.getAbsolutePath());
        File file = new File(parent, "new2.txt");
        System.out.println(file.getParent());
        System.out.println("在当前目录下创建新文件 " + file.getName());
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("创建成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
