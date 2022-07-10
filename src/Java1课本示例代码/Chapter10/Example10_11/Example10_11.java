package Java1课本示例代码.Chapter10.Example10_11;

import java.io.*;

public class Example10_11 {
    public static void main(String[] args) {
        String parent = "D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10\\Example10_11";
        File file = new File(parent, "apple.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream outData = new DataOutputStream(fos);
            outData.writeInt(100);
            outData.writeLong(123456);
            outData.writeFloat(3.1415926f);
            outData.writeDouble(987654321.123456);
            outData.writeBoolean(true);
            outData.writeChars("How are you doing");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream inData = new DataInputStream(fis);
            System.out.println(inData.readInt());
            System.out.println(inData.readLong());
            System.out.println(inData.readFloat());
            System.out.println(inData.readDouble());
            System.out.println(inData.readBoolean());
            char c = '\0';
            while ((c = inData.readChar()) != '\0') {
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
