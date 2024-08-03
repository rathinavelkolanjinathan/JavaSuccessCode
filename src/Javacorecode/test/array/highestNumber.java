package Javacorecode.test.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Analysis
 * If duplicates are not allowed, sort the array (Arrays.sort(…))
 * and get the second last element, which executes in O(nlogn)
 * If duplicates are allowed, loop through each element have
 * two variables to store highest & second highest values. which executes in O(n)
 */

// 2nd highest number
public class highestNumber {
    // using java
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 3, 6, 5};

        int highest = Integer.MIN_VALUE + 1;
        int sec_highest = Integer.MIN_VALUE;

        for (int i : numbers) // b is array of integers
        {
            if (i > highest) // new highest found?
            {
                // highest becomes "second highest"
                sec_highest = highest; // make current highest to second highest
                highest = i; // make current value to highest
            }
            // "i != highest "is to ensure duplicates are not reported as
            // highest & "second highest"
            else if (i > sec_highest && i != highest) // new "second highest" found?
            {
                sec_highest = i;
            }
        }

        System.out.println("sec_highest=" + sec_highest);


        // using  jdk 8
        List<Integer> numbers1 = Arrays.asList(2, 4, 6, 3, 6, 5);

        List<Integer> sortedUniqueNumbers = numbers1.stream()
                .distinct()  // remove duplicates
                .sorted()    // sort
                .collect(Collectors.toList()); // convert stream to list

        System.out.println("sec_highest=" +
                sortedUniqueNumbers.get(sortedUniqueNumbers.size() - 2));


        // using So how about parallelizing the code?

        List<Integer> sortedUniqueNumbers1 = numbers1.parallelStream()
                .distinct()  // remove duplicates
                .sorted()    // sort
                .collect(Collectors.toList()); // convert stream to list

        System.out.println("sec_highest=" +
                sortedUniqueNumbers.get(sortedUniqueNumbers1.size()-2));
    }
}
