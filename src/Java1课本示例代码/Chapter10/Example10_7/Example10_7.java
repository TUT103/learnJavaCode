package Java1课本示例代码.Chapter10.Example10_7;

import java.io.*;
import java.util.StringTokenizer;

public class Example10_7 {
    public static void main(String[] args) {
        String parent = "D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10\\Example10_7";
        File fRead = new File(parent, "english.txt");
        File fWrite = new File(parent, "englishCount.txt");
        try {
            Writer out = new FileWriter(fWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(out);
            Reader in = new FileReader(fRead);
            BufferedReader bufferedReader = new BufferedReader(in);
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                StringTokenizer fenxi = new StringTokenizer(str);
                int count = fenxi.countTokens();
                str = str + "句子中单词个数" + count;
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            out.close();
            in = new FileReader(fWrite);
            bufferedReader = new BufferedReader(in);
            String s = null;
            System.out.println(fWrite.getName() + "内容");
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
            bufferedReader.close();
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
