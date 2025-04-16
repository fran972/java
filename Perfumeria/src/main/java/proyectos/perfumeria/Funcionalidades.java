package proyectos.perfumeria;
import java.util.Scanner;


public class Funcionalidades {
    
    Scanner entrada = new Scanner(System.in);
    Controladores verificador = new Controladores();
    
   private String identificador;
   private String nombre;
   private String marca;
   private double precio;
   private int stock;
    
    

    public void rellenarDatos(Articulos articulo[], int i){
        
        System.out.println("Porfavor indique el indentificador del nuevo articulo\n\n");
        System.out.println("El mismo no puede superar los 10 caracteres numericos o contener letras\n\n");
        
        this.identificador=entrada.nextLine();
        
        while (verificador.verificarCaractres(this.identificador) != true){ //llama al metodo verificar carracteres, si el mismo larga un flase, ejecuta el while
            System.out.println("El identificador ingresado no cumple con lo pedido, porfavor vuelva a intentarlo");
            this.identificador=entrada.nextLine();
            
        }
        
        
    }
    
    
    
    
    
    
}
