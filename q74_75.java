import javax.swing.*;

// Main class approach using JFrame class implementation for Swing
public class MainClassJFrameApproach extends JFrame {
    MainClassJFrameApproach() {
        JButton btn = new JButton("Click Me");
        btn.setBounds(50, 100, 100, 30);
        add(btn);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MainClassJFrameApproach();
    }
}

// User-defined class and constructor approach with JFrame class implementation for Swing
class UserDefinedClassWithJFrame extends JFrame {
    UserDefinedClassWithJFrame() {
        JButton btn = new JButton("Click Me");
        btn.setBounds(50, 100, 100, 30);
        add(btn);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new UserDefinedClassWithJFrame();
    }
}
