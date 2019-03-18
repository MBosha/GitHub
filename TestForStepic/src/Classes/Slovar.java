package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

 public class Slovar{
     List<String> values = new ArrayList<String>();        
     String spain;
     ArrayList<String> english = new ArrayList<>();

     public Slovar(String spain, String english) {
         this.spain = spain;
         this.english.add(english);
     }
        public void addEnglish(String value) {
            this.english.add(value);
        }

        public String getSpain() {
            return this.spain;
        }

        public ArrayList<String> getEnglish() {
            return this.english;
        }
        
        public static void sort (List<Slovar> slovar){
        Slovar temp = null;  
        int t = 0;
        List <Slovar> temp1 = null;
        for(int i = slovar.size()-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( slovar.get(j).spain.charAt(0) > slovar.get(j+1).spain.charAt(0) ){
                    temp = slovar.get(j+1);
                    t = j + 1;
                }
            temp1.add(temp);
            slovar.remove(t);
            
            }
        }
        slovar.clear();
        slovar = temp1;        
    }
       

public static void spanish() {

    Map<String, Value> mapSlovar = null;
    mapSlovar = new HashMap<String, Value>();
    

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
                        str1.setLength(0);
                    };                    
                }
                if (str1.length() > 1 && j == str.length() - 1) {
                    String nstr = str1.toString();
                    promez.add(nstr);
                    str1.setLength(0);
                }               
            }
            System.out.println();
            System.out.println(i + " promez");
            promez.forEach((x) -> System.out.println(x));
            
            Value value = new Value();
            for (int k = 1; k < promez.size(); k++){
                value.addValues(promez.get(k));
                
                      
            }     
            mapSlovar.put(promez.get(0), value);
            promez.clear();            
        }
        
        Slovar.sort(slovar);
        
        System.out.println();
        System.out.println("Словарь");
        mapSlovar.forEach((x, y) -> System.out.println(x + " " + y.toString()));
        
//        for (int l = 0; l < slovar.size(); l++){            
//            System.out.print(slovar.get(l).getSpain() + " ");
//            slovar.get(l).getEnglish().forEach(x -> System.out.println(x));
//        }
    } 
}

 class Value{
     List<String> values;
     public Value() {
         this.values = new ArrayList<String>();
     }


    public void addValues(String values) {
        this.values.add(values);
    }

    public String getValues(int index) {
        return values.get(index);
    }
     
 }
    
   