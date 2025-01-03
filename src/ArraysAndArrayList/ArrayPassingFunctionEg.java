package ArraysAndArrayList;

import java.util.Arrays;

public class ArrayPassingFunctionEg {
        public static void main(String[] args) {
            int[] nums = {0,12,3,4,56,7};
            intChange(nums);
            System.out.println("Array Nums: "+ Arrays.toString(nums));//[99, 12, 3, 4, 56, 7] when you pass array into the function the function paramemter acts a s copy which references to same array object. 
            //Array objects are mutable hence this change occurs.

        }

        static void intChange(int[] arr){
        arr[0] = 99; //the array value of index 0 is changed 
        } 
}
