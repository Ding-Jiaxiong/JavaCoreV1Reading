package Chapter11.Section7.dialog;

import java.awt.*;
import javax.swing.*;

/**
 * @author Ding Jiaxiong
 * @version 1.35 2018-04-10
 */
public class DialogTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new DialogFrame();
            frame.setTitle("DialogTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
