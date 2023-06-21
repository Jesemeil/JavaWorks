import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        System.out.print("Enter an integer between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        do{ System.out.print(n + " is not between 1 and 10 . Try again:  ");
            n = input.nextInt();
        } while (n < 1 || n > 10);
        System.out.println(n + " is between 1 and 10.");
    }
}
