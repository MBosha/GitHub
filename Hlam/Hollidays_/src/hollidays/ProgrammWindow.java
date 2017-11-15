package hollidays;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author mikhail.bombin
 */
public class ProgrammWindow extends JFrame {

    public ProgrammWindow() {
        super("Hollidays");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 200);

        Button myButton = new Button("Выполнить");

        Label myLabel = new Label("Текст");

        JTextField textField = new JTextField("Текстовое поле", 20);
        textField.setCaretColor(Color.RED);
        textField.setHorizontalAlignment(JTextField.RIGHT);

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        add(myLabel, BorderLayout.NORTH);
        add(myButton, BorderLayout.SOUTH);
        add(textField, BorderLayout.NORTH);
        add(textArea);

        myButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myLabel.setText("Текст");
            }
        });

    }
}
