package Element;

import Data.Data;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.LineBorder;

public class Cart extends JPanel{
    
    final Label labelL;
    final Label labelV;
    
    public Cart(int lear, int value) {
        super();
        Color color;
        if (lear > 1) {color = Color.RED;}
        else {color = Color.BLUE;}
        this.setLayout(null);
        this.setSize(20, 40);
        LineBorder lineBorder = new LineBorder(Color.ORANGE, 2);
        this.setBorder(lineBorder);        
        labelL = new Label(Data.getCartLaer(lear));
        labelL.setForeground(color);
        labelL.setLocation(0, 0);
        this.add(labelL);
        labelV = new Label(Data.getCartValue(value)); 
        labelV.setForeground(color);
        labelV.setLocation(0, 20);
        this.add(labelV);
    }   
    
    public String getLaer() {
        return this.labelL.getText();
    }
    
    public String getValue() {
        return this.labelV.getText();
    }
}
