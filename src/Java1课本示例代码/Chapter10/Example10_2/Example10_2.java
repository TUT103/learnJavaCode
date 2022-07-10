package Java1课本示例代码.Chapter10.Example10_2;

import java.io.File;

public class Example10_2 {
    public static void main(String[] args) {
        File dirFile = new File("D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10\\Example10_2");
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java");
        String fileName[] = dirFile.list(fileAccept);
        for (String name:fileName){
            System.out.println(name);
        }
    }
}
