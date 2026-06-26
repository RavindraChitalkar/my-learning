package java7.basic.string;

/*
3. Write a program to print last non-repeated character from given String?
Ex: Software Services Output: c
*/

public class LastNonRepeated {

    static void main(String[] args) {
        String str = "Software services";
        lastNonRepeated(str);
    }

    private static  void lastNonRepeated(String input){

        for (int i = input.length() - 1 ; i > 0; i--){
            int count = 0 ;
            if(input.charAt(i) !=' '){
                for(int j = 0; j < input.length() ; j++){
                    if(input.charAt(i) == input.charAt(j) && i!=j){
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    System.out.println("Last non-repeated character is : "+input.charAt(i));
                    break;
                }
            }
        }
    }
}
