/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

/**
 *
 * @author grey
 */
public class Libro extends Publicacion{
   
    String nombreautor;
    boolean prestado;

  
    public String getNombreautor() {
        return nombreautor;
    }

    public void setNombreautor(String nombreautor) {
        this.nombreautor = nombreautor;
    }

    public boolean isPrestado() {
        return prestado;
    }

   
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

 
    
}
