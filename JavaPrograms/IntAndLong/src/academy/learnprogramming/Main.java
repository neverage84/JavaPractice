package academy.learnprogramming;

import com.sun.jdi.IntegerType;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	System.out.printf("The int max is %s and min is %s%n", Integer.MAX_VALUE, Integer.MIN_VALUE);
	System.out.printf("The long max is %s and min is %s%n", Long.MAX_VALUE, Long.MIN_VALUE);
        BigDecimal test = BigDecimal.valueOf(0.7);
        System.out.printf("Value is %.3f%n", test);
    }
}


