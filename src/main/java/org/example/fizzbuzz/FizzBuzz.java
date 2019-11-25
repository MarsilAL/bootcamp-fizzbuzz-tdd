package org.example.fizzbuzz;

public class FizzBuzz {

    public static void main(String... args) {
        for (int i=1; i<=100; i++) {
            String fizzbuzznumber = fizzbuzz(i);
            System.out.println(fizzbuzznumber);
        }
    }

    public static String fizzbuzz(int number) {
        if (((number % 3) == 0) && ((number % 5) == 0)) {
            return "FizzBuzz";
        }
        else if ((number % 3) == 0) {
            return "Fizz";
        } else if ((number % 5) == 0) {
            return "Buzz";
       
        } else {
            return Integer.toString(number);
        }
    }
}
