package Chapter3.Section7;

public class FormatOutputTest {

    public static void main(String[] args) {

        double x = 10000.0 / 3.0;

        System.out.println(x);

        System.out.printf("%8.2f\n", x);

        System.out.printf("%,.2f", x);

        System.out.println();

        String name = "dingjiaxiong";
        System.out.println("Hello, %s".formatted(name));

    }
}
