package Java1课本示例代码.Chapter11.Example11_6;


import javax.swing.*;
import java.util.Arrays;

public class Example11_6 {
    public static void main(String[] args) {
        String[] tableHead;
        String[][] content;
        JTable table;
        JFrame win = new JFrame();
        Query findRecord = new Query();
        findRecord.setDatabaseName("students");
        findRecord.setSQL("SELECT * FROM mess");
        content = findRecord.getRecord();
        tableHead = findRecord.getColumnName();
//        for (String[] i : content) {
//            System.out.println(Arrays.asList(i));
//        }
//        System.out.println(Arrays.asList(tableHead));
        table = new JTable(content, tableHead);
        win.add(new JScrollPane(table));
        win.setBounds(800, 200, 400, 200);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
