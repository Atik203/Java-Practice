import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame2 extends JFrame implements ActionListener {

    JCheckBox checkBox = new JCheckBox("I agree to the terms and conditions");

    MyFrame2() {

        checkBox.setBounds(100, 100, 350, 30);
        checkBox.setFocusable(false);
        checkBox.addActionListener(this);
        checkBox.setFont(new Font(null, Font.PLAIN, 18));

        this.add(checkBox);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkBox) {
            System.out.println(checkBox.isSelected());
        }
    }

    public static void main(String[] args) {
        new MyFrame2();
    }


}
