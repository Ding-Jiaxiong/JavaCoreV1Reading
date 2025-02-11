package Chapter9.Section6.shuffle;

import java.util.*;

/**
 * This program demonstrates the random shuffle and sort algorithms.
 *
 * @author Ding Jiaxiong
 * @version 1.12 2018-04-10
 */
public class ShuffleTest {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 49; i++)
            numbers.add(i);
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
