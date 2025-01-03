package ArraysAndArrayList;

import java.util.Arrays;

public class ArrayofObjects {
    public static void main(String[] args) {
        String[] newArrObj = new String[5]; //strings are reference variables and stored as immutable object.

        System.out.println("data of string array: :" + Arrays.toString(newArrObj)); // if no values provided by defaul the value assigned is null([null, null, null, null, null])
        
    }
}
