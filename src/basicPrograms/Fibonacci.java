import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){
        System.out.println("Enter the number for fibonacci: ");
        Scanner sc = new Scanner(System.in);
        int maxnum = sc.nextInt();
        if(maxnum <=0){
            System.out.println("provide a number more than 0 !");
           
        }else{
            int a = 0;
            int b = 1;
            int count = 1;
            int c;
            System.out.println(a);
            System.out.println(b);
            count ++;
            do {
                c = a+ b;
                System.out.println(c);
                a = b;
                b = c;
            count ++;

            }while(count <= maxnum);
        }
    }
    
}
