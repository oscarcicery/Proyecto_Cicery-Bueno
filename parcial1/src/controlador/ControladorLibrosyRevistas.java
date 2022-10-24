/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dao.LibroyRevistadao;
import modelo.dto.Libro;
import modelo.dto.Publicacion;
import modelo.dto.Revistas;
import vista.VistaLibrosyRevistas;

/**
 *
 * @author grey
 */
public class ControladorLibrosyRevistas implements ActionListener {
    private VistaLibrosyRevistas vistalibrosyrevistas;
    private LibroyRevistadao modelodao;
    public ControladorLibrosyRevistas (VistaLibrosyRevistas vistalibrosyrevistas) {
        this.vistalibrosyrevistas = vistalibrosyrevistas;
        
        this.vistalibrosyrevistas.jBcrearlibro.addActionListener(this);
        this.vistalibrosyrevistas.jBconsultarlibro.addActionListener(this);
        this.vistalibrosyrevistas.jBprestar.addActionListener(this);
        this.vistalibrosyrevistas.jBcrearrevista.addActionListener(this);
        this.vistalibrosyrevistas.jBconsultarrevista.addActionListener(this);
        
        
        
        this.vistalibrosyrevistas.setVisible(true);
        this.modelodao = new LibroyRevistadao();
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
      
         if(e.getSource().equals(this.vistalibrosyrevistas.jBcrearlibro)){
            Publicacion publi  =  modelodao.consultar(Integer.valueOf(this.vistalibrosyrevistas.jtxcodigo.getText()));
             if(publi == null){
            Libro libro = new Libro();
            libro.setCodigo(Integer.valueOf(this.vistalibrosyrevistas.jtxcodigo.getText()));
            libro.setTitulo(this.vistalibrosyrevistas.jtxtitulo.getText());
            libro.setAñodepublicacion(Integer.valueOf(this.vistalibrosyrevistas.jtxañopubli.getText()));
            libro.setNombreautor(this.vistalibrosyrevistas.jtxnombreautor.getText());
            libro.setPrestado(false);
           
            modelodao.crear(libro);
             JOptionPane.showMessageDialog(null,"se creo el libro"); 
             }
             if (publi!=null){
             JOptionPane.showMessageDialog(null,"ya existe este libro");
                 
             }

        }
          if(e.getSource().equals(this.vistalibrosyrevistas.jBconsultarlibro)){
            Libro libro = (Libro) modelodao.consultar(Integer.valueOf(this.vistalibrosyrevistas.jtxcodigo.getText()));
               if(libro!=null) {
                    this.vistalibrosyrevistas.jtxtitulo.setText(libro.getTitulo());
                    this.vistalibrosyrevistas.jtxañopubli.setText(String.valueOf(libro.getAñodepublicacion()));
                    this.vistalibrosyrevistas.jtxnombreautor.setText(libro.getNombreautor());
                    if (libro.isPrestado()) {
                       this.vistalibrosyrevistas.jtxestado.setText("Prestado");
                   }else{
                        this.vistalibrosyrevistas.jtxestado.setText("Disponible");
                    }
                   
                    
               }else{ 
                    JOptionPane.showMessageDialog(null,"no existe este codigo de libro"); 
               }
        }
          if(e.getSource().equals(this.vistalibrosyrevistas.jBprestar)){
               Libro libro = (Libro) modelodao.consultar(Integer.valueOf(this.vistalibrosyrevistas.jtxcodigo.getText()));
               if(libro!=null) {
               libro.setPrestado(true);
               }else{
                    JOptionPane.showMessageDialog(null,"no existe este libro"); 
               }
          }
          
          //----------------------------------------------------------------revista------------------------------//
          if(e.getSource().equals(this.vistalibrosyrevistas.jBcrearrevista)){
         
          Publicacion publi  =  modelodao.consultar(Integer.valueOf(this.vistalibrosyrevistas.jtxcodigo.getText()));
             if(publi == null){
             Revistas revista = new Revistas();
            revista.setCodigo(Integer.valueOf(this.vistalibrosyrevistas.jtxcodigo.getText()));
            revista.setTitulo(this.vistalibrosyrevistas.jtxtitulo.getText());
            revista.setAñodepublicacion(Integer.valueOf(this.vistalibrosyrevistas.jtxañopubli.getText()));
            revista.setNombredeorganizacion(this.vistalibrosyrevistas.jtxnombreorganizacion.getText());
            revista.setNumero(Integer.valueOf(this.vistalibrosyrevistas.jtxNumeroR.getText()));
           
            modelodao.crear(revista);
        
             JOptionPane.showMessageDialog(null,"se creo la revista"); 
             }
             if (publi!=null){
             JOptionPane.showMessageDialog(null,"ya existe esta revista");
                 
             }
        }
          if(e.getSource().equals(this.vistalibrosyrevistas.jBconsultarrevista)){
            Revistas revista = (Revistas) modelodao.consultar(Integer.valueOf(this.vistalibrosyrevistas.jtxcodigo.getText()));
               if(revista!=null) {
                    this.vistalibrosyrevistas.jtxtitulo.setText(revista.getTitulo());
                    this.vistalibrosyrevistas.jtxañopubli.setText(String.valueOf(revista.getAñodepublicacion()));
                    this.vistalibrosyrevistas.jtxnombreorganizacion.setText(revista.getNombredeorganizacion());
                    this.vistalibrosyrevistas.jtxNumeroR.setText(String.valueOf(revista.getNumero()));
                    
               }else{ 
                    JOptionPane.showMessageDialog(null,"no existe esta revista"); 
               }
        }
    }
    
}
