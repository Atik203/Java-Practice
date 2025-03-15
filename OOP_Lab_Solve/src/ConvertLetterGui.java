import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertLetterGui extends JFrame implements ActionListener {


    public JButton convertButton = new JButton("Convert");
    public JTextField inputField = new JTextField();

    public ConvertLetterGui() {
        super("Convert Upper to Lower Case and  Vice Versa");


        convertButton.setBounds(120, 200, 95, 30);
        inputField.setBounds(100, 50, 150, 80);
        inputField.setMargin(new Insets(10, 10, 10, 10));
        inputField.setFont(new Font("Arial", Font.PLAIN, 20));

        super.add(inputField);
        super.add(convertButton);
        convertButton.addActionListener(this);
        super.setSize(400, 500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(null);
        super.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == convertButton) {
            String text = inputField.getText();
            String convertedText = "";
            for(int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if(Character.isUpperCase(c)) {
                    convertedText += Character.toLowerCase(c);
                } else {
                    convertedText += Character.toUpperCase(c);
                }
            }
            inputField.setText(convertedText);
        }

    }


    public static void main(String[] args) {
        new ConvertLetterGui();
    }
}
