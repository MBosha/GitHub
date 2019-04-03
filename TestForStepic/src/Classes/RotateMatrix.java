package Classes;

import java.util.*;


public class RotateMatrix 
{
    public static void matrixRotate() 
    {
        List<String> list = new ArrayList<>();
        vvod(list);
        list.stream().mapToInt(str -> str.length()).forEach(System.out::println); 
        list.stream().map(x -> x.split(" ")).forEach(System.out::println); 
                
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
        list.forEach(System.out::println);
    }
}

/*
3 4
11 12 13 14
21 22 23 24
31 32 33 34
*/