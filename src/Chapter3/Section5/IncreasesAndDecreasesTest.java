package Chapter3.Section5;

public class IncreasesAndDecreasesTest {

    public static void main(String[] args) {

        int m = 7;
        int n = 7;

        int a = 2 * ++m;
        int b = 2 * n++;

        System.out.println(a);
        System.out.println(b);
    }
}
