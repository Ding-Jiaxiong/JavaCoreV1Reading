package Chapter4.Section2;

import java.time.LocalDate;

public class LocalDateTest {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());

        System.out.println(LocalDate.of(2024, 12, 31));
        LocalDate date = LocalDate.of(1999, 10, 1);

        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());

        LocalDate plusDays = date.plusDays(20);
        System.out.println(plusDays);

    }
}
