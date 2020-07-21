package academy.learnprogramming;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
	    int firstNumber = randomGenerator.nextInt(8) + 2;
	    int secondNumber = randomGenerator.nextInt(8) + 2;

	    var Subtraction = randomGenerator.nextInt(8) + 2;
	    int answer = firstNumber * secondNumber - Subtraction;
	    String prompt = ". Don't type in the answer, just press ENTER when ready to continue";

	    System.out.println("Think of a number between 1 and 10" + prompt);
	    scanner.nextLine();
	    System.out.println("Multiple your number by " + firstNumber + prompt);
	    scanner.nextLine();
        System.out.println("Now multiply the result by " + secondNumber + prompt);
        scanner.nextLine();
        System.out.println("Divide the result by the number you originally thought of "+ prompt);
        scanner.nextLine();
        System.out.println("Now subtract "+ Subtraction + prompt);
        scanner.nextLine();

//        answer = firstNumber * secondNumber - Subtraction;
		System.out.println("The answer is " + answer);

	    scanner.close();
    }
}
