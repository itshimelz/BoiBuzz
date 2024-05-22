package authentication;

import com.formdev.flatlaf.FlatClientProperties;
import database.UserDAO;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import raven.toast.Notifications;

public class Login extends JPanel {

    public Login() {
        init();
    }

    private void init() {
        setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));
        userEmailField = new JTextField();
        userPasswordField = new JPasswordField();
        rememberMe = new JCheckBox("Remember me");
        loginButton = new JButton("Login");

        UserDAO userDAO = new UserDAO();

        loginButton.addActionListener(e -> {
            if (userEmailField.getText().trim().isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.ERROR, "Username cannot be empty.");
                return;
            }

            if (userPasswordField.getPassword().length == 0) {
                Notifications.getInstance().show(Notifications.Type.ERROR, "Password cannot be empty.");
                return;
            }
            
//            String email = userEmailField.getText();
//            String password = new String(userPasswordField.getPassword());
//            
//            User user = userDAO.getUserByEmail(email);
//            if (user != null) {
//                System.out.println("User found:");
//                System.out.println("ID: " + user.getId());
//                System.out.println("First Name: " + user.getFirstName());
//                System.out.println("Last Name: " + user.getLastName());
//                System.out.println("Gender: " + user.getGender());
//                System.out.println("Email: " + user.getEmail());
//            } else {
//                System.out.println("No user found with the email: " + email);
//            }

            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Login successful!");

        });

        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:16;"
                + "[light]background:darken(@background,3%);"
                + "[dark]background:lighten(@background,3%)");
        userPasswordField.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true");
        userEmailField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your username");
        userPasswordField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");

        JLabel title = new JLabel("Welcome back to BoiBuzz!");
        JLabel description = new JLabel("Please Login to access your account.");
        title.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +8");
        description.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground,30%);"
                + "[dark]foreground:darken(@foreground,30%)");
        loginButton.putClientProperty(FlatClientProperties.STYLE, ""
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0");
        panel.add(title);
        panel.add(description);
        panel.add(new JLabel("Username"), "gapy 8");
        panel.add(userEmailField);
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(userPasswordField);
        panel.add(rememberMe, "grow 0");
        panel.add(loginButton, "gapy 10");
        panel.add(createSIgnupLabel(), "gapy 10");

        add(panel);

    }

    private Component createSIgnupLabel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:null");
        JButton signUp = new JButton("<html><a href=\"#\"> Sign up</a></html>");
        signUp.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,3,3,3");
        signUp.setContentAreaFilled(false);
        signUp.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signUp.addActionListener(e -> {
            FormsManager.getInstance().showForm(new Register());
        });
        JLabel label = new JLabel("Don't have an account ?");
        label.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground,30%);"
                + "[dark]foreground:darken(@foreground,30%)");
        panel.add(label);
        panel.add(signUp);

        return panel;
    }

    private JTextField userEmailField;
    private JPasswordField userPasswordField;
    private JCheckBox rememberMe;
    private JButton loginButton;

}
