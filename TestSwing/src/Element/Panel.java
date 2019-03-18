package Element;

import java.awt.Color;
import javafx.scene.layout.Border;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Panel extends JPanel {

    public Panel() {
        super();
        this.setLayout(null);
        LineBorder thickBorder = new LineBorder(Color.ORANGE, 3);
        this.setBorder(thickBorder);  
        this.setBackground(Color.BLUE);
    }       
}
