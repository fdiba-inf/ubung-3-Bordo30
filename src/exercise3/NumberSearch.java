package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
        int numberCounter = 0;
        for(int number = 101; number>100 && number<1000; number++) {
            if(number%5==0 && number%6==0) {
                numberCounter++;
                if(numberCounter<10) {
                    System.out.print(number + " ");
                } else if(numberCounter == 10) {
                    System.out.print(number + "\n");
                } else if(numberCounter < 20) {
                    System.out.print(number + " ");
                } else if(numberCounter == 20) {
                    System.out.print(number + "\n");
                } else if(numberCounter < 30) {
                    System.out.print(number + " ");
                } else if(numberCounter == 30) {
                    System.out.print(number);
                }
            }

        }
    }
}
