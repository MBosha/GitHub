/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Arrays;

/**
 *
 * @author mikhail.bombin
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] s = new String[3][3];
        s[0][0] = "Bill";
        s[0][1] = "Rob";
        s[1][0] = "Matt";
        s[1][1] = "Jane";
        s[0][1] = "Jane";
        s[0][1] = "Matt";
        System.out.println( Class1.christmasThief(s)[0] );
    }
}