import java.util.Scanner;

public class NumberGuessingV1 {

    public static void main(String [] args) {

        Scanner input;
        input = new Scanner(System.in);
        int theNumber;
        int pickedNumber;

        theNumber = (int)(Math.random()*100);
        System.out.println(theNumber);
        System.out.println("Guess a number 1-100 you have 10 guesses");
        pickedNumber = input.nextInt();

        if (pickedNumber==theNumber){
            System.out.println("That is Correct");}
        else if (pickedNumber>theNumber) {
            System.out.println("lower");
        }
        else {
            System.out.println("higher");}


        do {
            System.out.println("Guess again");
            pickedNumber = input.nextInt();

            if (pickedNumber == theNumber) {
                System.out.println("That is Correct");
            } else if (pickedNumber > theNumber) {
                System.out.println("lower");
            } else {
                System.out.println("higher");
            }

        }while (theNumber != pickedNumber);
    }
}


