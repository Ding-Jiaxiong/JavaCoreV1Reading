package Chapter3.Section5;

public class DataTypeConvert {

    public static void main(String[] args) {

        int n = 123456789;
        float f = n;

        System.out.println(f);

        System.out.println();

        double x = 9.997;
        int nx = (int) x;

        System.out.println(nx);  // 强制类型转换直接截断小数部分来将浮点转为整型

        System.out.println((int) Math.round(x));  // 四舍五入

    }
}
