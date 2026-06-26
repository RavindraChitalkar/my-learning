package java7.basic.string;

public class RemoveDuplicateFromString {

    static void main(String[] args) {

        String str = "ravindra";
        String output = revmoveDuplicate(str);
        System.out.println("output : "+ output);

    }

    private static String revmoveDuplicate(String input){

        String result = "";
        for(int i = 0 ; i < input.length(); i++){
            int count = 0;
            if(input.charAt(i) !=' '){

                for (int j = i+1 ; j < input.length(); j++){

                    if(input.charAt(i) == input.charAt(j) && i!=j){
                        count++;
                    }
                }
            }
            if(count == 0){
                result += input.charAt(i);
            }
        }
        return result;
    }
 }
