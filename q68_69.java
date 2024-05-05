import java.awt.*;
import java.awt.event.*;

// User defined class with constructor approach
class UserDefinedClass extends Frame {
    UserDefinedClass() {
        Button btn = new Button("Click Me");
        btn.setBounds(50, 100, 80, 30);
        add(btn);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UserDefinedClass();
    }
}

// Main class approach for AWT implementation
public class MainClassApproach extends Frame {
    public static void main(String[] args) {
        Frame frame = new Frame("Main Class Approach");
        Button btn = new Button("Click Me");
        btn.setBounds(50, 100, 80, 30);
        frame.add(btn);
        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
