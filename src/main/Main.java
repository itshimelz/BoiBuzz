package main;

import authentication.Authentication;
import authentication.FormsManager;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import components.HomePanel;
import java.awt.Font;
import javax.swing.UIManager;

public final class Main extends javax.swing.JFrame {

//    private final boolean isAuthVisible = false;
    private static Main instance;
    private boolean isLoggedIn = false;
//    private boolean rememberMe = false;
    private HomePanel homePanel = new HomePanel();
    private Authentication authInstance = Authentication.getInstance();

    public Main() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        menu1 = new components.menu.Menu();
        createAccountPanel = new javax.swing.JPanel();
        aTitleLabel = new javax.swing.JLabel();
        aDesLabel = new javax.swing.JLabel();
        aSignUpButton = new javax.swing.JButton();
        aLoginButton = new javax.swing.JButton();
        hederPanel = new javax.swing.JPanel();
        imageAvatar = new components.ImageAvatar();
        searchTextField = new javax.swing.JTextField();
        notiButton = new components.Button();
        jSeparator1 = new javax.swing.JSeparator();
        homePanel1 = new components.HomePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1020, 600));

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));

        createAccountPanel.setBackground(new java.awt.Color(20, 40, 40));

        aTitleLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        aTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        aTitleLabel.setText("Sign up or log in");

        aDesLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        aDesLabel.setForeground(new java.awt.Color(255, 255, 255));
        aDesLabel.setText("Save your chat history, share chats, and personalize your experience.");
        aDesLabel.setFocusable(false);

        aSignUpButton.setText("Sign up");
        aSignUpButton.setPreferredSize(new java.awt.Dimension(72, 24));
        aSignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aSignUpButtonActionPerformed(evt);
            }
        });

        aLoginButton.setText("Log in");
        aLoginButton.setPreferredSize(new java.awt.Dimension(75, 24));
        aLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createAccountPanelLayout = new javax.swing.GroupLayout(createAccountPanel);
        createAccountPanel.setLayout(createAccountPanelLayout);
        createAccountPanelLayout.setHorizontalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aSignUpButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aDesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aTitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        createAccountPanelLayout.setVerticalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccountPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(aTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aDesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aSignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(createAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        hederPanel.setBackground(new java.awt.Color(40, 160, 140));

        imageAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Jeff Bezos.jpg"))); // NOI18N
        imageAvatar.setPreferredSize(new java.awt.Dimension(60, 60));

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        notiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_noti_18.png"))); // NOI18N
        notiButton.setAlignmentX(0.5F);
        notiButton.setMaximumSize(new java.awt.Dimension(24, 24));
        notiButton.setMinimumSize(new java.awt.Dimension(24, 24));
        notiButton.setPreferredSize(new java.awt.Dimension(48, 48));
        notiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hederPanelLayout = new javax.swing.GroupLayout(hederPanel);
        hederPanel.setLayout(hederPanelLayout);
        hederPanelLayout.setHorizontalGroup(
            hederPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hederPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(searchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                .addGap(75, 75, 75)
                .addComponent(notiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imageAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        hederPanelLayout.setVerticalGroup(
            hederPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hederPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(hederPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(imageAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(notiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hederPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(homePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(hederPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(homePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLoginButtonActionPerformed
        if (!authInstance.isVisible()) {
            authInstance.setLoginButtonClicked(true);
            this.dispose();
            FormsManager.getInstance().initAuthentication(authInstance);
            authInstance.setVisible(true);
        }

    }//GEN-LAST:event_aLoginButtonActionPerformed

    private void aSignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aSignUpButtonActionPerformed
        if (!authInstance.isVisible()) {
            authInstance.setSignUpButtonClicked(true);
            this.dispose();
            FormsManager.getInstance().initAuthentication(authInstance);
            authInstance.setVisible(true);
        }
    }//GEN-LAST:event_aSignUpButtonActionPerformed

    private void notiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notiButtonActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    public static void main(String args[]) {

        FlatLaf.registerCustomDefaultsSource("properties");
        FlatRobotoFont.install();
        FlatMacLightLaf.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });

    }

    public void init() {
        homePanel.testData();
        revalidate();
        repaint();
//        rootScrollPane.setVerticalScrollBar(new ScrollBar());
        if (isLoggedIn) {
            createAccountPanel.setVisible(false);
            revalidate();
            repaint();
        } else {
            createAccountPanel.setVisible(true);
            revalidate();
            repaint();
        }
        aSignUpButton.putClientProperty(FlatClientProperties.STYLE, ""
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "background:#28A08C;"
                + "innerFocusWidth:0");
        aLoginButton.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]background:darken(@background,15%);"
                + "[dark]background:lighten(@background,10%);"
                + "foreground:#345641;"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0;"
        );
        notiButton.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]background:darken(@background,5%);"
                + "[dark]background:lighten(@background,10%);"
        );

        searchTextField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search...");
        searchTextField.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("icons/search.svg"));
        searchTextField.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:999;"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0;"
                + "margin:8,18,8,18;"
                + "background:$Panel.background");
//        lbPopularBooks.putClientProperty(FlatClientProperties.STYLE, ""
//                + "font:bold +5;");
    }

    public boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aDesLabel;
    private javax.swing.JButton aLoginButton;
    private javax.swing.JButton aSignUpButton;
    private javax.swing.JLabel aTitleLabel;
    private javax.swing.JPanel createAccountPanel;
    private javax.swing.JPanel hederPanel;
    private components.HomePanel homePanel1;
    private components.ImageAvatar imageAvatar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private components.menu.Menu menu1;
    private javax.swing.JPanel menuPanel;
    private components.Button notiButton;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
