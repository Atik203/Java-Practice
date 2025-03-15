import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends JFrame implements ActionListener {
    JTextField textField = new JTextField();
    JButton button = new JButton("Click");

    MyFrame1(){


        textField.setBounds(50,50, 150,40);
        textField.setFont(new Font(null, Font.BOLD, 20));

        button.setBounds(80,100,70,30);

        button.addActionListener(this);

        this.add(button);
        this.add(textField);

        this.setSize(400,400);
        this.setLayout(null);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        System.out.println(text);
        this.dispose();
    }


    public static void main(String[] args) {
        new MyFrame1();
    }

}
