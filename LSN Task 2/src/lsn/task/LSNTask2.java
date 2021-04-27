package lsn.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class LSNTask2 {
    public static final Integer SUM = 13;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // read one line of integers separated by white spaces
        String[] numbers = reader.readLine().split("\\s+");

        TreeMap<Integer, Integer> numberOfOccurrences = new TreeMap<>();

        // count occurrences of all numbers,
        Arrays.stream(numbers)
                .map(Integer::parseInt)
                .forEach(i -> {
                    if(numberOfOccurrences.containsKey(i)) {
                        numberOfOccurrences.compute(i, (key, value) -> value += 1);
                    } else {
                        numberOfOccurrences.put(i, 1);
                    }
                });

        printResults(numberOfOccurrences);

    }

    private static void printResults(TreeMap<Integer, Integer> numberOfOccurrences) {
        numberOfOccurrences.forEach((key, value) -> {
            if (key <= SUM / 2 && numberOfOccurrences.containsKey(SUM - key)) {
                for (int i = 0; i < Math.max(numberOfOccurrences.get(key), numberOfOccurrences.get(SUM - key)); i++) {
                    System.out.println(key + " " + (SUM - key));
                }
            }
        });
    }

}
