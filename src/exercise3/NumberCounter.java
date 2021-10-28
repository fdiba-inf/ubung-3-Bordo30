package exercise3;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 1;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        float sum = 0;
        float average = 0;

        while(number != 0) {
            number = input.nextInt();
            if(number > 0) {
                positiveNumbers++;
            } else if (number < 0){
                negativeNumbers++;
            }
            sum += number;
            average = sum/(positiveNumbers+negativeNumbers);
        }
        System.out.println("Positive numbers: " + positiveNumbers);
        System.out.println("Negative numbers: " + negativeNumbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
