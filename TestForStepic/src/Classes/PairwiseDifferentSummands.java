
package Classes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PairwiseDifferentSummands {
    public static void pairwiseDifferentSummands() 
    {
        List<String> list = new ArrayList<>();  
        List<Integer> result = new ArrayList<>(); 
        vvod(list);
        int num = Integer.parseInt(list.get(0));
        int acc = 0;
        int accNext1 = 1;
        int accNext2 = 1;
        int accPrev = 0;
        
        for (int i = 1; i <= num; i++) 
        {
            accPrev = acc;
            acc = acc + i;
            accNext1 = acc + (i + 1);
            accNext2 = accNext1 + (i + 2);
            if (accNext1 <= num || acc == num)
            {                
                result.add(i);
            } else 
            {
                acc = acc - i;
            }
            /*
            System.out.println("i:        " + i);
            System.out.println("accPrev:  " + accPrev);
            System.out.println("acc:      " + acc);
            System.out.println("accNext1: " + accNext1);
            System.out.println("accNext2: " + accNext2);
            System.out.println("-------------------");
            */
         
        }
        
        System.out.println(result.size());
        result.stream().forEach(x -> {
            System.out.print(x + " ");});
        System.out.println();
        
        
    }
    
    
    private static void vvod(List<String> list)
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit)   
        {
            if (scanner.hasNextLine())
            {
                String str = scanner.nextLine();
                if (str.length() != 0)
                {
                    list.add(str);
                }
                else if (str.length() == 0)
                {
                    exit = true;
                }
            }
        }
    }
    
}
