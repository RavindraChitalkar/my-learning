package java7.basic.string;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharacterCount {

    static void main(String[] args) {
        
        String str ="Ravindra Chitalkar";

        printDuplicateCharacterCount(str);
        printDuplicateCharacterCount2(str);
    }
    
    
    private static void printDuplicateCharacterCount(String input){

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            
            int count = 1;
            for (int j = i + 1; j < input.length(); j++) {

                if(input.charAt(i) == input.charAt(j) && i !=j){

                    count++;
                }
            }
            if(count > 1){
                result += input.charAt(i) +" : " + count + "\n";
            }
        }
        System.out.println("Result : " + result);
    }

    private static void printDuplicateCharacterCount2(String input){

        Map<Character, Integer> characterCount = new HashMap<>();
        int count = 1;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {

            if(input.charAt(i) !=' ')
            if(!characterCount.containsKey(input.charAt(i))){
                characterCount.put(input.charAt(i), count);
            }else{
                characterCount.put(input.charAt(i), characterCount.get(input.charAt(i)) + 1);
            }
        }
        System.out.println("--------------- SECOND -----------------------");
        for (Map.Entry<Character, Integer> map : characterCount.entrySet()){
            if(map.getValue() > 1){
                System.out.println(map.getKey() +" : "+ map.getValue());
            }
        }
        System.out.println("\n--------------- Iterate Map using JAVA 8 -------------------");
        characterCount.forEach((k,v) -> System.out.println(k +" : "+ v));

        System.out.println("-------------\n-----------------");
        characterCount.forEach((k,v) ->{
            if(v > 1){
                System.out.println( k +" : "+ v );
            }
        } );
    }
}
