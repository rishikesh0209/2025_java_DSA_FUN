package ArraysAndArrayList;
import java.util.Arrays;
// example of simple array 
public class SimpleArrayEg {
    public static void main(String[] args){
        int[] arrNum= new int[5]; //array of primitives

        //priniting eg 1
        for(int i=0;i < arrNum.length;i++){
            arrNum[i]= i;
            System.out.println("Arr of index "+i+" is: "+arrNum[i]);
        }
        // printing with second way
        for(int num:arrNum){
            System.out.print(" "+num);

        }
        System.out.println();
        //printing third example
        System.out.println("Using arrays class: "+Arrays.toString(arrNum));
    }
    
}
