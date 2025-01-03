import java.util.Scanner;



public class Armstrong {
    public static void main(String[] args){
      
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int refNum = num;
        int count = 0;
        
        while(refNum > 0){
            int rem = refNum % 10;
            count =count + (int) Math.pow(rem,3);
            refNum = refNum / 10;
        }
        if(count == num){
            System.out.println(num + " is not an armstrong number");

        }else{
            System.out.println(num + " is not an armstrong number");
        }


    }
    
}
