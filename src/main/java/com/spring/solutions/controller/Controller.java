package com.spring.solutions.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/fizzBuzz/{number}")
	public static List<String> fizzBuzz(@PathVariable int number) 
    { 
        // Declaring a list of strings to store the results 
        List<String> result = new ArrayList<>(); 
  
        // Loop from 1 to n (inclusive) 
        for (int i = 1; i <= number; ++i) { 
            
            // Check if i is divisible by both 3 and 5 
            if (i % 3 == 0 && i % 5 == 0) { 
                
                // Adding "FizzBuzz" to the list 
                result.add("FizzBuzz"); 
            } 
            
            // Check if i is divisible by 3 
            else if (i % 3 == 0) { 
                
                // Adding "Fizz" to the list 
                result.add("Fizz"); 
            } 
            
            // Check if i is divisible by 5 
            else if (i % 5 == 0) { 
                
                // Adding "Buzz" to the result list 
                result.add("Buzz"); 
            } 
            else { 
                
                // Add the current number as a string to the list 
                result.add(Integer.toString(i)); 
            } 
        } 
          return result; 
    } 
}
