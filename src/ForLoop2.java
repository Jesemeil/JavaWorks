import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (; sum <= 100;){
            System.out.print("Enter an integer: ");
            sum = sum + s.nextInt();
        }
        System.out.println("Done: " + sum);
    }
}
