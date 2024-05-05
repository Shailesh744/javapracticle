import java.awt.*;
import java.awt.event.*;

// Main class approach using Frame class implementation
public class MainClassFrameApproach extends Frame {
    MainClassFrameApproach() {
        Button btn = new Button("Click Me");
        btn.setBounds(50, 100, 80, 30);
        add(btn);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainClassFrameApproach();
    }
}

// User defined class and constructor approach with Frame class implementation
class UserDefinedClassWithFrame extends Frame {
    UserDefinedClassWithFrame() {
        Button btn = new Button("Click Me");
        btn.setBounds(50, 100, 80, 30);
        add(btn);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UserDefinedClassWithFrame();
    }
}
