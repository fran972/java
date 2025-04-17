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
        Scanner scanner = new Scanner(System.in);
        int opcion=0;
        do{
        System.out.println("1.Ingresar articulos");
        System.out.println("2.mostrar articulos ingresados");
        System.out.println("3.Actualizar articulos");
        System.out.println("4.Eliminar articulos");
        System.out.println("5.salir");
        opcion=scanner.nextInt();
        switch(opcion){
            case 1:
                
                
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
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
