import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.print("Enter an integer between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n < 1 || n > 10) {
            System.out.print(n + " is not between 1 and 10 . Try again: ");
            n = input.nextInt();
        }
        System.out.println(n + " is between 1 and 10.");
    }
}
