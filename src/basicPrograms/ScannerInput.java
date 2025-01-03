import java.util.Scanner;

public class ScannerInput {
    public static void main(String args[]){   //String args[] allows to accept command line arguements
        Scanner sc= new Scanner(System.in); //Creates an instance of the Scanner class (sc) to read input from the standard input stream (System.in).
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); //This is to consume the \n character that is left behind after the nextInt() method.
        System.out.println("Enter your fav food: "); 
        String food = sc.nextLine();

        System.out.println("Hello " + name + " of age " + age + ", your fav food is: " + food);



    }
}
