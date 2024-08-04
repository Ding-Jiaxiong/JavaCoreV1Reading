package Chapter3.Section10;

import java.util.Arrays;

public class CopyofTest {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};

        int[] copy = Arrays.copyOf(a, a.length);

        for (int i : copy) {
            System.out.println(i);
        }

    }
}
