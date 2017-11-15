package hollidays;

import java.util.Scanner;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.*;
//import java.awt.event.WindowEvent;

public class Hollidays {

    public static void main(String[] args) {

        ProgrammWindow programWindow = new ProgrammWindow();
        programWindow.setVisible(true);

        programWindow.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                e.getWindow().dispose();
            }
        });
    }

    /*
        System.out.println("Введите текст:");
	Scanner input = new Scanner(System.in, "Windows-1251");
	//Scanner sc = new Scanner(System.in, "Windows-1251");
	Logic.printResult ( Logic.formatText (input.nextLine()) );
     */
}
