package modelo;

import controlador.Administrador;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Alfredo Calle Aguilar
 */
public class Logica {

    private Administrador admin;
    private boolean estado = true;
    private String[][] victorias = {
        {"btn_tijera2.png", "btn_papel2.png"},
        {"btn_piedra2.png", "btn_tijera2.png"},
        {"btn_papel2.png", "btn_piedra2.png"}
    };

    public void setAdministrador(Administrador admin) {
        this.admin = admin;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Método de la máquina que elige aleatoreamente (piedra, papel, tijera)
    public void eleccionMaquina(JButton botonMaquina) {
        if (estado) {
            String[] nombreImagenes = {"btn_papel2.png", "btn_piedra2.png", "btn_tijera2.png"};
            Random rd = new Random();
            int i = rd.nextInt(nombreImagenes.length);
            botonMaquina.setIcon(new ImageIcon(getClass().getResource("/images/" + nombreImagenes[i]), nombreImagenes[i]));
        }
    }

    // Método que define en la interfaz de usuario si eligió (piedra, papel, tijera) 
    public void eleccionUsuario(JButton botonJugador, String nombre) {
        if(estado){
            botonJugador.setIcon(new ImageIcon(getClass().getResource("/images/" + nombre), nombre));
        } 
    }
    
    private String ganador = "";
    // Método que define quien es el gandor
    public void victoria(JButton botonMaquina, JButton botonJugador) {
        ImageIcon maquina = (ImageIcon) botonMaquina.getIcon();
        ImageIcon jugador = jugador = (ImageIcon) botonJugador.getIcon();
        for (int i = 0; i < 3; i++) {

            if (maquina.getDescription().equals(victorias[i][0]) && jugador.getDescription().equals(victorias[i][1])) {
                ganador = "Máquina";
//                System.out.println("La vitoria es de Maquina");
//                break;
            }
            if (jugador.getDescription().equals(victorias[i][0]) && maquina.getDescription().equals(victorias[i][1])) {
                ganador = "Jugador";
//                System.out.println("La vitoria es de Jugador");
//                break;
            }
            if (maquina.getDescription().equals(jugador.getDescription())) {
                ganador = "Empate";
//                System.out.println("Empate");
//                break;
            }
        }
    }
    
    public void mostrarGanador(JLabel txtGanador){
        if(ganador.equals("Jugador")){
            txtGanador.setText("Ha ganado Jugador" );
        }
        if(ganador.equals("Máquina")){
            txtGanador.setText("Ha ganado Máquina" );
        }
        if(ganador.equals("Empate")){
            txtGanador.setText("Empate" );
        }
        if(ganador.isEmpty()){
            txtGanador.setText("" );
        }
    }

    public void reiniciar(JButton botonMaquina, JButton botonJugador) {
        ganador = "";
        estado = true;
        botonMaquina.setIcon(new ImageIcon(getClass().getResource("/images/btnIncognito.png")));
        botonJugador.setIcon(new ImageIcon(getClass().getResource("/images/btnIncognito.png")));
    }

}
