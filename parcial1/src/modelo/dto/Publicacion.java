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
public class Publicacion {
    int codigo;
    String titulo;
    int añodepublicacion;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñodepublicacion() {
        return añodepublicacion;
    }

    public void setAñodepublicacion(int añodepublicacion) {
        this.añodepublicacion = añodepublicacion;
    }

    
}
