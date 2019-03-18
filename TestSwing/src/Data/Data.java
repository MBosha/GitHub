
package Data;

public class Data {
    
    public static final String[] cartLaer = {"♠", "♣", "♦", "♥"};
    public static final String[] cartValue = {"6", "7", "8", "9", "10", "J", "Q", "K", "A"};   
    public static int myPanelX = 240;
    public static int myPanelY = 200;
    public static int[] getPanelXY = {240, 200};

    public static String getCartLaer(int index) {
        if ((0 <= index) && (index <= 3)){
            return cartLaer[index];
        }
        return "Z";
    }
    
    public static String getCartValue(int index) {
        if ((0 <= index) && (index <= 9)){
            return cartValue[index];
        }
        return "Z";
    }
    
    public static int[] getPanelXY() {
        int[] result = new int[2];
        result[0] = myPanelX;
        result[1] = myPanelY;
        return result;
    }
}