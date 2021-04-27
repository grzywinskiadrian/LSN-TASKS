package lsn.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LSNTask3 {

    public static void main(String[] args) throws IOException {
        List<Set<Integer>> graphs = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // read first line with number of lines
        Integer lineCount = Integer.parseInt(reader.readLine());

        // read n lines of integer pairs
        String[] integerPair;
        Integer x, y;
        for (int i = 0; i < lineCount; i++) {
            integerPair = reader.readLine().split("\\s+");
            x = Integer.parseUnsignedInt(integerPair[0]);
            y = Integer.parseUnsignedInt(integerPair[1]);
            findGraphForVerticles(graphs, x, y);
        }

        printResults(graphs.size());
    }

    private static void findGraphForVerticles(List<Set<Integer>> graphs, Integer x, Integer y) {
        // we need to find all graphs that contains x or y and merge them together
        // if any graph doesn't contain any of numbers we create the new one

        // first find all sets that contains verticles
        List<Set<Integer>> suitableGraphs = graphs.stream()
                .filter(set -> set.contains(x) || set.contains(y))
                .collect(Collectors.toList());

        if (suitableGraphs.isEmpty()) {
            // if there is not matching graphs, create new one
            Set<Integer> newSet = new HashSet<>();
            newSet.add(x);
            newSet.add(y);
            graphs.add(newSet);
        } else if (suitableGraphs.size() == 1) {
            // if there is one matching graph, add new verticles
            suitableGraphs.get(0).add(x);
            suitableGraphs.get(0).add(y);
        } else {
            // if there is more matching graphs, merge them and add new verticles
            suitableGraphs.forEach(graphs::remove);
            graphs.add(suitableGraphs.stream()
                    .reduce((set1, set2) -> {
                        set1.addAll(set2);
                        set1.add(x);
                        set1.add(y);
                        return set1;
                    }).orElse(null));
        }
    }

    private static void printResults(Integer count) {
        System.out.println(count);
    }

}
