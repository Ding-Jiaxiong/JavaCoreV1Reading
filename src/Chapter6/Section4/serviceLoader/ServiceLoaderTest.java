package Chapter6.Section4.serviceLoader;

import java.io.*;
import java.nio.charset.*;
import java.util.*;

/**
 * @author Ding Jiaxiong
 * @version 1.01 2018-03-17
 */

public class ServiceLoaderTest {
    public static ServiceLoader<Cipher> cipherLoader
            = ServiceLoader.load(Cipher.class);

    public static void main(String[] args) throws UnsupportedEncodingException {
        Cipher cipher = getCipher(1);
        String message = "Meet me at the toga party.";
        byte[] bytes = cipher.encrypt(message.getBytes(), new byte[]{3});
        var encrypted = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(encrypted);
    }

    public static Cipher getCipher(int minStrength) {
        for (Cipher cipher : cipherLoader)
            // Implicitly calls iterator
            if (cipher.strength() >= minStrength) return cipher;
        return null;
    }
}
