/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import controlador.ControladorLibrosyRevistas;
import vista.VistaLibrosyRevistas;

/**
 *
 * @author grey
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          ControladorLibrosyRevistas controlador = new ControladorLibrosyRevistas(new VistaLibrosyRevistas());
    }
    
}
