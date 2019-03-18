package trash;



// Использование Action при создании кнопки

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

public class AbstractActionTest extends JFrame 
{
    private static final long serialVersionUID = 1L;

    private  final  String  BUTTON_NAME_1 = "button1"; 
    private  final  String  BUTTON_NAME_2 = "button2"; 
    private int count = 0;

    public AbstractActionTest()
    {
        super("Пример использования Action");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Панель содержимого
        Container container = getContentPane();
        // Устанавливаем менеджер последовательного расположения
        container.setLayout(new FlowLayout());
        
        // Создание кнопок, выполняющих одно действие
        //BUTTON_1
        Action action = new SimpleAction();
        JButton button1 = new JButton(action);
        button1.setName(BUTTON_NAME_1);
        button1.setText("First button");
        button1.setMnemonic('F');
        //BUTTON_2
        JButton button2 = new JButton(action);
        button2.setName(BUTTON_NAME_2);
        button2.setText("Second button");
        button2.setMnemonic('S');
        container.add(button1);
        container.add(button2);
        // выводим окно на экран
        setSize(320, 100);
        setVisible(true);
    }
    // Внутренний класс
    class SimpleAction extends AbstractAction {
        private static final long serialVersionUID = 1L;
        SimpleAction() {
                // Параметры команды
                // putValue(NAME, "Класс Action!");
                putValue(SHORT_DESCRIPTION, "Это подсказка");
                // putValue(MNEMONIC_KEY, new Integer('A'));
        }
        // Обработка события нажатия на кнопку
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            System.out.println("Нажатие на кнопку <" + btn.getName() + ">");
            // можно выключить команду, не зная, к каким компонентам она присоединена
            if (btn.getName().equalsIgnoreCase(BUTTON_NAME_1)) {
                btn.setEnabled(false);
                // Изменение надписи
                // putValue(NAME, "Disabled button");
                btn.setText("Disabled button");
            }
            if (btn.getName().equalsIgnoreCase(BUTTON_NAME_2)) {
                //btn.setEnabled(false);
                // Изменение надписи
                btn.setText("PUSH MY");
            }
            
            if (btn.getText().equalsIgnoreCase("PUSH MY")) {
                //btn.setEnabled(false);
                // Изменение надписи
                count++;
                btn.setText("PUSH MY" + " " + count);
            }
            
            if (count == 9) {
                super.setEnabled(false);
                new ButtonStylesTest();
            }
        }
    }
}