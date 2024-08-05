package Chapter11.Section6.circleLayout;

import java.awt.*;
import javax.swing.*;

/**
 * @author Ding Jiaxiong
 * @version 1.34 2018-04-10
 */
public class CircleLayoutTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new CircleLayoutFrame();
            frame.setTitle("CircleLayoutTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
