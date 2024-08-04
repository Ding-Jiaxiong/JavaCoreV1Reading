package Chapter3.Section10;

public class ArrayDeclare {

    public static void main(String[] args) {

        int[] a = new int[100];

        int[] smallPrimes = {2, 5, 7, 11, 13};

        // 匿名数组
        smallPrimes = new int[]{17, 19, 23};

        for (int i = 0; i < smallPrimes.length; i++) {
            System.out.print(smallPrimes[i] + " ");
        }

        System.out.println();

        for (int smallPrime : smallPrimes) {
            System.out.println(smallPrime);
        }
    }
}
