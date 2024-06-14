/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authentication;

/**
 *
 * @author h
 */
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import javax.swing.*;
import java.awt.*;

public class FormsManager {

    private Authentication authentication;
    private static FormsManager instance;

    public static FormsManager getInstance() {
        if (instance == null) {
            instance = new FormsManager();
        }
        return instance;
    }

    private FormsManager() {

    }

    public void initAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public void disposeAuthentication() {
        authentication.dispose();
    }

    public void showForm(JComponent form) {
        EventQueue.invokeLater(() -> {
            FlatAnimatedLafChange.showSnapshot();
            authentication.setContentPane(form);
            authentication.revalidate();
            authentication.repaint();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();
        });
    }
}
