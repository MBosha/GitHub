import Data.Data;
import Element.Label;
import Element.Button;
import Element.Panel;
import Element.Frame;
import Element.BlockCart;
import Element.Cart;
import Logic.Logic;
import Files.Files;
import Vision.PaintCart;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        //создается окно
        Frame myFrame = new Frame("C A R T !");  
        myFrame.setLocation(200, 200);
        myFrame.setSize(300, 300);
        myFrame.setVisible(true);

        //создается панель на окне
        Panel panel = new Panel();
        int myPanelX = Data.getPanelXY[0];
        int myPanelY = Data.getPanelXY[1];
        panel.setSize(myPanelX, myPanelY);   
        panel.setLocation(20, 20);
        myFrame.add(panel);
        myFrame.repaint();
        panel.repaint();
        
        Label labelC = new Label(null);
        
        //создание кнопки перемешивания
        Button myButtonMix = new Button("Mix");
        myButtonMix.setLocation(50, 230);
        myFrame.add(myButtonMix);
        myFrame.repaint();
        
        //создание кнопки сортировки
        Button myButtonSort = new Button("Sort");
        myButtonSort.setLocation(120, 230);
        myFrame.add(myButtonSort);
        myFrame.repaint();
        
        //создание кнопки вывода в файл
        Button myButtonOtFile = new Button("File");
        myButtonOtFile.setLocation(190, 230);
        myFrame.add(myButtonOtFile);
        myFrame.repaint();

        //создание колоды карт
        BlockCart blockCart = new BlockCart();
        
        PaintCart.paintCart(blockCart, panel);
        
        labelC.setText(String.valueOf(panel.getComponentCount()));
        labelC.setLocation(0, 230);
        myFrame.add(labelC);
        panel.repaint();
        myFrame.repaint();
        
        while (true) {            
            if (Logic.mixCartBlockStart == true) {
                blockCart.mixCartBlock();
                PaintCart.paintCart(blockCart, panel);   
                panel.repaint();
            }
            if (Logic.sortCartBlockStart == true) {
                blockCart.sortCartBlock();
                PaintCart.paintCart(blockCart, panel);   
                panel.repaint();
            }
            if (Logic.blockCartToFile == true) {
                Files.blockCartToFile(blockCart);
            }
            myFrame.repaint();
            
        }
    }
}
