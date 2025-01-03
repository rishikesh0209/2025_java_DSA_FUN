package ArraysAndArrayList;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr ={4,1,6,8,23,10,233,0,8,33,121};
        int start = 0;
        int end =arr.length -1;

        while (start<end){
            swap(arr,start,end);
            start ++;
            end --;
        }
        System.out.println("arrray now is :"+Arrays.toString(arr));
    }

    static void swap(int [] arr,int start,int end){
        int temp= arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
