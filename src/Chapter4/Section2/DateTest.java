package Chapter4.Section2;

import java.util.Date;

public class DateTest {

    public static void main(String[] args) {

        System.out.println(new Date());

        Date startTime;
        startTime = new Date();  // 对象变量并不实际包含一个对象，它只是引用

        System.out.println(startTime);

    }
}
