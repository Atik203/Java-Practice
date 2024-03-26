import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame implements ActionListener {


    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu help = new JMenu("Help");

    JMenuItem open = new JMenuItem("Open");
    JMenuItem save = new JMenuItem("Save");
    JMenuItem exit = new JMenuItem("Exit");

    JMenuItem cut = new JMenuItem("Cut");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem paste = new JMenuItem("Paste");

    JMenuItem about = new JMenuItem("About");
    JMenuItem helpItem = new JMenuItem("Help");


    Frame() {


        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        file.add(open);
        file.add(save);
        file.add(exit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        help.add(about);
        help.add(helpItem);

        exit.addActionListener(this);

        file.setMnemonic('F');


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == exit)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Frame();
    }

}
