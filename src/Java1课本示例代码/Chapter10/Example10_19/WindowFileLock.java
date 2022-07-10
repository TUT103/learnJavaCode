package Java1课本示例代码.Chapter10.Example10_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class WindowFileLock extends JFrame implements ActionListener {
    JTextArea text;
    JButton button;
    File file;
    RandomAccessFile input;
    FileChannel channel;
    FileLock lock;

    WindowFileLock(File f) {
        file = f;
        try {
            input = new RandomAccessFile(file, "rw");
            channel = input.getChannel();
            lock = channel.tryLock();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        text = new JTextArea();
        button = new JButton("读取一行");
        button.addActionListener(this);
        add(new JScrollPane(text), BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setSize(300, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            lock.release();
            String lineString = input.readLine();
            text.append("\n" + lineString);
            lock = channel.tryLock();
            if (lineString == null) {
                input.close();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
