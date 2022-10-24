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
public class Revistas extends Publicacion {
    
     String nombredeorganizacion;
    int numero;

    public String getNombredeorganizacion() {
        return nombredeorganizacion;
    }

    public void setNombredeorganizacion(String nombredeorganizacion) {
        this.nombredeorganizacion = nombredeorganizacion;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
