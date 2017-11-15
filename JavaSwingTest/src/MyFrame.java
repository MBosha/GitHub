import javafx.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame {

    MyFrame(String text){
        super(text);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        createMenu();
    }

    private void createMenu() {
        JMenuBar menu = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        for (String fileItem : new String [] { "New", "Exit" }) {
            JMenuItem item = new JMenuItem(fileItem);
            item.setActionCommand(fileItem.toLowerCase());
            item.addActionListener(new NewMenuListener() {
                @Override
                protected void repaintField() {

                }

                @Override
                protected void generate() {

                }

                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {

                }
            });
            fileMenu.add(item);
        }
        fileMenu.insertSeparator(1);

        menu.add(fileMenu);
        setJMenuBar(menu);
    }

    private abstract class NewMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = (String) e.getSource(); ; //getActionCommand();
            if ("exit".equals(command)) {
                System.exit(0);
            }
            if ("new".equals(command)) {
                generate();
                repaintField();
            }
        }

        protected abstract void repaintField();

        protected abstract void generate();

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {

        }
    }
}