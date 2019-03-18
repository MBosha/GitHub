package Element;

import Element.Button;
import Element.Label;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class Frame extends JFrame
{
    private static final long serialVersionUID = 1L;
    //private static int    counter = 0; // счетчик
    private static JLabel label   = null;
    private static String TEMPL   = "Закрытие окна (попыток %d)";
    private static JFrame frame = new JFrame();

    //конструктор фрейма
    public Frame(String name) throws HeadlessException {
        super();
        //имя окна
        this.setTitle(name);
        //сброс автоматической компоновки
        this.setLayout(null);
        // закрывать окно по нажатию на кнопку с крестиком
        this.setDefaultCloseOperation( EXIT_ON_CLOSE );
         //делает фрейм видимым
        this.setVisible(true);
    }
}