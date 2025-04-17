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
        
        this.identificador = verificador.verificarIdRepetidos(articulo,this.identificador); //Obtendra un return de la funcion si el id es diferente a los 
                                                                                            //que existe pero no verifica aun que no se haya cumplido la condicion de solo numeros y maximo 10 caracteres 
                                                                                            
        while (verificador.verificarCaractresId(this.identificador) != true){ //llama al metodo verificar carracteres, si el mismo larga un flase, ejecuta el while
            System.out.println("El identificador ingresado no cumple con lo pedido, porfavor vuelva a intentarlo");
            this.identificador=entrada.nextLine();
            this.identificador = verificador.verificarIdRepetidos(articulo,this.identificador); // lo pongo dentro del while para que no permita que se creen id repetidos 
        } 
        
        
    }
    
    
    
    
    
    
}
