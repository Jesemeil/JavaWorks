import java.util.Scanner;

public class LuckyNumber {
    public static void main (String[] args) {
        System.out.print("Enter a four digit number: ");
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();

        int firstDigit = d / 1000;
        int secondDigit = (d / 100) % 10;
        int thirdDigit = (d / 10) % 10;
        int fourthDigit = d % 10;

        if(firstDigit + secondDigit == thirdDigit + fourthDigit) System.out.println("Lucky Number");
        else if(d > 9999 ) System.out.println("It is not a four-digit number");
        else if(d < 1000 ) System.out.println("It is not a four-digit number");
        else System.out.println("Not Lucky");

    }
}
