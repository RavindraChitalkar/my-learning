package java7.basic.string;

/*
 2. Write a program to print First non-repeated character from given String?
Ex: Software Services Output: o
 */

import java.lang.reflect.Array;

public class FirstNonRepeated {

    static void main(String[] args) {

        //firstNonRepeatedCharacter();
        String str = "Software Services";
        firstNotRepeated(str);
    }


    private static void firstNonRepeatedCharacter() {

        String str = "Software Services";

        char[] character = str.toCharArray();

        for (int i = 0; i < character.length; i++) {


            for (int j = i + 1; j < character.length; j++) {

                System.out.println("second for");
                if (character[i] != character[j]) {

                    System.out.println("-------:" + character[i]);

                }
            }

        }

    }

    private static void firstNotRepeated(String input) {

        for (int i = 0; i < input.length(); i++) {

            int count = 0;
            if (input.charAt(i) != ' ') {
                for(int j = 0 ; j < input.length(); j++){
                    if(input.charAt(i) == input.charAt(j) && i !=j){
                        count++;
                        break;
                    }
                }
            }
            if(count == 0){
                System.out.println("Non repeated character : "+ input.charAt(i));
                break;
            }
        }
    }
}
