package java7.array;

import java.lang.reflect.Array;

public class DuplicateElement {

    static void main(String[] args) {

        int[] elementArray = {2,3,7,5,6,2,8,4,3};

        sortArray(elementArray);

        maxNumber(elementArray);

        minNumber(elementArray);

      // duplicateElement(elementArray);

    }

    private static void duplicateElement(int[] array){

        for(int i = 0 ; i < array.length ; i++){

            for(int j = i+1; j< array.length; j++){
              if(array[i] == array[j]){
                  System.out.println(array[i]);
              }
            }
        }
    }

    private static void sortArray(int[] array){
        for (int i = 0 ; i < array.length ; i ++){

            for (int j = 0 ; j <array.length ; j++){
                int temp = 0;
                if( array[i] < array[j] ){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

      for(int i = 0 ; i <array.length ; i ++){
          System.out.print( " " +array[i]);
      }
    }

    private static void maxNumber( int[] array){

        int maxNum = array[0];

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] > maxNum){
                maxNum = array[i];
            }
        }
        System.out.println();
        System.out.println("maxNumber : " + maxNum);

    }

    private static void minNumber( int[] array){

        int minNum = array[0];;

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] < minNum){
                minNum = array[i];
            }
        }
        System.out.println();
        System.out.println("minNum : " + minNum);

    }
}
