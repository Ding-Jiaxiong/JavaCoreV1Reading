package Chapter3.Section9;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberTest {

    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(100);
        System.out.println(a);

        BigInteger reallyBig = new BigInteger("2222222222222222222222222222222222222222222222222222222222222222");
        System.out.println(reallyBig);

        System.out.println(reallyBig.multiply(BigInteger.valueOf(2)));


        BigDecimal A = BigDecimal.valueOf(10000);
        System.out.println(A);
    }

}
