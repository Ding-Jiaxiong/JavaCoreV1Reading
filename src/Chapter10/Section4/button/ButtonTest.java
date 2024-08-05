package Chapter10.Section4.button;

import java.awt.*;
import javax.swing.*;

/**
 * @author Ding Jiaxiong
 * @version 1.35 2018-04-10
 */
public class ButtonTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new ButtonFrame();
            frame.setTitle("ButtonTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
