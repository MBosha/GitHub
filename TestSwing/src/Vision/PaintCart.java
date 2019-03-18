package Vision;

import Data.Data;
import Element.BlockCart;
import Element.Cart;
import Element.Panel;


public class PaintCart {
    
    public static void paintCart(final BlockCart blockCart, final Panel panel) {
        
        int x = 5;
        int y = 5;
        
        for (int k = 0; k < blockCart.getSize(); k++){
            Cart cart = blockCart.getCart(k);
            cart.setLocation(x, y);
            if (x < Data.getPanelXY[0] - 20){
                x = x + 20;
            } else {
                x = 5;
                y = y + 40;
            }
            if (y > Data.getPanelXY[1] - 40){
                y = 5;
            }
            if ( (k+1)%9 == 0){
                x = 5;
                y = y + 45;
            }
            panel.add(cart);
        }
        panel.repaint();
    }
}
