import java.util.Scanner;

public class TriangleHypo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side a value: ");
        double a = sc.nextDouble();
        System.out.println("Enter the side b value: ");
        double b = sc.nextDouble();


        System.out.println("The result is: " + Math.sqrt((a*a)+(b*b)));
    }
}
