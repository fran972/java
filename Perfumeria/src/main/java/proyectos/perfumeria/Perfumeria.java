/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyectos.perfumeria;
import java.util.Scanner;
/**
 *
 * @author MSI
 */
public class Perfumeria {

    public static void main(String[] args) {
        Articulos articulo[]= new Articulos[1000];
        Scanner scanner = new Scanner(System.in);
        Funcionalidades funciones= new Funcionalidades();
        int opcion=0;
        for(int i=0;i<1000;i++){
        articulo[i]=new Articulos();
        }
        
        do{
        System.out.println("1.Ingresar articulos");
        System.out.println("2.mostrar articulos ingresados");
        System.out.println("3.Actualizar articulos");
        System.out.println("4.Eliminar articulos");
        System.out.println("5.salir");
        opcion=scanner.nextInt();
        switch(opcion){
            case 1:
                for(int i=0;i<1000;i++){
                    if(articulo[i].getIdentificador()!="0"){
                        funciones.rellenarDatos(articulo,i);
                        i=1000;
                    }
                    
                }
                break;
            case 2:
                for(int i=0; i<1000; i++){
                  if(articulo[i].getIdentificador()!="0"){
                     mostrarArticulos();
                     i=1000;
                  }
                }
                break;
            case 3:
                
                    
                actualizarArticulos();
                
                break;
            case 4:
                
                eliminarArticulos();
                
                break;
            case 5:
                System.out.println("Programa finalizado");
                break;
            default:
                System.out.println("Ingrese un valor que este dentro del menu");
                break;
        }
        }while(opcion!=5);
    }
}
