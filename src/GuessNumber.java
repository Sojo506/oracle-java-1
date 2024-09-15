import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int userTry = -1;
        int tries = 0;

        while (tries < 5) {
            System.out.println("Ingresa un número entre 0-100: ");
            userTry = sc.nextInt();
            tries++;

            if(tries == 5) break;

            if (userTry == randomNumber) {
                System.out.println("You guessed it!");
                break;
            } else {
                if (userTry > randomNumber) System.out.println("Try lower!");
                else System.out.println("Try higher!");
            }
        }

        if (tries == 5) {
            System.out.printf("\nThe number was: %d%nGood luck next time! 😞", randomNumber);
        }
    }
}
