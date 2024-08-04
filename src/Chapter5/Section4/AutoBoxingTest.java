package Chapter5.Section4;

import java.util.ArrayList;

public class AutoBoxingTest {

    public static void main(String[] args) {

        var list = new ArrayList<Integer>();

        list.add(3);
        // 自动转换成 list.add(Integer.valueOf(3));

        System.out.println(list.get(0));

        int xxx = list.get(0);
//      自动转换成：   int xxx = list.get(0).intValue();

        System.out.println(xxx);

    }

}
