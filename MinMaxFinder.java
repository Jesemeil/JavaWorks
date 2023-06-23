package tdd;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = s.nextInt();
        int max = n;
        int min = n;

        if(n >= 0){
            while(true){
                n = s.nextInt();

               if (n< 0){
                   break;
               }

               if (n > max){
                   max =n;
               }

                if (n < min){
                    min =n;
                }

            }
            System.out.println("The maximum number is: " + max +" and the minimum number is: " + min);
        }

        else
            System.out.print(n + " is invalid");
    }
}
