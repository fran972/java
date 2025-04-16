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

   public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
   
   
}
