
package Classes;

import java.util.*;



public class MatrixII {

    public static void matrixII() {
                
        Scanner scanner = new Scanner(System.in);
        List<Stroka> massiv = new ArrayList<Stroka>();  
        Massiv2D massiv2D = new Massiv2D();
        boolean continues = true;
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine();
        int[][] matrix = new int[x][y];
        
        System.out.println("------------------");
        
        do {
            String str = new String();
            Stroka strMas = new Stroka();
            if (scanner.hasNextLine()){
                str = scanner.nextLine();
            } else {
                break;                
            }            
            for (String retval : str.split(" ")) {
                try {
                    strMas.addInt(Integer.parseInt(retval));
                } catch (NumberFormatException e) {
                    if (retval.equals("n")) {
                        continues = false;
                    }
                }                
            }
            if (continues){
                massiv.add(strMas);
            }
        } while (continues);
        
        for (int i = 0; i < massiv.size(); i++) {
            for (int j = 0; j < massiv.get(i).getSize(); j++) {
                System.out.printf("%3d",massiv.get(i).getInt(j));
            }
            System.out.println();            
        }
        System.out.println(matrixSum(massiv,x,y));
    }    
    
    public static int matrixSum(List<Stroka> matrix, int x, int y) {
        boolean enter = true;
        int startX = 0;
        int satrtY = 0;
        int endX = x;
        int endY = y;
        int sizeX = matrix.size();
        int sizeY = matrix.get(0).getSize();
        int result = 0;
        int sum = 0;
        if (x > sizeX || y > sizeY) {
            return result;
        }
        do {
            for (int i = startX; i < endX; i++){
                for (int j = satrtY; j < endY; j++){
                    sum = sum + matrix.get(i).getInt(j);
                    System.out.print(i + ":" + j + "=" + matrix.get(i).getInt(j) + " ");
                }  
                System.out.println();
            }
            if (sum > result){
                    result = sum;            
                }
            System.out.println("sum: " + sum);
            sum = 0;
            System.out.println("result: " + result);
            System.out.println();
            
            startX++;            
            endX++;
            if (startX + x > sizeX){
                satrtY++;
                endY++;
                startX = 0;
                endX = x;
            }
            if (satrtY + y > sizeY){
                enter = false;
            }
                        
        } while (enter);
        return result;
    }
    
    private static class Stroka {
        List<Integer> stroka;
        
        public Stroka() {
            this.stroka = new ArrayList<Integer>();
        }
        
        int getSize() {
            return this.stroka.size();
        }
        
        int getInt(int index) {
            return this.stroka.get(index);
        }

        void addInt(int nextInt) {
            this.stroka.add(nextInt);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class Massiv2D {
        
        List<Stroka> massiv;
        
        public Massiv2D() {
            this.massiv = new ArrayList<Stroka>();
        }
        
        void addInt(int addInt, int x, int y) {
            if (x < this.massiv.size()){
                if (y < this.massiv.get(x).getSize()){
                    this.massiv.get(x).stroka.set(y, addInt);
                }
            }                        
        }
        int getInt(int x, int y){
            if (x < this.massiv.size()){
                if (y < this.massiv.get(x).getSize()){
                    return this.massiv.get(x).stroka.get(y);
                }
            }
            Integer intNull = null;
            return intNull;            
        }        
    }
}