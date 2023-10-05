import java.util.Scanner;

/*
 comment in general:

 Worked with Giacomo (did 5.2 and shared), Akhmed (did 5.4 and shared), and Dylan (did 5.3 and 5.7 and shared). I did 5.1, 5.5, and 5.6 and shared).
 
 comment for 5.5:

 DEDUCTION:
 If x is both hoopy and frabjuous, outputs "ping!". If is either one, outputs "pong!".
 If x is even it is hoopy, if it's odd it isn't. 
 If x is a positive integer it's frabjuous, if it's negative or a zero it is not.
 
 THEREFORE:
 If x is an even, positive integer the output will be "ping!".
 If it's either but not both the output will be "pong!". 
 If it's neither there will be no output.
 */

public class Group51 {

public static void main (String[] args) {
       
        int x;

        Scanner input = new Scanner(System.in);
        System.out.println("Tell me a number; ");
        x = input.nextInt();

        if (x < 10 && x > 0) {
            System.out.println("This is a positive single digit number.");
        } else {
            System.out.println("This is not a positive single digit number.");
        }
}

}