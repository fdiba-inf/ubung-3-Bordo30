package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angle;
        char specifier;
        double radians;
        double degrees;

        do{
            System.out.print("Enter an angle in radians or degrees: ");
            angle = input.nextDouble();
            specifier = input.next().charAt(0);
            if(specifier == 'r') {
                radians = angle;
                degrees = (180*radians)/Math.PI;
                System.out.println("Angle: " + degrees + "d");
            } else if(specifier == 'd') {
                degrees = angle;
                radians = (Math.PI*degrees)/180;
                System.out.println("Angle: " + radians + "r");
            }

        } while(specifier == 'r' || specifier == 'd');
    }
}
