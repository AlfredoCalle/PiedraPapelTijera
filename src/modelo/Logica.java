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
        private String[][] victorias = {
        {"btn_tijera2.png", "btn_papel2.png"},
        {"btn_piedra2.png", "btn_tijera2.png"},
        {"btn_papel2.png", "btn_piedra2.png"}
    };

    public void setAdministrador(Administrador admin) {
        this.admin = admin;
    }

    // Método de la máquina que elige aleatoreamente (piedra, papel, tijera)
    public void eleccionMaquina(JButton botonMaquina) {
        String[] nombreImagenes = {"btn_papel2.png", "btn_piedra2.png", "btn_tijera2.png"};
        Random rd = new Random();
        int i = rd.nextInt(nombreImagenes.length);
        botonMaquina.setIcon(new ImageIcon(getClass().getResource("/images/" + nombreImagenes[i]), nombreImagenes[i]));
    }

    // Método que define en la interfaz de usuario si eligió (piedra, papel, tijera) 
    public void eleccionUsuario(JButton botonJugador, String nombre) {
        botonJugador.setIcon(new ImageIcon(getClass().getResource("/images/" + nombre), nombre));
    }

    // Método que define quien es el gandor
    public void victoria(JButton botonMaquina, JButton botonJugador) {
        ImageIcon maquina = (ImageIcon) botonMaquina.getIcon();
        ImageIcon jugador = jugador = (ImageIcon) botonJugador.getIcon();
        for(int i =0; i <3 ; i++){
            
            if(  maquina.getDescription().equals(victorias[i][0]) && jugador.getDescription().equals(victorias[i][1]) ){
                System.out.println("La vitoria es de Maquina");
                break;
            }
            if(  jugador.getDescription().equals(victorias[i][0]) && maquina.getDescription().equals(victorias[i][1]) ){
                System.out.println("La vitoria es de Jugador");
                break;
            }
            if(maquina.getDescription().equals(jugador.getDescription())){
                System.out.println("Empate");
                break;
            }
        }
    }

}
