package Java1课本示例代码.Chapter10.Example10_12;

import Java1课本示例代码.Chapter08.Example8_8.EncryptAndDecrypt;

import java.io.*;

public class Example10_12 {
    public static void main(String[] args) {
        String command = "渡江总攻时间是4月22日晚10点";
        EncryptAndDecrypt person = new EncryptAndDecrypt();
        String password = "Tiger";
        String secret = person.encrypt(command, password);
        File file = new File(
                "D:\\Data\\IDEAProjects\\Java2实用教程_\\src\\Java1课本示例代码\\Chapter10\\Example10_12\\",
                "secret.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream outData = new DataOutputStream(fos);
            outData.writeUTF(secret);
            System.out.println("加密命令：" + secret);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream inData = new DataInputStream(fis);
            String str = inData.readUTF();
            String mingwen = person.decrypt(str, password);
            System.out.println("解密命令：" + mingwen);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
