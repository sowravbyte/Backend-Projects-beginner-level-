import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Choose a difficulty level to determine your chances.");
        System.out.println("\n");
        int Guessing_number = (int) (Math.random() * 100) + 1;
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println("\n");
        switch (choice) {
            case 1:
                int n = 10;
                System.out.println("Great! You have selected the Easy difficulty level.");
                System.out.println("Let's start the game!");
                int cnt = 0;
                do {
                    System.out.print("Enter your guess:");
                    int guess = sc.nextInt();
                    cnt++;
                    if (guess == Guessing_number) {
                        System.out.printf("Congratulations! You guessed the correct number in %d attempts. %n", cnt);
                        break;
                    }
                    if (guess > Guessing_number) {
                        System.out.printf("Incorrect! The number is less than %d. %n", guess);
                    } else {
                        System.out.printf("Incorrect! The number is greater than %d .%n", guess);
                    }
                    n--;
                    if (n == 0) {
                        System.out.println("\n");
                        System.out.println("Game Over! You have used all your chances.");
                        System.out.printf("The correct number was %d.%n", Guessing_number);
                    }
                } while (n > 0);
                break;
            case 2:
                int n1 = 5;
                System.out.println("Great! You have selected the Medium difficulty level.");
                System.out.println("Let's start the game!");
                int cnt1 = 0;
                do {
                    System.out.print("Enter your guess:");
                    int guess = sc.nextInt();
                    cnt1++;
                    if (guess == Guessing_number) {
                        System.out.printf("Congratulations! You guessed the correct number in %d attempts.%n", cnt1);
                        break;
                    }
                    if (guess > Guessing_number) {
                        System.out.printf("Incorrect! The number is less than %d .%n", guess);
                    } else {
                        System.out.printf("Incorrect! The number is greater than %d .%n", guess);
                    }
                    n1--;
                    if (n1 == 0) {
                        System.out.println("\n");
                        System.out.println("Game Over! You have used all your chances.");
                        System.out.printf("The correct number was %d.%n", Guessing_number);
                    }
                } while (n1 > 0);
                break;
            case 3:
                int n2 = 3;
                System.out.println("Great! You have selected the Hard difficulty level.");
                System.out.println("Let's start the game!");
                int cnt2 = 0;
                do {
                    System.out.print("Enter your guess:");
                    int guess = sc.nextInt();
                    cnt2++;
                    if (guess == Guessing_number) {
                        System.out.printf("Congratulations! You guessed the correct number in %d attempts.%n", cnt2);
                        break;
                    }
                    if (guess > Guessing_number) {
                        System.out.printf("Incorrect! The number is less than %d .%n", guess);
                    } else {
                        System.out.printf("Incorrect! The number is greater than %d .%n", guess);
                    }
                    n2--;
                    if (n2 == 0) {
                        System.out.println("\n");
                        System.out.println("Game Over! You have used all your chances.");
                        System.out.printf("The correct number was %d.%n", Guessing_number);
                    }
                } while (n2 > 0);21
                break;
            default:
                System.out.println("Please enter the valid choice!!!!\n");
                break;
        }
        sc.close();
    }
}
