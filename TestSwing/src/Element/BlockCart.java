package Element;

import Data.Data;
import Logic.Logic;
import static Logic.Logic.mixCartBlockStart;
import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import jdk.nashorn.api.tree.CaseTree;

public class BlockCart {
    
    private ArrayList <Cart> block = new ArrayList<Cart>();

    public BlockCart() {
        this.block = block; 
        fillBlock();
    }
    public BlockCart(boolean empty) {
        this.block = block; 
    }
    
    private void fillBlock() {
        for (int lear = 0; lear < 4; lear++) {
            for (int value = 0; value < 9; value++) {
                Cart cart = new Cart(lear, value);
                this.block.add(cart);
            }
        }
    }
    
    public void removeCart(int index) {
        ArrayList <Cart> tempBlock = new ArrayList <Cart>();        
        for (int i = 0; i < this.block.size(); i++) {
            if (i != index) {
                tempBlock.add(this.block.get(i));
            }           
        }
        this.block = tempBlock;
        }
    public void addCart(Cart cart) {
        this.block.add(cart);
    }

    public Cart getCart(int index) {
        return this.block.get(index);
    }
    
    public int getSize() {
        return this.block.size();
    }
    
    public void mixCartBlock() {
        //System.out.println("Запустился mixCartBlock" );
        //System.out.println(Logic.mixCartBlockStart);
        Cart cart = new Cart(0, 0);
        for (int i = 0; i < this.block.size(); i++) {            
            int num = (int) (Math.random()*this.block.size());
            cart = this.block.get(num);
            //System.out.println(i + ": " + cart.getLaer() + " " + cart.getValue());
            this.block.remove(num);
            this.block.add(cart);
        }
        mixCartBlockStart = false;
        //System.out.println(Logic.mixCartBlockStart);

        for (int i = 0; i < this.block.size(); i++) {  
            //System.out.println(i + ": " + this.block.get(i).getLaer() + " " + this.block.get(i).getValue());
        }
    }
    public void sortCartBlock() {
        //System.out.println("Запустился sortCartBlock" );
        Cart cart = new Cart(-1, -1);
        ArrayList <Cart> tref = new ArrayList <Cart>();
        ArrayList <Cart> pik = new ArrayList <Cart>();
        ArrayList <Cart> bub = new ArrayList <Cart>();
        ArrayList <Cart> cherv = new ArrayList <Cart>();
        ArrayList <Cart> all = new ArrayList <Cart>();
        //System.out.println("1");
        for (int i = 0; i < this.block.size(); i++) {
            cart = this.block.get(i);
            String lear = cart.getLaer();
            if (lear.equalsIgnoreCase(Data.getCartLaer(0))) {
                tref.add(cart);                
            }
            if (lear.equalsIgnoreCase(Data.getCartLaer(1))) {
                pik.add(cart);                
            }
            if (lear.equalsIgnoreCase(Data.getCartLaer(2))) {
                bub.add(cart);                
            }
            if (lear.equalsIgnoreCase(Data.getCartLaer(3))) {
                cherv.add(cart);                
            }
        }
        //System.out.println("2");
        /*
        for (int i = 0; i < tref.size(); i++) {  
            System.out.println(i + ": " + tref.get(i).getLaer() + " " + tref.get(i).getValue());
        }
        */
        
        tref = sort(tref);        
        pik = sort(pik);
        bub = sort(bub);
        cherv = sort(cherv);  
        
        
        
        all.addAll(tref); 
        
        all.addAll(pik); 
        all.addAll(bub); 
        all.addAll(cherv); 
        
        this.block.clear();
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i)!= null){
                this.block.add(all.get(i));
            }            
        }
        Logic.sortCartBlockStart = false;
    }
    
    private ArrayList <Cart> sort (ArrayList <Cart> arr){
        ArrayList <Cart> result = new ArrayList <Cart>();
        Cart[] temp = new Cart[9];     
        for (int i = 0; i < arr.size(); i++) {            
            Cart cart = arr.get(i);
            String value = cart.getValue();
            for (int j = 0; j < 9; j++) {                
                if (value.equals(Data.getCartValue(j))) {
                    //System.out.println("3 " + "value:" + value + " j:" + j);
                    temp[j] = cart;
                    break;
                }
            }            
        }
        for (int j = 0; j < 9; j++) {
            result.add(temp[j]);
        }
        return result;
    }
}