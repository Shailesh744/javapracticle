import javax.swing.*;
import java.awt.event.*;

// User defined class with constructor approach for Swing implementation
class UserDefinedClass extends JFrame {
    UserDefinedClass() {
        JButton btn = new JButton("Click Me");
        btn.setBounds(50, 100, 100, 30);
        add(btn);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new UserDefinedClass();
    }
}

// Main class approach for Swing implementation
public class MainClassApproach {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Class Approach");
        JButton btn = new JButton("Click Me");
        btn.setBounds(50, 100, 100, 30);
        frame.add(btn);
        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
