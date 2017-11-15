import java.io.IOException;

public class Main {

    public static void main (String [] args) throws IOException, InterruptedException {

        //Model model = new Model();
        Model model = new Model();
        MyFrame myWindow_1 = new MyFrame("myWindow_1");
        CardPanel myCardPanel_1 = new CardPanel();
        CardPanel myCardPanel_2 = new CardPanel();

        myWindow_1.setBounds(200, 200, 300, 300);

        model.setX(0);
        model.setY(0);
        myWindow_1.add(myCardPanel_1,0);

        model.setX(100);
        model.setY(100);
        myWindow_1.add(myCardPanel_2,1);

        myWindow_1.setVisible(true);

        for (int i = 0; i < 100; i++) {
            model.setX(i);
            model.setY(i + 50);
            myWindow_1.repaint();
            myCardPanel_1.repaint();
            myCardPanel_2.repaint();
            Thread.sleep(10);
        }
    }
}
