package login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {


    JTextField usernameField;
    JPasswordField passwordField;
    JButton login,signup;
    JLabel username,password;

    Login(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(640,360);
        this.setResizable(false);

        username = new JLabel("Username: ");
        username.setBounds(160,100,75,25);

        password = new JLabel("Password: ");
        password.setBounds(160,150,75,25);

        usernameField = new JTextField();
        usernameField.setBounds(245,100,200,25);

        passwordField = new JPasswordField();
        passwordField.setBounds(245,150,200,25);

        login = new JButton("Login");
        login.setBounds(240,200,100,25);
        login.addActionListener(this);

        signup = new JButton("SignUp");
        signup.setBounds(350,200,100,25);
        signup.addActionListener(this);

        this.add(username);
        this.add(password);
        this.add(usernameField);
        this.add(passwordField);
        this.add(login);
        this.add(signup);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == login){
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

        }else if(e.getSource() == signup){
            dispose();
            new SignUp();
        }

    }

    public static void main(String[] args) {
        Login loginTest = new Login();
    }
}
