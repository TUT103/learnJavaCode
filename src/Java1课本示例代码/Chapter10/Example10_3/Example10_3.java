package Java1课本示例代码.Chapter10.Example10_3;

import java.io.File;
import java.io.IOException;

public class Example10_3 {
    public static void main(String[] args) throws IOException {
        Runtime ce = Runtime.getRuntime();
        File file = new File("D:\\ComputerSoftwaresNormal\\QQ浏览器\\QQBrowser", "QQBrowser.exe");
        try {
            ce.exec(file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
