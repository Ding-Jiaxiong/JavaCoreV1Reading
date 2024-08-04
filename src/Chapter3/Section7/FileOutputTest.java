package Chapter3.Section7;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class FileOutputTest {

    public static void main(String[] args) throws IOException {

        PrintWriter writer = new PrintWriter("D:\\JavaCoreV1Reading\\src\\Chatpter3\\Section7\\newwrite.txt", StandardCharsets.UTF_8);

        writer.write("hello dingjiaxiong");

        writer.close();

    }
}
