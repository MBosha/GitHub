package Element;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Label extends JLabel {

    public Label(String text) {
        super(text, CENTER);
        this.setLayout(null);
        this.setSize(20, 20);
        LineBorder thickBorder = new LineBorder(Color.ORANGE, 1);
        this.setBorder(thickBorder);
    }            
}
