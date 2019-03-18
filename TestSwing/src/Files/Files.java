package Files;

import Element.BlockCart;
import Logic.Logic;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    
    public static void fileWrite() {
        
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
           // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }
    
     public static void fileRead() {
        
        try(FileReader reader = new FileReader("notes3.txt"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
    }
     public static void blockCartToFile(BlockCart blockCart) {
         final String[] lear = new String[36];
         final String[] value = new String[36];
         
         for (int i = 0; i < 36; i++) {
             lear[i] = blockCart.getCart(i).getLaer();
             value[i] = blockCart.getCart(i).getValue();
         }
         
         try(FileWriter writer = new FileWriter("BlockCart.txt", false))
        {
           // запись всей строки
            for (int i = 0; i < 36; i++) {
                String text = value[i] + ":" + lear[i] + " ";
                writer.write(text);
                writer.append('\n');
            }            
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
            System.out.println("Файл открыт");
        }
         Logic.blockCartToFile = false;
     }
}
