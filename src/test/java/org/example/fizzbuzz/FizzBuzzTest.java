package org.example.fizzbuzz;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzbuzz_shouldReturn_expected_result_for_first_20_numbers() {

        List<String> expectedResults = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz");
        
        for (int i = 1; i < expectedResults.size(); i++ ) {
            String expected = expectedResults.get(i-1);
            String actual =  FizzBuzz.fizzbuzz(i);

            Assert.assertEquals(expected, actual);
        } 
    }
}
