/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastros;

import java.awt.event.MouseEvent;
import javax.swing.JDialog;

/**
 *
 * @author Thales Leal
 */
public class FormPadrao extends javax.swing.JPanel{
    
     private JDialog view;

    public JDialog getView() {
        return view;
    }

    public void setView(JDialog view) {
        this.view = view;
    }
    
    
    public void fecharTela(){
        if(view!=null){
            view.dispose();
        }
    }

    protected void btFecharMouseClicked(MouseEvent evt) {
        System.exit(0);
    }
     
     
}
