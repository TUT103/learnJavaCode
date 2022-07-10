package Java1课本示例代码.Chapter09.Example9_9;

import javax.swing.*;
import java.awt.*;

public class WindowDocument extends JFrame {
    private JTextArea inputText, showText;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem itemCopy, itemCut, itemPaste;

    TextListener textChangeListener;
    HandleListener handleListener;

    WindowDocument() {
        init();
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        inputText = new JTextArea(15, 20);
        showText = new JTextArea(15, 20);
        showText.setLineWrap(true);
        showText.setWrapStyleWord(true);
        menuBar = new JMenuBar();
        menu = new JMenu("编辑");
        itemCopy = new JMenuItem("复制（C）");
        itemCut = new JMenuItem("剪切（X）");
        itemPaste = new JMenuItem("粘贴（P）");
        itemCopy.setAccelerator(KeyStroke.getKeyStroke("c"));
        itemCut.setAccelerator(KeyStroke.getKeyStroke("x"));
        itemPaste.setAccelerator(KeyStroke.getKeyStroke("p"));
        itemCopy.setActionCommand("copy");
        itemCut.setActionCommand("cut");
        itemPaste.setActionCommand("paste");
        menu.add(itemCopy);
        menu.add(itemCut);
        menu.add(itemPaste);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        add(new JScrollPane(inputText));
        add(new JScrollPane(showText));
        textChangeListener = new TextListener();
        handleListener = new HandleListener();
        textChangeListener.setInputText(inputText);
        textChangeListener.setShowText(showText);
        (inputText.getDocument()).addDocumentListener(textChangeListener);
        itemCopy.addActionListener(handleListener);
        itemCut.addActionListener(handleListener);
        itemPaste.addActionListener(handleListener);
    }
}
