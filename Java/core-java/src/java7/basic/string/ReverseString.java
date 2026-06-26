package java7.basic.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReverseString {

    static void main(String[] args) {

        String first = first("Ravindra");
        System.out.println("first : "+ first);

        String second  = second("Ravindra");
        System.out.println("second : "+second);

        String reverse = revers("Ravindra");
        System.out.println("reverse : "+ reverse);

        reverseStringBuffer("Ravindra");

    }


    private static String first(String inputStr)
    {
        String outputStr = "";
        char[] arrayStr = inputStr.toCharArray();

        for(int i = arrayStr.length - 1 ; i >= 0; i--){
            outputStr += arrayStr[i];
        }
        return outputStr;
    }

    private static String second(String inputStr){

        String outputStr = "";
        for (int i = inputStr.length() - 1 ; i >= 0; i--){
            outputStr +=  inputStr.charAt(i);
        }
        return outputStr.toString();
    }

    private static String  revers(String input){

        System.out.println(" Stream =:  " + Stream.of(input.split("")));
        return Stream.of(input.split(""))
                .reduce("", (reversed, character) -> character + reversed);
    }

    private static void reverseStringBuffer(String input ) {
        StringBuffer reverse = new StringBuffer(input);
        System.out.println("reverse stringBuffer : "+ reverse.reverse());
    }
}
