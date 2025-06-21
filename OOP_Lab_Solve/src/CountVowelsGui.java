import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CountVowelsGui extends JFrame implements ActionListener {

    public static final List<Character> VOWELS = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

     JButton Count = new JButton("Count");
     JTextField input = new JTextField();
    JLabel output = new JLabel();

    public CountVowelsGui() {
        super("Count Vowels");


        Count.setBounds(120, 230, 95, 30);

        output.setBounds(120, 150, 100, 50);
        output.setFont(new Font("Arial", Font.PLAIN, 20));
        output.setBorder(BorderFactory.createLineBorder(Color.BLACK));


        input.setBounds(100, 50, 150, 80);
        input.setMargin(new Insets(10, 10, 10, 10));
        input.setFont(new Font("Arial", Font.PLAIN, 20));

        super.add(input);
        super.add(output);
        super.add(Count);

        Count.addActionListener(this);
        super.setSize(400, 500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(null);
        super.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == Count) {
            String text = input.getText();
            int count = 0;
            for(int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if(VOWELS.contains(c)) {
                    count++;
                }
            }
            output.setText(String.valueOf(count));
        }

    }


    public static void main(String[] args) {
        new CountVowelsGui();
    }
}
