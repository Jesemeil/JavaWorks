import java.util.Scanner;

public class AccountTest {
    public static void main (String[] args)  {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s%s%s%.2f%n", account1.getName(), " balance: ", "$",account1.getBalance());
        System.out.printf("%s%s%s%.2f%n%n", account2.getName()," balance: ", "$", account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.printf("%s", "Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%s%.2f%s%n%n"," adding ", depositAmount, " to account1 balance ");
        account1.deposit(depositAmount);
        System.out.printf("%s%s%s%.2f%n", account1.getName(), " balance: ", "$",account1.getBalance());
        System.out.printf("%s%s%s%.2f%n%n", account2.getName()," balance: ", "$", account2.getBalance());

        System.out.printf("%s", "Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%s%.2f%s%n%n"," adding ", depositAmount, " to account2 balance ");
        account2.deposit(depositAmount);
        System.out.printf("%s%s%s%.2f%n", account1.getName(), " balance: ", "$",account1.getBalance());
        System.out.printf("%s%s%s%.2f%n%n", account2.getName()," balance: ", "$", account2.getBalance());
    }


}
