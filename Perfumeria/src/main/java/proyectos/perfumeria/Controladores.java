package proyectos.perfumeria;
import java.util.Scanner;

/**
 *
 * @author julio
 */
public class Controladores {
    
    Scanner entrada = new Scanner(System.in);
    
    
    
  
    public boolean verificarCaractresId (String identificador){
        return identificador.matches("\\d{1,10}"); //si el texto cumple la condicion larga true, si no la cumple larga false 
    }
    
    public boolean verificarCaractresNombre (String identificador){
        return identificador.matches(".{3,50}"); //si el texto cumple la condicion larga true, si no la cumple larga false 
    }
    
    public boolean verificarCaractresMarca (String identificador){
        return identificador.matches(".{3,30}"); //si el texto cumple la condicion larga true, si no la cumple larga false 
    }
    
    public String verificarIdRepetidos (Articulos articulos[], String id ){ //verifica que le id no sea iguales a otros, utilizamos la recursividad para que no se pueda romper el programa 
   
        for(Articulos a : articulos){
            
            while( id.equals(a.getIdentificador())){
                System.out.println("El id que ha ingresado ya existe, porfavor ingrese otro\n");
                id = entrada.nextLine();
                verificarIdRepetidos(articulos,id); 
            }
        }
        return id; 
    }
    
    
    
    
    
    
    
    
    
    
    
}
