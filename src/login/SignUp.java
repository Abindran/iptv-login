package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {

    JTextField usernameField,emailField,macField;
    JPasswordField passwordField,confirmPasswordField;
    JLabel title,username,email,pack,lang,mac,password,confirmPassword,country;
    JComboBox packPeriod,langDetail,countryDetail;
    JButton submit;


    SignUp(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(600,600);
        setResizable(false);


        title = new JLabel("Register to STD Player");
        title.setBounds(230,30,150,30);

        username = new JLabel("Enter your username: ");
        username.setBounds(130,80,150,30);

        email = new JLabel("Enter your email: ");
        email.setBounds(130,130,150,30);

        pack = new JLabel("Choose your pack: ");
        pack.setBounds(130,180,150,30);

        lang = new JLabel("Choose preferred \n language: ");
        lang.setBounds(130,230,150,30);

        mac = new JLabel("Enter your MAC address: ");
        mac.setBounds(130,280,150,30);

        password = new JLabel("Enter your password: ");
        password.setBounds(130,330,150,30);

        confirmPassword = new JLabel("Confirm your password: ");
        confirmPassword.setBounds(130,380,150,30);

        country = new JLabel("Enter your country: ");
        country.setBounds(130,430,150,30);

        submit = new JButton("Submit");

        usernameField = new JTextField();
        usernameField.setBounds(320,80,150,30);


        emailField = new JTextField();
        emailField.setBounds(320,130,150,30);


        macField = new JTextField();
        macField.setBounds(320,280,150,30);


        passwordField = new JPasswordField();
        passwordField.setBounds(320,330,150,30);



        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(320,380,150,30);


        String[] period = {"3 Months","6 Months","Free Trial"};
        packPeriod = new JComboBox(period);
        packPeriod.setBounds(320,180,150,30);
//        320,180,150,30

        String[] languages = {"English","Tamil"};
        langDetail = new JComboBox(languages);
        langDetail.setBounds(320,230,150,30);

        String[] countries = {"US","India","London"};
        countryDetail = new JComboBox(countries);
        countryDetail.setBounds(320,430,150,30);


        submit = new JButton("Submit");
        submit.setBounds(320,480,150,30);
        submit.addActionListener(this);

        add(title);
        add(username);
        add(usernameField);
        add(email);
        add(emailField);
        add(pack);
        add(packPeriod);
        add(lang);
        add(langDetail);
        add(mac);
        add(macField);
        add(password);
        add(passwordField);
        add(confirmPassword);
        add(confirmPasswordField);
        add(country);
        add(countryDetail);
        add(submit);

        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        registerUser();
    }

    private void registerUser(){
        String username = usernameField.getText();
        String email = emailField.getText();
        String pack = packPeriod.getSelectedItem().toString();
        String lang = langDetail.getSelectedItem().toString();
        String mac = macField.getText();
        String password = String.valueOf(passwordField.getPassword());
        String confirmPassword = String.valueOf(confirmPasswordField.getPassword());
        String country = countryDetail.getSelectedItem().toString();




    }

    public static void main(String[] args) {
        SignUp signUpTest = new SignUp();
    }
}
