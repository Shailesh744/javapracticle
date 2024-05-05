import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDrivenDemo extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;

    public EventDrivenDemo() {
        setTitle("Event Driven Demo");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Hello, Event Driven Programming!");
        add(label);

        button = new JButton("Click Me!");
        add(button);

        button.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setText("Button Clicked!");
        }
    }

    public static void main(String[] args) {
        new EventDrivenDemo();
    }
}
