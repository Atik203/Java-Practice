import javax.swing.*;

public class Option_Pane  {

    JOptionPane optionPane = new JOptionPane();

    Option_Pane(){

        optionPane.showMessageDialog(null, "Hello World", "Title", JOptionPane.INFORMATION_MESSAGE);
        optionPane.showMessageDialog(null, "Hello World", "Title", JOptionPane.WARNING_MESSAGE);
        optionPane.showMessageDialog(null, "Hello World", "Title", JOptionPane.ERROR_MESSAGE);

    }


    public static void main(String[] args) {
        new Option_Pane();
    }

}
