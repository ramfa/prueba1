/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calidad;

/**
 *
 * @author Marcos
 */
import Splash.InicioAplicacion;
public class Calidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                               new InicioAplicacion().setVisible(true);
                              }
            }
        );
    }
    
}
