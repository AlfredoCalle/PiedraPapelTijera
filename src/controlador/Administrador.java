package controlador;

import javax.swing.JButton;
import javax.swing.JLabel;
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

    public void eleccionUsuario(JButton botonJugador, String nombre) {
        logica.eleccionUsuario(botonJugador, nombre);
    }

    public void victoria(JButton botonMaquina, JButton botonJugador) {
        logica.victoria(botonMaquina,botonJugador);
    }

    public void setEstado(boolean b) {
        logica.setEstado(b);
    }

    public void mostrarGanador(JLabel txtGanador) {
        logica.mostrarGanador(txtGanador);
    }

    public void reiniciar(JButton botonMaquina, JButton botonJugador) {
        logica.reiniciar(botonMaquina, botonJugador);
    }

}
