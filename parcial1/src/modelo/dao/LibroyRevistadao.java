/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.Libro;
import modelo.dto.Publicacion;
import modelo.dto.Revistas;

/**
 *
 * @author grey
 */
public class LibroyRevistadao {
   private List<Publicacion> listapublicacion = new ArrayList();
   
   
   public boolean crear (Publicacion articulo){
       return listapublicacion.add(articulo);
   } 
   public Publicacion consultar(int codigo){
       Publicacion publicacion = null;
       for(Publicacion articulo : listapublicacion){
           if (articulo.getCodigo()== codigo){
               publicacion = articulo;
           }
        }
    return publicacion;   
   }

}
