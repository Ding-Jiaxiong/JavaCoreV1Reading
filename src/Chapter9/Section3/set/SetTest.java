package Chapter9.Section3.set;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

/**
 * This program uses a set to print all unique words in System.in.
 *
 * @author Ding Jiaxiong
 * @version 1.12 2015-06-21
 */
public class SetTest {
    public static void main(String[] args) throws IOException {
        var words = new HashSet<String>();
        long totalTime = 0;

        try (var in = new Scanner(Path.of("D:\\JavaCoreV1Reading\\src\\Chapter9\\Section3\\set\\alice30.txt"), StandardCharsets.UTF_8)) {
            while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }

        Iterator<String> iter = words.iterator();
        for (int i = 1; i <= 20 && iter.hasNext(); i++)
            System.out.println(iter.next());
        System.out.println(". . .");
        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");
    }
}
