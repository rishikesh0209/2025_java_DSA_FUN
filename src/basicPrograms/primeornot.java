import java.util.Scanner;

public class primeornot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 2;
        double sqrtNum =Math.sqrt(num);
        if(sqrtNum == (int)sqrtNum ){
            System.out.println("Is not a prime number !");
        }
        while(count < sqrtNum){
            if((num % count) == 0){
                System.out.println("Not a prime number");
                break;
            }
            count ++;
        }
        if(count >= sqrtNum){
            System.out.println("Is prime number !");
        }

    }
}
