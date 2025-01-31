package streamsapi;


import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamsExample {
    public static void main(String[] args) {
        // get duplicate Elements
        List<String> list = Stream.of("code", "decode", "code", "java", "java")
                .collect(groupingBy(Function.identity(), counting()))
                .entrySet().stream()
                .filter(es -> es.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);

        // get second highest number
        Optional<Integer> first = IntStream.of(5, 9, 11, 2, 8, 21, 1)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(first.get());
        // find longest string from given array

        String longestString = Stream.of("code", "decode", "code", "software", "developer")
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
                .get();

        System.out.println(longestString);

        // java program to find all elements starts with 1;
        int[] nums = {5, 9, 11, 2, 8, 21, 1};

        List<String> result = Arrays.stream(nums)
                .boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .toList();
        System.out.println(result);
    }


}
