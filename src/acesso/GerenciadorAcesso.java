/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acesso;

import java.awt.Dimension;
import utilitarios.ViewDialog;

/**
 *
 * @author Thales Leal
 */
public final class GerenciadorAcesso {

    private boolean logged = false;
    private static GerenciadorAcesso instance;

    public void login() {
        Tela_login form = new Tela_login();
        ViewDialog view = new ViewDialog("Controle de Acesso", form, new Dimension(400, 400));
        view.centerFullScreen(null);
        form.setView(view);
        view.showView();
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public static GerenciadorAcesso getInstance() {
        if (instance == null) {
            instance = new GerenciadorAcesso();
        }
        return instance;
    }

}
