package modelo;

import controlador.Administrador;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Alfredo Calle Aguilar
 */
public class Logica {

    private Administrador admin;

    public void setAdministrador(Administrador admin) {
        this.admin = admin;
    }

    public void eleccionMaquina(JButton botonMaquina) {
        String[] nombreImagenes = {"btn_papel2.png", "btn_piedra2.png", "btn_tijera2.png"};
        Random rd = new Random();
        int i = rd.nextInt(nombreImagenes.length);
        botonMaquina.setIcon(new ImageIcon(getClass().getResource("/images/" + nombreImagenes[i])));
    }

}
