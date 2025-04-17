/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectos.perfumeria;
import java.util.Scanner;
/**
 *
 * @author MSI
 */
public class Articulos {
   Scanner scanner = new Scanner(System.in);
   private String identificador="0";
   private String nombre;
   private String marca;
   private double precio;
   private int stock;
   
   public Articulos(){
       
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
   public Articulos(String identificador, String nombre, String marca, double precio, int stock ){
       this.identificador=identificador;
       this.nombre=nombre;
       this.marca=marca;
       this.precio=precio;
       this.stock=stock;
   }
   
   public void verArticulos(){
       System.out.println("nombre: " + this.nombre);
       System.out.println("marca: " + this.marca);
       System.out.println("precio: " + this.precio);
       System.out.println("Stock:" + this.stock);
       System.out.println("Identificador: " + this.identificador);
       System.out.println("--------------------------------------");
   }
   
   
   
}
