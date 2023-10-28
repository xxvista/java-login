/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1jframe;

import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JFrame;


/**
 *
 * @author pc
 */
public class TP1JFrame {

    public static void main(String[] args) {
       LoginJFrame lf = new LoginJFrame();
       lf.pack();
       //Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
       //lf.setVisible(true);
       //int h = tailleEcran.height;
       //int w = tailleEcran.width;
       //lf.setSize(w/2, h/2);
       lf.setLocationRelativeTo(null);
       lf.setVisible(true);
    }
}
