import java.util.Scanner;

public class Group6 {

    public static void main (String[] args){
        
        int A;
        int B;
        int C;
        
        System.out.println("I can complete the quadratic formula for you.");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me your A value; ");
        A = input.nextInt();
        System.out.println("Now, tell me your B value; ");
        B = input.nextInt();
        System.out.println("Okay, tell me your C value now; ");
        C = input.nextInt();

        int notNeg = (B * B) - (4 * A * C);
        int plusVal = ((B * -1) - (notNeg / (2 * A)));
        int minusVal = ((B * -1) + (notNeg / (2 * A)));

        if ((notNeg > 0) && ((A < 0) || (A > 0))) {
            System.out.println("X = " + plusVal + ", " + minusVal);
        } else {
            System.out.println("Error, value cannot be found.");
        }

    }
}