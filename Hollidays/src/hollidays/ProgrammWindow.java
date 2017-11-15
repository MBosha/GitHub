package hollidays;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.util.ArrayList;
import javax.swing.border.LineBorder;

/**
 *
 * @author mikhail.bombin
 */
public class ProgrammWindow extends JFrame {

    public ProgrammWindow() {
        super("Hollidays");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 600);
        
        JPanel myPanel = new JPanel();
        myPanel.setLayout(new BorderLayout());
        add(myPanel);

        Button myButton = new Button("Отформатировать");
        myPanel.add(myButton, BorderLayout.SOUTH);

        Label myLabel = new Label("Введите текст в поле:");
        myPanel.add(myLabel, BorderLayout.NORTH);

        JTextArea textAreaInput = new JTextArea(20, 50);
        textAreaInput.setBorder(new LineBorder(Color.GRAY));
        textAreaInput.setLineWrap(true);
        textAreaInput.setWrapStyleWord(true);
        myPanel.add(textAreaInput, BorderLayout.WEST);
        
        JTextArea textAreaOutput = new JTextArea(50, 50);
        textAreaOutput.setBorder(new LineBorder(Color.GRAY));
        textAreaOutput.setLineWrap(true);
        textAreaOutput.setWrapStyleWord(true);
        myPanel.add(textAreaOutput, BorderLayout.EAST);
        
        pack();
        setVisible(true);
        setLocationRelativeTo(null);

        myButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                textAreaOutput.setText("");
                ArrayList<String> arrResult = Logic.formatText ( textAreaInput.getText() );
                for (String element : arrResult) {
                    textAreaOutput.append(element + "\n");
                }
            }
        });

    }
}
