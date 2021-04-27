package lsn.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LSNTask1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // read one line of integers separated by white spaces
        String[] numbers = reader.readLine().split("\\s+");

        // we need to remember how many integers were in the input
        Integer count = numbers.length;

        // tree set values are always sorted and distinct, we only need to parse input and add it to tree set
        TreeSet<Integer> distinctSortedIntegers = Arrays.stream(numbers)
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(TreeSet::new));

        printResults(distinctSortedIntegers, count);

    }

    private static void printResults(TreeSet<Integer> distinctSortedIntegers, Integer count) {
        distinctSortedIntegers.forEach(s -> {
            System.out.print(s + " ");
        });
        System.out.print("\n");

        System.out.println("count: " + count);
        System.out.println("distinct: " + distinctSortedIntegers.size());
        System.out.println("min: " + distinctSortedIntegers.first());
        System.out.println("max: " + distinctSortedIntegers.last());
    }
}
