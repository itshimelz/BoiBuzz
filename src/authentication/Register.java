package authentication;

import com.formdev.flatlaf.FlatClientProperties;
import database.UserDAO;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import raven.toast.Notifications;
import net.miginfocom.swing.MigLayout;

public class Register extends JPanel {

    UserDAO userDAO = new UserDAO();

    public Register() {
        init();
    }

    private void init() {
        setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();
        confirmPassword = new JPasswordField();
        signUpButton = new JButton("Sign Up");

        signUpButton.addActionListener(e -> {
            try {
                if (validateFields() && isMatchPassword()) {
                    String firstName = firstNameField.getText();
                    String lastName = lastNameField.getText();
                    String email = emailField.getText();
                    String userGender = null;
                    if (male.isSelected()) {
                        userGender = "Male";
                    } else {
                        userGender = "Female";
                    }
                    String password = new String(passwordField.getPassword());

                    try {
                        userDAO.addUser(firstName, lastName, userGender, email, password, true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "User added successfully!");
                    FormsManager.getInstance().showForm(new Login());
                } else {
                    // If the passwords do not match, the error is shown by the isMatchPassword method
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "[fill,360]"));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;"
                + "[light]background:darken(@background,3%);"
                + "[dark]background:lighten(@background,3%)");

        firstNameField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "First name");
        lastNameField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Last name");
        emailField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your email");
        passwordField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");
        confirmPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Re-enter your password");
        passwordField.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true");
        confirmPassword.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true");

        signUpButton.putClientProperty(FlatClientProperties.STYLE, ""
                //                + "[light]background:darken(@background,10%);"
                //                + "[dark]background:lighten(@background,10%);"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0");

        JLabel title = new JLabel("Welcome to BoiBuzz");
        JLabel description = new JLabel("Join us to find, connect, and buy new books. Sign up now and start collecting!");
        title.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +10");
        description.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground,30%);"
                + "[dark]foreground:darken(@foreground,30%)");

        panel.add(title);
        panel.add(description);
        panel.add(new JLabel("Full Name"), "gapy 10");
        panel.add(firstNameField, "split 2");
        panel.add(lastNameField);
        panel.add(new JLabel("Gender"), "gapy 8");
        panel.add(createGenderPanel());
        panel.add(new JSeparator(), "gapy 5 5");
        panel.add(new JLabel("Email"));
        panel.add(emailField);
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(passwordField);
        panel.add(new JLabel("Confirm Password"), "gapy 0");
        panel.add(confirmPassword);
        panel.add(signUpButton, "gapy 20");
        panel.add(createLoginLabel(), "gapy 10");
        add(panel);
    }

    private Component createGenderPanel() {
        JPanel panel = new JPanel(new MigLayout("insets 0"));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:null");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        groupGender = new ButtonGroup();
        groupGender.add(male);
        groupGender.add(female);
        male.setSelected(true);
        panel.add(male);
        panel.add(female);
        return panel;
    }

    private Component createLoginLabel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:null");
        JButton loginButton = new JButton("<html><a href=\"#\">Sign in here</a></html>");
        loginButton.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,3,3,3");
        loginButton.setContentAreaFilled(false);
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginButton.addActionListener(e -> {
            FormsManager.getInstance().showForm(new Login());
        });
        JLabel label = new JLabel("Already have an account ?");
        label.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground,30%);"
                + "[dark]foreground:darken(@foreground,30%)");
        panel.add(label);
        panel.add(loginButton);
        return panel;
    }

    public boolean isMatchPassword() {
        String password = String.valueOf(passwordField.getPassword());
        String conPassword = String.valueOf(confirmPassword.getPassword());
        return password.equals(conPassword);
    }

    private boolean validateFields() throws SQLException {

        // Check if the first name field is empty
        if (firstNameField.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "First name cannot be empty.");
            return false;
        }

        // Check if the last name field is empty
        if (lastNameField.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Last name cannot be empty.");
            return false;
        }

        // Check if the username or email field is empty
        if (emailField.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Email cannot be empty.");
            return false;
        }

        // Check if the gender is selected
        if (!male.isSelected() && !female.isSelected()) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Please select a gender.");
            return false;
        }

        // Check if the password fields are empty
        if (passwordField.getPassword().length == 0 || confirmPassword.getPassword().length == 0) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Password fields cannot be empty.");
            return false;
        }

        String email = emailField.getText();

        if (userDAO.checkUserExist(email)) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "This user already have an account.");
            return false;
        }
        return true;
    }

    private JTextField firstNameField;
    private JTextField lastNameField;
    private JRadioButton male;
    private JRadioButton female;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPasswordField confirmPassword;
    private ButtonGroup groupGender;
    private JButton signUpButton;
}
