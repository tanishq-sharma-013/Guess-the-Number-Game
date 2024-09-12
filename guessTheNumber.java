import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numberToGuess = random.nextInt(101);

        System.out.print("Guess a number between 0-100( or '-1' to exit the game) : ");

        while (true) {
            if(scanner.hasNextInt()){
                int guessedNumber = scanner.nextInt();
            
                if(guessedNumber==-1) {
                    System.out.println("Exited from Game!! GOODBYE!!");
                    break;
                }

                if (numberToGuess<guessedNumber) {
                    System.out.print("Guessed Number is too high!\nTry Again : ");
                } else if (numberToGuess>guessedNumber) {
                    System.out.print("Guessed Number is too low!\nTry again : ");
                } else {
                    System.out.println("Congratulation! You found the number!!\nThe number was : "+numberToGuess);
                    break;
                }
            } else {
                System.out.print("Invalid Input!! Please enter a valid number(between 0-100) : ");
                scanner.next();
            }
        }
    }
    
}
