/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectos.perfumeria;

/**
 *
 * @author MSI
 */
public class Articulos {
    
   private String identificador;
   private String nombre;
   private String marca;
   private double precio;
   private int stock;
   
   public Articulos(){
       
   }
   public Articulos(String identificador, String nombre, String marca, double precio, int stock ){
       this.identificador=identificador;
       this.nombre=nombre;
       this.marca=marca;
       this.precio=precio;
       this.stock=stock;
   }
   
   
}
