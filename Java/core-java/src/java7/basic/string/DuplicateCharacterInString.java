package java7.basic.string;

public class DuplicateCharacterInString {

    static void main(String[] args) {
        String str = "ravindra";
        findDuplicateCharacter(str);
    }

    private static void findDuplicateCharacter(String input){

        for (int i = 0; i < input.length(); i++) {

            int count = 0;
            if (input.charAt(i) != ' '){

                for (int j = i + 1; j < input.length(); j++) {
                    if (input.charAt(i) == input.charAt(j) && i!=j) {
                        count++;
                    }
                }
            }
        if(count == 1)
            System.out.print( input.charAt(i) + " " );
        }
    }
}
