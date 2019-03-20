
package Classes;

import java.util.*;



public class MatrixII {

    public static void matrixII() {
                
        Scanner scanner = new Scanner(System.in);
        List<Stroka> massiv = new ArrayList<Stroka>();        
        int num = 0;
        int posX = 0;
        int posY = 0;
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] matrix = new int[x][y];
        Stroka strMas = new Stroka();
        String str = scanner.nextLine();
        for (String retval : str.split(" ")) {
            System.out.println(retval);
        }

//            if (scanner.hasNext()){                               
//                while(lineScan.hasNext()) {
//                    String sym = 
//                    int numS = lineScan.nextInt();
//                    strMas.addInt(numS); 
//                    System.out.println(numS);
//                }
//            }
//            massiv.add(strMas);
//            if (lineScan.hasNext()){
//                if (lineScan.next().equals("n")){
//                    System.out.println("n");
//                    break;
//                }
//            }
//        }
//            System.out.println("*!*");
//              
//        for (int i = 0; i < massiv.size(); i++){
//            for (int j = 0; j < massiv.get(0).stroka.size(); j++){
//                System.out.println(massiv.get(i).stroka.get(j) + " ");                
//                }
//            }
        
//        3 2
//        1 2 3
//        4 5 6
//        7 8 9 n


        System.out.println(massiv.size());
        System.out.println(massiv.get(0).stroka.size());
        for (int i = 0; i < massiv.size(); i++){
            for (int j = 0; j < massiv.get(0).stroka.size(); j++){
                System.out.printf("%2d",matrix[i][j]);
            }
            System.out.println();
            
        }
        //System.out.println(matrixSum(matrix, x, y));
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
            super();
            this.stroka = new ArrayList<Integer>();
        }

        void addInt(int nextInt) {
            this.stroka.add(nextInt);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}