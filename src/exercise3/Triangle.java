package exercise3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;

        boolean positive;
        boolean triangle;
        boolean equilateral;
        boolean isosceles;

        do{
            System.out.print("Enter a, b, c: ");
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

            positive = a > 0 && b > 0 && c > 0;
            triangle = a+b>c && b+c>a && a+c>b;
            if (positive && triangle) {

                double halfPerimeter = (a + b + c) / 2;
                double area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
                System.out.println("Area: " + area);

                equilateral = a==b && b==c;
                isosceles = a==b || b==c || a==c;

                if(equilateral) {
                    System.out.println("Triangle: equilateral");
                } else if (isosceles) {
                    System.out.println("Triangle: isosceles");
                } else {
                    System.out.println("Triangle: scalene");
                }
            } else {
                System.out.println("Values are not correct!");
            }
        } while(positive && triangle);
    }
}
