import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        switch (n % 2) {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
        }
    }
}
