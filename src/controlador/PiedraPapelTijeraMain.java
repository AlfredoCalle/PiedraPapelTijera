package controlador;

import modelo.Logica;
import vista.VentanaPiedraPapelTijera;


/**
 * @author Alfredo Calle Aguilar
*/
public class PiedraPapelTijeraMain {
    
    public static void main(String[] args) {
        // Declaramos las clases
        VentanaPiedraPapelTijera ventana;
        Logica logica;
        Administrador admin;
        
        // Instaciamos las clases
        ventana = new VentanaPiedraPapelTijera();
        logica = new Logica();
        admin = new Administrador();
        
        // Le definimos a la ventana y a la logica quien es el que los va a Manejar (Establecer las relaciones entres clases)
        ventana.setAdministrador(admin);
        logica.setAdministrador(admin);
        
        // Le damos el poder al Administrador sobre las demas clases
        admin.setVentana(ventana);
        admin.setLogica(logica);
        
        // Hacemos visible la ventana
        ventana.setVisible(true);
        
    }
    
}
