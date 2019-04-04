package Classes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class RotateMatrix 
{
    public static void matrixRotate() 
    {
        List<String> list = new ArrayList<>();  
        List<Integer[]> result = new ArrayList<>();
        vvod(list);
        String[] str1 = list.get(0).split(" ");
        
        int xM = Integer.parseInt(str1[0]); 
        int yM = Integer.parseInt(str1[1]);        
        
        List<Integer[]> listInt = list.stream()
                .skip(1)
                .map(x -> {
                    String[] str = x.split(" ");  
                    Integer [] mInt = new Integer[str.length];
                    for (int i = 0; i < str.length; i++) {
                        mInt[i] = Integer.parseInt(str[i]);                        
                    }   
                    return mInt;})                        
                .collect(Collectors.toList());
                
        
        
        for (int i = 0; i < yM; i++) {
            Integer [] mIntRes = new Integer[xM];
            for (int j = 0; j < xM; j++) {
                mIntRes[xM - 1 - j] = listInt.get(j)[i];
            }
            result.add(mIntRes);            
        }
        result.stream().forEach(x -> {            
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + " ");}
            System.out.println();
        });
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

/*
3 4
11 12 13 14
21 22 23 24
31 32 33 34
*/