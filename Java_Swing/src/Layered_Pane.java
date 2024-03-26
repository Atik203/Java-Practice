import javax.swing.*;
import java.awt.*;

public class Layered_Pane {


    public static void main(String[] args) {
        JLayeredPane layeredPane = new JLayeredPane();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JFrame frame = new JFrame();

        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);


        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(1));
        layeredPane.add(label3, Integer.valueOf(2));

        layeredPane.setBounds(0, 0, 400, 400);
        frame.add(layeredPane);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLayout(null);




    }
}
