package com.qa.Streams;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
        names.stream()
                .filter(x -> x != "James")
                .forEach(x -> System.out.println("Hello " + x));

        System.out.println("\n---------------\n");

        List<Integer> number = Arrays.asList(3, 4, 7, 8, 12);
        int product = number.stream()
                        .reduce((a,b) -> a*b)
                        .get();
        System.out.println(product);

        System.out.println("\n---------------\n");

        List<Integer> number2 = Arrays.asList(3, 4, 7, 8, 12, 17, 22, 31, 33, 45);
        int max = number2.stream()
                .reduce(Integer::max)
                .get();
        System.out.println(max);

        System.out.println("---");
        int min = number2.stream()
                .reduce(Integer::min)
                .get();
        System.out.println(min);

        System.out.println("---");
        number2.stream()
                .filter(x -> x%2 == 0)
                .forEach(x -> System.out.print(x + " "));

        System.out.println("\n---");
        number2.stream()
                .filter(x -> x%2 != 0)
                .forEach(x -> System.out.print(x + " "));

        System.out.println("\n---");
        int sum = number2.stream()
                .reduce((a,b) -> a+b)
                .get();
        System.out.println(sum);
    }
}
