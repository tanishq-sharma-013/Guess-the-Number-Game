import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numberToGuess = random.nextInt(101);

        System.out.print("Guess a number between 0-100 : ");

        while (true) {
            
            int guessedNumber = scanner.nextInt();

            if (numberToGuess<guessedNumber) {
                System.out.print("Guessed Number is too high!\nTry Again : ");
            } else if (numberToGuess>guessedNumber) {
                System.out.print("Guessed Number is too low!\nTry again : ");
            } else {
                System.out.println("Congratulation! You found the number!!\nThe number was : "+numberToGuess);
                break;
            }
            
        }
    }
    
}