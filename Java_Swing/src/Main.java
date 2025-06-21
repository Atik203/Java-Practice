import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("planning.png");
        Border border = BorderFactory.createLineBorder(Color.green, 5);
        image.setImage(image.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));

        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();






        // label
        label.setBounds(0,0,80,30);
        label.setIcon(image);
        // label.setBorder(border);
        label.setText("Label 1");
        label.setForeground(Color.blue);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setFont(new Font ("Serif", Font.PLAIN, 25));

        // panel
        redPanel.setBounds(0,0,250,200);
        redPanel.setBackground(Color.red);
        bluePanel.setBounds(250,0,250,200);
        bluePanel.setBackground(Color.blue);
        greenPanel.setBounds(0,200,500,200);
        greenPanel.setBackground(Color.green);






        // frame basic
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("This is title of JFrame");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(Color.white);
//        frame.add(label);
//        frame.add(redPanel);
//        frame.add(bluePanel);
//        frame.add(greenPanel);

    }
}