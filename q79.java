import java.awt.*;
import java.awt.event.*;

public class AwtLoginWindow extends Frame implements ActionListener {
    private TextField usernameField;
    private TextField passwordField;
    private Button loginButton;

    public AwtLoginWindow() {
        setTitle("Login Window");
        setSize(300, 150);
        setLayout(new GridLayout(3, 2));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        Label usernameLabel = new Label("Username:");
        add(usernameLabel);

        usernameField = new TextField();
        add(usernameField);

        Label passwordLabel = new Label("Password:");
        add(passwordLabel);

        passwordField = new TextField();
        passwordField.setEchoChar('*');
        add(passwordField);

        loginButton = new Button("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed. Please try again.");
        }
    }

    public static void main(String[] args) {
        new AwtLoginWindow();
    }
}
