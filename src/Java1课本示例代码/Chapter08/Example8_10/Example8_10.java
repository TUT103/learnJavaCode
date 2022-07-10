package Java1课本示例代码.Chapter08.Example8_10;

public class Example8_10 {
    public static void main(String[] args) {
        String str = "欢迎大家访问http://www.xiaojiang.cn了解、参观公司";
        String regex1 = "(http://|www).?\\w+.{1}\\w+.{1}\\p{Alpha}+";
        System.out.printf("替换\"%s\"中的网站链接信息后得到的字符串：\n", str);
        str = str.replaceAll(regex1, "*****");
        System.out.println(str + "\n");

        String money = "89,235,678￥";
        System.out.println(money + "转化成数字");
        String regex2 = "[,\\p{Sc}]";
        String s = money.replaceAll(regex2, "");
        long number = Long.parseLong(s);
        System.out.println(number);
    }
}
