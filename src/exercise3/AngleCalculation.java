package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an angle in radians or degrees: ");
        double angle = input.nextDouble();
        char specifier = input.next().charAt(0);
        double radians;
        double degrees;

        do{
            System.out.println("Enter an angle in radians or degrees: ");
            angle = input.nextDouble();
            specifier = input.next().charAt(0);
            if(specifier == 'r') {
                radians = angle;
                degrees = (180*radians)/Math.PI;
                System.out.println("Angle: " + degrees + specifier);
            } else if(specifier == 'd') {
                degrees = angle;
                radians = (Math.PI*degrees)/180;
                System.out.println("Angle: " + radians + specifier);
            }

        } while(specifier == 'r' || specifier == 'd');
    }
}
