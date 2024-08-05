package Chapter7.Section5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GlobalLoggerTest {

    public static void main(String[] args) {

        Logger.getGlobal().setLevel(Level.OFF);

        Logger.getGlobal().info("这是一条日志");

    }
}
