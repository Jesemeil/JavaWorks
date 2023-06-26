import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        while(true){
            System.out.print("Enter a number between 1 and 10: ");
            n = input.nextInt();

            if(n < 1 || n > 10)
               continue;


            System.out.println(n + " is between 1 and 10");
            System.out.println("Well done");
            break;

        }
    }
}
