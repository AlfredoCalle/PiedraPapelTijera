package controlador;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import modelo.Logica;
import vista.VentanaPiedraPapelTijera;

/**
 *
 * @author Alfredo Calle Aguilar
 */
public class Administrador {

    private VentanaPiedraPapelTijera ventana;
    private Logica logica;

    void setVentana(VentanaPiedraPapelTijera ventana) {
        this.ventana = ventana;
    }

    void setLogica(Logica logica) {
        this.logica = logica;
    }

    public void eleccionMaquina(JButton botonMaquina) {
        logica.eleccionMaquina(botonMaquina);
    }

}
