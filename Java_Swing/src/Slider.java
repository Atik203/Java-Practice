import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class Slider implements ChangeListener {

    JFrame frame = new JFrame();
    JSlider slider = new JSlider(0,100,50);
    JPanel panel = new JPanel();
    JLabel label = new JLabel();

    Slider() {
        slider.setBounds(100, 100, 200, 100);
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.setPreferredSize(new Dimension(200, 300));
        slider.addChangeListener(this);

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setPaintTrack(true);

        label.setText("Value: " + slider.getValue());

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }




    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Value: " + slider.getValue());

    }
    public static void main(String[] args) {

       Slider demo = new Slider();
    }
}
