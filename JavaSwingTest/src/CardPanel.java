import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CardPanel extends Panel {

    Model model = new Model();

    CardPanel(){
        super();
        setSize(25, 50);
    }

    @Override
    public void paint(Graphics g) {

        try {
            Image image = ImageIO.read(new File("C:\\GitHub\\JavaSwingTest\\src\\img\\ace.png"));
            g.drawImage(image, model.getX(), model.getY(), null);
            g.drawImage(image, model.getX(), model.getY() + 25, null);
            g.finalize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}