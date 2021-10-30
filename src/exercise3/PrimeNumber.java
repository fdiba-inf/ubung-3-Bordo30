package exercise3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number;
        int divider = 2;
        boolean primeNumber = true;
        number = input.nextInt();
        while(number>2 && divider<=number/2) {
            if(number%divider == 0) {
                primeNumber = false;
            }
            divider++;
        }
        System.out.println("Prime number: " + primeNumber);
    }
}
