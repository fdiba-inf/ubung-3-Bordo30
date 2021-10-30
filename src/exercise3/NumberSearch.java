package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
        int numberCounter = 0;
        for (int number = 101; number > 100 && number < 1000; number++) {
            if (number % 5 == 0 && number % 6 == 0) {
                if (numberCounter < 9) {
                    System.out.print(number + " ");
                    numberCounter++;
                } else {
                    System.out.println(number);
                    numberCounter = 0;
                }
            }
        }
    }
}
