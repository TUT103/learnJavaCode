package Java1课本示例代码.Chapter09.Example9_7;

public class Example9_7 {
    public static void main(String[] args) {
        WindowActionEvent win = new WindowActionEvent();
        PoliceListen police = new PoliceListen();
        win.setMyCommandListener(police);
        win.setBounds(300, 300, 460, 360);
        win.setTitle("处理ActionEvent事件");
    }
}
