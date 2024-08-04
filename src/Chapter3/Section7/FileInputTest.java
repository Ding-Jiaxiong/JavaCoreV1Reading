package Chapter3.Section7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileInputTest {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(Path.of("D:\\JavaCoreV1Reading\\src\\Chatpter3\\Section7\\test"), StandardCharsets.UTF_8);

        System.out.println(in.nextLine());

        in.close();

    }
}
