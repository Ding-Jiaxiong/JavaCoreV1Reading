package Chapter5.Section5;

public class Test {

    public static double max(double... values) {

        double max = Double.NEGATIVE_INFINITY;
        for (double value : values) {
            if (value > max) max = value;
        }

        return max;

    }

    public static void main(String[] args) {

        System.out.println(max(3.1, 40.4, -5, 20));

    }

}
