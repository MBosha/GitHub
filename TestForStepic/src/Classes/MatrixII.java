
package Classes;

import java.util.*;



public class MatrixII {
    public static void matrixII() {
                
        Scanner scanner = new Scanner(System.in);
        ArrayList<Stroka> massiv = new ArrayList<Stroka>();        
        int num = 0;
        int posX = 0;
        int posY = 0;
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] matrix = new int[x][y];
        boolean weiter = true;
        do {
            if (scanner.hasNextLine()){
                Scanner lineScan = new Scanner(scanner.nextLine());
                Stroka strMas = new Stroka();
                while(lineScan.hasNextInt()) {
                    strMas.addInt(lineScan.nextInt()); 
                    System.out.println(num++);
                    }
                }
                massiv.add(strMas);
                if (!scanner.hasNextLine()){
                    weiter = false;
                }
                
            }
        } while (weiter);
        
//        for (int i = 0; i < x; i++){
//            for (int j = 0; j < y; j++){
//                if (scanner.hasNextInt()){
//                    matrix[i][j] = scanner.nextInt();
//                }
//            }
//            if (scanner.hasNextLine()){
//                scanner.nextLine();
//            }
//        }
        System.out.println(matrix[0].length);
        System.out.println(matrix.length);
        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.printf("%2d",matrix[i][j]);
            }
            System.out.println();
            
        }
        System.out.println(matrixSum(matrix, x, y));
    }    
    public static int matrixSum(int[][] matrix, int x, int y) {
        boolean enter = true;
        int strX = 0;
        int strY = 0;
        int sizeX = matrix.length;
        int sizeY = matrix[0].length;
        int result = 0;
        int sum = 0;
        do {
            for (int i = strX; i < sizeX; i++){
                for (int j = strY; j < sizeY; j++){
                    System.out.println(x + " " + y);
                    sum = sum + matrix[x][y];
                }
            }
            if (sum > result){
                result = sum;
            }
            strX++;            
            if (strX + x > sizeX){
                strY++;
                strX = 0;
            }
            if (strY + x > sizeY){
                enter = false;
            }
            
            
        } while (enter);
        return result;
    }
    private static class Stroka {
        List<Integer> stroka;
        public Stroka() {
            //super();
            this.stroka = new ArrayList<Integer>();
        }

        void addInt(int nextInt) {
            this.stroka.add(nextInt);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}