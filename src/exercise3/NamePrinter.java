package exercise3;

import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or name: ");
        String name = input.nextLine();
        for(int i = 0; i < name.length(); i++) {
            System.out.println("* " + name.charAt(i) + " *");
        }

    }
}
