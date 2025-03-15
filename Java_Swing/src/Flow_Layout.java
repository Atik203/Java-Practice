import javax.swing.*;
import java.awt.*;

public class Flow_Layout {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");
        JButton button8 = new JButton("Button 8");
        JButton button9 = new JButton("Button 9");
        JButton button10 = new JButton("Button 10");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);

        frame.setTitle("Flow Layout");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}
