package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
    
    public static int vvod(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    public static void matrixOut(){
        int sizeMatrix = vvod();
        int end = sizeMatrix*sizeMatrix;
        int min = 0;
        int max = sizeMatrix - 1;
        int x = 0;
        int y = 0;
        int num = 1;
        if (sizeMatrix == 0) {
            sizeMatrix = 1;
        }
        int [][] matrixX = new int[sizeMatrix][sizeMatrix];
        
        do {
            if ( (end == 1) || (end == 0) )  {
                matrixX[0][0] = end;
                break;
            }
            do {
                matrixX[x][y] = num;
                y++;
                num++;
            } while (y != max);
            do {   
                matrixX[x][y] = num;
                x++;
                num++;                  
            } while (x != max);
            do {   
                matrixX[x][y] = num;
                y--;
                num++;                  
            } while (y != min);
            do {   
                matrixX[x][y] = num;
                x--;
                num++;                  
            } while (x != min);
            max--;
            min++;
            x = min;
            y = min;
            System.out.printf("min%3d max%3d num%3d", min, max, num);
            System.out.println();
            if (end%2 == 1){
                if (num == end){
                    matrixX[x][y] = num;
                }
            }
        } while (num < end);
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                if (j == 0) {
                    System.out.print(" | ");                    
                }
                System.out.printf("%3d", matrixX[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println("----------------------------------");
        }
    }   
}
