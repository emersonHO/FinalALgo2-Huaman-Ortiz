
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Persona;
import modelo.Trabajador;
import modelo.Cliente;
import vista.frmLogin;
import vista.frmPrincipal;

public class ControladorLogin {
    Persona modelo;
    frmLogin vista;

    public ControladorLogin(Persona modelo, 
            frmLogin vista) {
        this.modelo = modelo;
        this.vista = vista;
        /**/

    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        limpiarControles();
        this.vista.setVisible(true);
    }
    
    public void limpiarControles(){
        vista.txtClave.setText("");
        vista.txtUsuario.setText("");   
    }
}

