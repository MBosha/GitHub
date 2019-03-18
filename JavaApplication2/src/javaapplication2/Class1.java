/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author mikhail.bombin
 */
public class Class1 {
    public static String[] christmasThief(String[][] coworkers) 
    {
        int len = coworkers.length;
        String[] result = new String[len];
        for (int i = 0; i < len; i++) 
        {
            String s = coworkers[i][1];
            int count = 0;
            for (int j = 0; j < len; j++)
            {
                String s1 = coworkers[j][0];
                if ( s.equals(s1) )
                {
                    count++;
                }
            }
            if ( count == 0 )
            {
                result[i] = s;
            }
        }
        return result;
        
    }
}
