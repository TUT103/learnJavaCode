package Java1课本示例代码.Chapter10.Example10_17;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class WindowReader extends JFrame implements ActionListener {
    JFileChooser fileDialog;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem itemSave, itemOpen;
    JTextArea text;
    BufferedReader in;
    FileReader fileReader;
    BufferedWriter out;
    FileWriter fileWriter;

    WindowReader() {
        init();
        setSize(300, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        text = new JTextArea(10, 10);
        text.setFont(new Font("楷体_gb2312", Font.PLAIN, 28));
        add(new JScrollPane(text), BorderLayout.CENTER);
        menuBar = new JMenuBar();
        menu = new JMenu("文件");
        itemSave = new JMenuItem("保存文件");
        itemOpen = new JMenuItem("打开文件");
        itemSave.addActionListener(this);
        itemOpen.addActionListener(this);
        menu.add(itemSave);
        menu.add(itemOpen);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        fileDialog = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("java文件", "java");
        fileDialog.setFileFilter(filter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == itemSave) {
            int state = fileDialog.showSaveDialog(this);
            if (state == JFileChooser.APPROVE_OPTION) {
                try {
                    File dir = fileDialog.getCurrentDirectory();
                    String name = fileDialog.getSelectedFile().getName();
                    System.out.println(name);
                    File file = new File(dir, name);
                    fileWriter = new FileWriter(file);
                    out = new BufferedWriter(fileWriter);
                    out.write(text.getText());
                    out.close();
                    fileWriter.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } else if (e.getSource() == itemOpen) {
            int state = fileDialog.showSaveDialog(this);
            if (state == JFileChooser.APPROVE_OPTION) {
                text.setText(null);
                try {
                    File dir = fileDialog.getCurrentDirectory();
                    String name = fileDialog.getSelectedFile().getName();
                    System.out.println(name);
                    File file = new File(dir, name);
                    fileReader = new FileReader(file);
                    in = new BufferedReader(fileReader);
                    String s;
                    while ((s = in.readLine()) != null) {
                        text.append(s + "\n");
                    }
                    in.close();
                    fileReader.close();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
