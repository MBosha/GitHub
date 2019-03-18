package Element;

import Logic.Logic;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Button extends JButton {

    public Button(String text) {
        super(text);
        this.setLayout(null);
        this.setSize(50, 20);
        LineBorder thickBorder = new LineBorder(Color.ORANGE, 3);
        this.setBorder(thickBorder);  
        this.setBackground(Color.LIGHT_GRAY);
        this.setForeground(Color.red);
        // Подключение слушателей событий
        this.addActionListener(new ListenerAction());
        //this.addChangeListener(new ListenerChange());
    }

    private static class ListenerAction implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            
            if (e.getActionCommand().equalsIgnoreCase("Mix")){
                Logic.mixCartBlockStart = true;
                System.out.println("Нажатие кнопки! От - MIX");
            }
            if (e.getActionCommand().equalsIgnoreCase("Sort")){
                Logic.sortCartBlockStart = true;
                System.out.println("Нажатие кнопки! От - SORT");
            }
            
            if (e.getActionCommand().equalsIgnoreCase("File")){
                Logic.blockCartToFile = true;
                System.out.println("Нажатие кнопки! От - File");
            }
        }
    }
    
    /*

    private static class ListenerChange implements ChangeListener {
        
        public void stateChanged(ChangeEvent e) {
            // Источник события
            Object src = e.getSource();
            System.out.println("Cообщение о смене состояния объекта : " 
                                + src.getClass());
        }
    }
    */
}

/*
// Простая кнопка
        JButton button = new JButton("Обычная кнопка");
        // Подключение слушателей событий
        button.addActionListener(new ListenerAction());
        button.addChangeListener(new ListenerChange());
        // присоединение слушателя прямо на месте
        button.addItemListener(new ItemListener() {
           public void itemStateChanged(ItemEvent e) {
               System.out.println("Это событие мы не увидим");
        }});
        container.add(button);


class ListenerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Нажатие кнопки! От - "+ 
                                e.getActionCommand() + "\n");
        }
    }
    class ListenerChange implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            // Источник события
            Object src = e.getSource();
            System.out.println("Cообщение о смене состояния объекта : " 
                                + src.getClass());
        }
    }
*/
