import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(); //The random number can be negative, zero, or positive.
        int y = random.nextInt(6)+1; // Specifies the upper limit (exclusive). The starting number is 0. generate numbers between 1 to 6 only. as the random int starts from 0 hence the +1 
        System.out.println("x: " +x + " and y:" + y);

        double y1 = random.nextDouble();
        boolean x1 = random.nextBoolean();

        System.out.println("y1: "+y1+ "and x1: " +x1);
    }
}
