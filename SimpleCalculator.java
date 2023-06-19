import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.print("Enter num1 op num2 (5 + 7): ");
        Scanner input =new Scanner(System.in);
        double num1 = input.nextDouble();
        char op = input.next().charAt(0);
        double num2 = input.nextDouble();

        if(op == '+') System.out.println(num1 + num2);
        if(op == '-') System.out.println(num1 - num2);
        if(op == '/') System.out.printf("%.3f%n", num1 / num2);
        if(op =='*') System.out.println(num1 * num2);

    }
}
