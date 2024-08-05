package Chapter9.Section3.treeSet;

import java.util.*;

/**
 * This program sorts a set of Item objects by comparing their descriptions.
 *
 * @author Ding Jiaxiong
 * @version 1.13 2018-04-10
 */
public class TreeSetTest {
    public static void main(String[] args) {
        var parts = new TreeSet<Item>(); // 按照部件编号排序
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        var sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));  // 定制比较器

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
