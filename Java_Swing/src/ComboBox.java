import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame4 extends JFrame implements ActionListener {

    String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
    JComboBox comboBox = new JComboBox(items);
    MyFrame4() {


        comboBox.setBounds(50, 50, 90, 20);
        comboBox.addActionListener(this);
        comboBox.setEditable(true);
        add(comboBox);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == comboBox)
       {
           System.out.println(comboBox.getSelectedItem() + " " + comboBox.getSelectedIndex());

       }
    }


    public static void main(String[] args) {
        new MyFrame4();
    }

}
