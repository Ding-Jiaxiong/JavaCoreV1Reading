package Chapter3.Section10;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) {

        int[] nums = {3, 2, 1};

        Arrays.sort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
