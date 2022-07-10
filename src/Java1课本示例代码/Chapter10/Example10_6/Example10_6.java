package Java1课本示例代码.Chapter10.Example10_6;

import java.io.*;

public class Example10_6 {
    public static void main(String[] args) {
        String parent = "D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10";
        File sourceFile = new File(parent, "a.txt");
        File targetFile = new File(parent, "b.txt");
        char c[] = new char[19];
        try{
            Writer out = new FileWriter(targetFile, true);
            Reader in = new FileReader(sourceFile);
            int n = -1;
            while ((n = in.read(c))!=-1){
                out.write(c, 0, n);
            }
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
