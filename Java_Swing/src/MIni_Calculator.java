import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MIni_Calculator implements ActionListener {

    JFrame frame = new JFrame("Mini Calculator");

    JButton addButton,subtractButton;
    JTextField textField1,textField2,resultField;

    JPanel panel = new JPanel();

    Font font = new Font("sans-serif",Font.BOLD,20);

    int input1 = 0,input2 = 0,result = 0;

    MIni_Calculator(){

        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        textField1 = new JTextField();
        textField1.setFont(font);
        textField2 = new JTextField();
        textField2.setFont(font);


        addButton  =  new JButton("+");
        addButton.addActionListener(this);
        subtractButton = new JButton("-");
        subtractButton.addActionListener(this);

        panel.setBounds(100,50,200,150);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(addButton);
        panel.add(subtractButton);

        panel.setLayout(new GridLayout(2,2,50,50));

        resultField = new JTextField();
        resultField.setBounds(150,250,100,50);
        resultField.setFont(font);
        resultField.setEditable(false);
        resultField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        frame.add(resultField);
        frame.add(panel);
        frame.setVisible(true);


    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String text1 = textField1.getText();
        String text2 = textField2.getText();

        if (!text1.isEmpty() && !text2.isEmpty()) {

            try {
                int input1 = Integer.parseInt(text1);
                int input2 = Integer.parseInt(text2);

                if (e.getSource() == addButton) {
                    int result = input1 + input2;
                    resultField.setText(String.valueOf(result));
                    resultField.setBackground(Color.green);
                    resultField.setForeground(Color.BLACK);
                }

                else if (e.getSource() == subtractButton) {
                    int result = input1 - input2;
                    resultField.setText(String.valueOf(result));
                }
            }
            catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(frame, "Please enter values in both fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new MIni_Calculator();
    }

}
