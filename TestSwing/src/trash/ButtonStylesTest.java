package trash;



// Класс представления различного внешнего вида кнопок JButton

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class ButtonStylesTest extends JFrame
{
    private static final long serialVersionUID = 1L;
    public ButtonStylesTest()
    {
        super("Интерфейсы кнопок");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        // Устанавливаем последовательное расположение
        Container container = getContentPane();
        container.setLayout(new FlowLayout( FlowLayout.LEFT, 10, 10));
        
        // Простая кнопка
        JButton button0 = new JButton("Обычная кнопка");
        // Подключение слушателей событий
        button0.addActionListener(new ListenerAction());
        button0.addChangeListener(new ListenerChange());
        // присоединение слушателя прямо на месте
        button0.addItemListener(new ItemListener() {
           public void itemStateChanged(ItemEvent e) {
               System.out.println("Это событие мы не увидим");
        }});
        container.add(button0);
        
        // Кнопка со значками на все случаи жизни
        JButton button1 = new JButton("Кнопка с иконками");
        button1.setIcon        (new ImageIcon("images/copy.png"));
        button1.setRolloverIcon(new ImageIcon("images/cut.png" ));
        button1.setPressedIcon (new ImageIcon("images/open.png"));
        button1.setDisabledIcon(new ImageIcon("images/save.png"));
        // Убираем все ненужные рамки и закраску
        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.setContentAreaFilled(false);
        container.add(button1);
        
        // Кнопка с описанием интерфейса в виде HTML-текста
        JButton button2 = new JButton("<html><h2><font color=\"yellow\">Синяя кнопка");
        //button.setOpaque(true);
        button2.setBackground(Color.blue);
        container.add(button2);
        
        // Изменение выравнивания текста и изображения
        JButton button3 = new JButton("Изменение выравнивания",new ImageIcon("images/exit.png"));
        button3.setMargin                (new Insets(10, 10, 10, 10));
        button3.setVerticalAlignment     (SwingConstants.TOP   );
        button3.setHorizontalAlignment   (SwingConstants.RIGHT );
        button3.setHorizontalTextPosition(SwingConstants.LEFT  );
        button3.setVerticalTextPosition  (SwingConstants.BOTTOM);
        button3.setIconTextGap(10);
        // сделаем кнопку большой, чтобы увидеть выравнивание
        button3.setPreferredSize(new Dimension(300, 100));
        container.add(button3);
        
        // отключенная кнопка
        JButton button4 = new JButton("Выключено");
        button4.setEnabled(false);
        container.add(button4);
        
        // выводим окно на экран
        setSize(400, 350);
        setVisible(true);
    }
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
}