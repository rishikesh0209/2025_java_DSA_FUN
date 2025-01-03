import java.util.Scanner;

public class NumberOccurence {
        public static void main(String[] args){
            System.out.println("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int number= sc.nextInt();
            System.out.println("Enter the number to count occurence for: ");
            int ocnum = sc.nextInt();
            int count = 0;
            
            while(number > 0){
                int rem = number % 10;
                if(rem ==ocnum){
                    count ++;
                }
                number = number / 10;
            }

            System.out.println("occurence of "+ocnum+" is "+count+ " times");

        }
}
