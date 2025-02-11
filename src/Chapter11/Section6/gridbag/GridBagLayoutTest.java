package Chapter11.Section6.gridbag;

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * @author Ding Jiaxiong
 * @version 1.36 2018-04-10
 */
public class GridBagLayoutTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new FontFrame();
            frame.setTitle("GridBagLayoutTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
