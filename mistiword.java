import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String words[] = { "APPLE", "COMPUTER", "JAVA", "MOUSE", "PYTHON", "COMPUTER", "DATABASE" };
        Random random = new Random();
        int randomidx = random.nextInt(words.length);
        String guessword = words[randomidx];
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("MYSTIWORD");
        System.out.println("========================================");
        System.out.println("\n");
        System.out.println("1. Start Game");
        System.out.println("2. How to Play");
        System.out.println("3. Exit");
        System.out.println("\n");
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int cnt = 4;
                System.out.println("\n");
                System.out.println("========================================");
                System.out.println("START GAME");
                System.out.println("========================================");
                System.out.println("\n");
                do {
                    System.out.println("Guess the word: ");
                    String guessing_word = sc.next();
                    if (guessing_word.equalsIgnoreCase(guessword)) {
                        System.out.println("Correct! 🎉");
                        System.out.printf("You guessed the word in %d attempts.%n", cnt);
                        break;
                    } else {
                        System.out.println("Incorrect!");
                        System.out.println("Try again.");
                    }
                } while (cnt > 0);
                cnt--;
                if (cnt == 0) {
                    System.out.println("Game Over! The correct word was: " + guessword);
                    break;
                }
                String hints[] = { "The word is a Programming language.",
                        "The word is a fruit.", "The word is a device used to input data into a computer.",
                        "The word is a device used to point and click on a computer screen.",
                        "The word is a type of database management system." };
                if (cnt == 2) {
                    System.out.println("Do you want a hint? (yes/no): ");
                    String hinchoice = sc.next();
                    if (hinchoice.equalsIgnoreCase("yes")) {
                        System.out.println("Hint: " + hints[randomidx]);
                        System.out.println("You have 1 more attempt left.");
                    } else {
                        System.out.println("No hint will be provided. ");
                    }
                }
                break;
            case 2:
                System.out.println("\n");
                System.out.println("========================================");
                System.out.println("HOW TO PLAY");
                System.out.println("========================================");
                System.out.println("\n");
                System.out.println("1. A random word will be selected.");
                System.out.println("2. You have limited attempts.");
                System.out.println("3. Guess the hidden word.");
                System.out.println("4. Use hints when available.");
                System.out.println("\n");
                System.out.println("----------------------------------------");
                System.out.println("Press Enter to return to menu...");
                break;
            case 3:
                System.out.println("\n");
                System.out.println("========================================");
                System.out.println("Thanks for playing!");
                System.out.println(" MYSTIWORD");
                System.out.println("========================================");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
        sc.close();
    }
}
