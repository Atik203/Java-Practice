import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LaunchPage implements ActionListener {
     JFrame frame = new JFrame("Launch Page");
     JButton button = new JButton("Click Me");

    LaunchPage(){

        button.setBounds(200,200,100,50);
        button.setFocusable(false);
        button.addActionListener(this);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            frame.dispose();
            Window new_window = new Window();
        }
    }
}

class Window{
    JFrame frame = new JFrame("New Window");
    JLabel label = new JLabel("Welcome to the new window");

    Window(){
        label.setBounds(50,100,350,50);
        label.setFont(new Font(null, Font.PLAIN, 25));


        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}


class Test1{
    public static void main(String[] args) {
        LaunchPage launchPage = new LaunchPage();
    }
}

