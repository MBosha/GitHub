
package Classes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import javax.lang.model.element.Element;


public class FactorialStream {
    
    /**
 * Calculates the factorial of the given number n
 *
 * @param n >= 0
 *
 * @return factorial value
 */
    
public static long factorial(long n) {
    // write your code here
    return LongStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y);
    
}


/**
 * Checking if a number is prime
 *
 * @param number to test >= 2
 * @return true if number is prime else false
 */
public static boolean isPrime(final long number) {
    // write your code here
    System.out.println(LongStream.rangeClosed(2, number).map(x -> number%x).count());
    return LongStream.range(2, number).map(x -> number%x).allMatch(x -> x > 0);
}

public static void infoGrades() {
    // put your code here
    Scanner scanner = new Scanner(System.in);
       
    int numStud = 0;
        
    if (scanner.hasNext()) {
        numStud = scanner.nextInt();
    }
    int[] arrStud = new int[numStud];
    int count = 0;
    
    while (scanner.hasNext()) { 
        arrStud[count] = scanner.nextInt();
        count++;
    }
    
    int count5 = (int) Arrays.stream(arrStud).filter(x -> x == 5).count();
    int count4 = (int) Arrays.stream(arrStud).filter(x -> x == 4).count();
    int count3 = (int) Arrays.stream(arrStud).filter(x -> x == 3).count();
    int count2 = (int) Arrays.stream(arrStud).filter(x -> x == 2).count();
    int count1 = (int) Arrays.stream(arrStud).filter(x -> x == 1).count();
    
    System.out.println(count2 + " " + count3 + " " + count4 + " " + count5);

} 


public static BigInteger calcDoubleFactorial(int n) {
    // type your java code here
    /*
    long result = LongStream .rangeClosed(1, n)
            .filter(x -> x%2 == n%2)
            .reduce(1,(acc, x) -> acc * x);
    return BigInteger.valueOf(result);
    */
        
    int count = 1;
    BigInteger result = BigInteger.valueOf(count);
    
    if (n ==0 || n == 1) {
        return result;
    }
    
    do {    
        if (count%2 == n%2){
            result = result.multiply(BigInteger.valueOf(count));
        }
        count++;
    } while (count <= n);
    
    return result;    
}

    
    public static void suM() {
        
        // put your code here
      Scanner scanner = new Scanner(System.in);
      List<Integer> arrL = new ArrayList<Integer>();
      int result = 0;
      
      while (scanner.hasNext()) {
          int num = scanner.nextInt();
          if (num == 0) {
              break;
          }              
          arrL.add(num);          
      }
      

          System.out.println(arrL.stream()
                  .reduce(0, (acc, x) -> acc + x));

      }
    
    public static void nnn() {
        Scanner scanner = new Scanner(System.in);
        int[] num = {0};
        if (scanner.hasNext()) {
          num[0] = scanner.nextInt();
        }
        IntStream.rangeClosed(1, num[0])
                .map(x -> x *x)                
                .filter(x -> x <= num[0])
                .forEach(System.out::println);
    }
    
    public static void squirrelsNuts2() {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[2];
        if (scanner.hasNext()) {
          num[0] = scanner.nextInt();
        }
        if (scanner.hasNext()) {
          num[1] = scanner.nextInt();
        }
        System.out.println(num[1] - num[1]/num[0]*num[0]);
        
    }
    
    public static void polindrom() {
        Scanner scanner = new Scanner(System.in);
        StringBuffer str1 = new StringBuffer(scanner.next());
        StringBuffer str2 = new StringBuffer(str1);
        str2.reverse();
        System.out.println(str1);
        System.out.println(str2);  
        if (str1.toString().equals(str2.toString())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
    public static void spanish() {
        
        List<StringBuffer> engList = new ArrayList<>();
        List<String> promez = new ArrayList<>();
        List<Slovar> slovar = new ArrayList<Slovar>();
        
        Scanner scanner = new Scanner(System.in);
        int numEng = scanner.nextInt();      
        scanner.nextLine();
        while (scanner.hasNextLine()){
            StringBuffer input = new StringBuffer(scanner.nextLine());
            if (input.toString().equals("0")) {break;}
            engList.add(new StringBuffer(input));
        }       
        
        engList.forEach((x) -> System.out.println(x));
        
        for (int i = 0; i < engList.size(); i++){
            StringBuffer str = engList.get(i);
            StringBuffer str1 = new StringBuffer("");
            for (int j = 0; j < str.length(); j++){
                if (Character.isLetter(str.charAt(j))) {
                    str1.append(str.charAt(j));                    
                } else {
                    if (str1.length() > 1 || j == str.length() - 1) {
                        String nstr = str1.toString();
                        promez.add(nstr);
                        System.out.println(str1);
                        str1.setLength(0);
                    };                    
                }
                if (str1.length() > 1 && j == str.length() - 1) {
                    String nstr = str1.toString();
                    promez.add(nstr);
                    System.out.println(str1);
                    str1.setLength(0);
                }               
            }
            System.out.println();
            System.out.println(1 + " promez");
            promez.forEach((x) -> System.out.println(x));
            
            for (int k = 1; k < promez.size(); k++){
                slovar.add(new Slovar (promez.get(0), promez.get(k)));               
            }            
            promez.clear();
            System.out.println();
            System.out.println("map");
            System.out.println(slovar.get(i).getKey());
            slovar.get(i).getValue().forEach(x -> System.out.println(x));
        }
        
        
     
        
    } 
    
    private static class Slovar{
        String key;
        ArrayList<String> value = new ArrayList<>();

        public Slovar(String key, String value) {
            this.key = key;
            this.value.add(value);
        }
        public void addValue(String value) {
            this.value.add(value);
        }

        public String getKey() {
            return key;
        }

        public ArrayList<String> getValue() {
            return value;
        }
        
        
    }
}
/*

*/