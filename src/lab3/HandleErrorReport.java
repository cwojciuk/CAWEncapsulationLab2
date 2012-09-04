/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import javax.swing.*;

/**
 *
 * @author Ninja
 */
public class HandleErrorReport extends MainGUI{
    public void reportError(String e,String i){
        JOptionPane.showMessageDialog(this,e,i,JOptionPane.WARNING_MESSAGE);
    }
    
}
