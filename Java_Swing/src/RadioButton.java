import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends JFrame implements ActionListener {

       JRadioButton radioButton1 = new JRadioButton("Option 1");
       JRadioButton radioButton2 = new JRadioButton("Option 2");
       JRadioButton radioButton3 = new JRadioButton("Option 3");
       ButtonGroup buttonGroup = new ButtonGroup();



    MyFrame3() {

        radioButton1.setBounds(100, 100, 100, 50);
        radioButton2.setBounds(100, 150, 100, 50);
        radioButton3.setBounds(100, 200, 100, 50);

        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        radioButton1.addActionListener(this);
        radioButton2.addActionListener(this);
        radioButton3.addActionListener(this);



        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == radioButton1) {
            System.out.println("Option 1 Selected");
        }
        if(e.getSource() == radioButton2) {
            System.out.println("Option 2 Selected");
        }
        if(e.getSource() == radioButton3) {
            System.out.println("Option 3 Selected");
        }



    }


    public static void main(String[] args) {
        new MyFrame3();
    }

}
