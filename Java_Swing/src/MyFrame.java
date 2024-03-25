

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton("Click Me");
    JLabel label = new JLabel();


    MyFrame(){

        button.setBounds(200,200,100,50);
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        button.addActionListener(this);
        button.setFocusable(false);
        button.setForeground(Color.white);
        button.setBackground(Color.red);
        button.setBorder(BorderFactory.createLineBorder(Color.green,3));

        label.setBounds(200,300,100,50);
        label.setText("Hello");
        label.setVisible(false);
        label.setFont(new Font("Sans Serif", Font.BOLD, 20));

        this.setTitle("Hello World");
        this.setSize(600,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);


        this.add(button);
        this.add(label);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Button Clicked");
            label.setVisible(true);
        }
    }
}


class Test{
    public static void main(String[] args) {
         new MyFrame();

    }
}
