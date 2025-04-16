package proyectos.perfumeria;

/**
 *
 * @author julio
 */
public class Controladores {
  
    public boolean verificarCaractres (String identificador){
        return identificador.matches("\\d{1,10}"); //si el texto cumple la condicion larga true, si no la cumple larga false 
    }
    
    public String verificarIdRepetidos (Articulos articulos[], String id ){ //verifica que le id no sea iguales a otros 
        
       
        
        
        
        for(Articulos a : articulos){
            while( a.getIdentificador() == id ){
                
            }
        }
        
        
        return id; 
    }
    
    
    
    
    
    
    
    
    
    
    
}
