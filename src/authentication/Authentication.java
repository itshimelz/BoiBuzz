package authentication;

import java.awt.Dimension;
import javax.swing.JFrame;
import raven.toast.Notifications;

public class Authentication extends JFrame {

    private boolean frameCloseResponse = false;
    private boolean loginButtonClicked = false;
    private boolean signUpButtonClicked = false;

    public Authentication() {
        init();
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
        if (this.loginButtonClicked) {
            setContentPane(new Login());
        } else if (this.signUpButtonClicked) {
            setContentPane(new Register());
        }
        revalidate();
        repaint();
    }

    public boolean getFrameCloseResponse() {
        return frameCloseResponse;
    }

    public void initializeWindowListener() {
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                frameCloseResponse = true;
            }
        });
    }
}
