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
public class Funcionalidades {
   private String identificador;
   private String nombre;
   private String marca;
   private double precio;
   private int stock;
   
    Scanner entrada = new Scanner(System.in);
    Controladores verificador = new Controladores();
    
    
    
    
    
    
    public void rellenarDatos(Articulos articulo[],int i){
        System.out.println("Porfavor indique el indentificador del nuevo articulo\n\n");
        System.out.println("El mismo no puede superar los 10 caracteres numericos o contener letras\n\n");
        this.identificador=entrada.nextLine();
        while (verificador.verificarCaractres(this.identificador) != true){ //llama al metodo verificar carracteres, si el mismo larga un flase, ejecuta el while
            System.out.println("El identificador ingresado no cumple con lo pedido, porfavor vuelva a intentarlo");
            this.identificador=entrada.nextLine();
        }
        System.out.println("Ingrese el nombre del articulo");
        this.nombre=entrada.nextLine();
        System.out.println("Ingrese la marca del articulo");
        this.marca=entrada.nextLine();
        System.out.println("Ingrese el precio del articulo");
        this.precio=entrada.nextDouble();
        while(this.precio<=0){
            System.out.println("ingrese un precio valido");
            this.precio=entrada.nextDouble();
        }
        System.out.println("Ingrese el stock del producto");
        this.stock=entrada.nextInt();
        while(this.stock<0){
            System.out.println("Ingrese un stock valido");
            this.stock=entrada.nextInt();
        }
    }
    
    
}
