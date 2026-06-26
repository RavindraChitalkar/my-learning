package java8.functionalInterface;


interface Arithmatic{
     int add(int a, int b);
}

public class TestFunctionalInterface{

    static void main(String[] args) {

        Arithmatic calculate = (a,b) -> a+b;
        System.out.println("Addition is : "+ calculate.add(10,20));

    }
}
