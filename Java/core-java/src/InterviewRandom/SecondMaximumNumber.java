package InterviewRandom;
import java.util.Arrays;

public class SecondMaximumNumber {

    static void main(String[] args) {

        int[] intArr = {2,4,6,1,7,5};

        int secondMax = Arrays.stream(intArr)
                .distinct()
                .boxed()
                .sorted((a,b) -> b-a)
                .skip(1)
                .findFirst()
                .get();
        System.out.println("secondMax : "+ secondMax);
    }
}
