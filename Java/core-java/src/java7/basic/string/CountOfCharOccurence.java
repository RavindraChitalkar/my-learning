package java7.basic.string;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharOccurence {

    static void main(String[] args) {
        String str = "ravindra";
        numberOfCharOccurence(str);
    }

    private static void numberOfCharOccurence(String input){

        Map<Character, Integer> charOccurence = new HashMap<>();

        for (int i = 0 ; i < input.length() ; i++){
            if(!charOccurence.containsKey(input.charAt(i))){
                charOccurence.put(input.charAt(i), 1);
            }else{
                charOccurence.put(input.charAt(i), charOccurence.get(input.charAt(i)) + 1);
            }
        }
        System.out.println(charOccurence);
    }
}
