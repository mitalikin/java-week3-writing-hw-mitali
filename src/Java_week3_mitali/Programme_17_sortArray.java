package Java_week3_mitali;
/*Write a java programme to sort a numeric array and a string array.*/

import java.util.Arrays;

public class Programme_17_sortArray {
    public static void main(String[] args) {
        //Numeric array declaration
        int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        //String array declaration
        String[] strArray = {"Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "peter", "kilo"};
        System.out.println("Actual Numerical Array was: " + Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is: " + Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        //Sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));


        ;


    }


}
