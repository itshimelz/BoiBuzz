package authentication;

import java.awt.Dimension;
import javax.swing.JFrame;
import main.Main;
import raven.toast.Notifications;

public class Authentication extends JFrame {

    private boolean frameCloseResponse = false;
    private boolean loginButtonClicked = false;
    private boolean signUpButtonClicked = false;
    private static Authentication instance;

    public Authentication() {
        init();
        initializeWindowListener();
    }

    public void setLoginButtonClicked(boolean loginButtonClicked) {
        this.loginButtonClicked = loginButtonClicked;
        updateContentPane();
    }

    public void setSignUpButtonClicked(boolean signUpButtonClicked) {
        this.signUpButtonClicked = signUpButtonClicked;
        updateContentPane();
    }

    private void init() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(new Dimension(1200, 700));
        setLocationRelativeTo(null);
        setContentPane(new Login());
        Notifications.getInstance().setJFrame(this);
        FormsManager.getInstance().initAuthentication(this);
    }

    private void updateContentPane() {
        if (loginButtonClicked) {
            setContentPane(new Login());
        } else if (signUpButtonClicked) {
            setContentPane(new Register());
        }
        revalidate();
        repaint();
    }

//    public boolean getFrameCloseResponse() {
//        return frameCloseResponse;
//    }
//
    public void initializeWindowListener() {
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                Main.getInstance().init();
                Main.getInstance().setVisible(true);
                loginButtonClicked = false;
                signUpButtonClicked = false;
                instance.dispose();
                frameCloseResponse = true;
            }
        });
    }

    public static Authentication getInstance() {
        if (instance == null) {
            instance = new Authentication();
        }
        return instance;
    }
}
