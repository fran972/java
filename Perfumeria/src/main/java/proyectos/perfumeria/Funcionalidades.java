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
        
        articulo[i].setIdentificador(this.identificador);
        
        System.out.println("Ingrese el nombre del articulo");
        this.nombre=entrada.nextLine();
        
        while (verificador.verificarCaractresNombre(this.nombre) != true){
            System.out.println("El Nombre ingresado no cumple con lo pedido, porfavor vuelva a intentarlo");
            this.nombre=entrada.nextLine();
        }
        
        articulo[i].setNombre(this.nombre);
        
        System.out.println("Ingrese la marca del articulo");
        this.marca=entrada.nextLine();
        
        while (verificador.verificarCaractresMarca(this.marca) != true){
            System.out.println("El Nombre ingresado no cumple con lo pedido, porfavor vuelva a intentarlo");
            this.marca=entrada.nextLine();
        }
        
        articulo[i].setMarca(this.marca);
        
        System.out.println("Ingrese el precio del articulo");
        this.precio=entrada.nextDouble();
        
        while(this.precio<=0){
            System.out.println("ingrese un precio valido");
            this.precio=entrada.nextDouble();
        }
        
        articulo[i].setPrecio(this.precio);
        
        System.out.println("Ingrese el stock del producto");
        this.stock=entrada.nextInt();
        
        while(this.stock<0){
            System.out.println("Ingrese un stock valido");
            this.stock=entrada.nextInt();
        }
        
        articulo[i].setStock(this.stock);
        
    }
    
    
    
    
    
    
}
