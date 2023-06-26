import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.print("Enter an integer between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(; n < 1 || n > 10; n= input.nextInt()) {
            System.out.print(n + " is not between 1 and 10 . Try again: ");
        }
    }
}
