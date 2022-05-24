
package pruebaBootcamp;

public class Coche {
    //Atributos
      int puertas;
      
      //Metodo
      public static void main(String [] args){
          Coche miCoche = new Coche();
          miCoche.puertas = 1;
          miCoche.AgregarPuertas();
          miCoche.AgregarPuertas();
          miCoche.AgregarPuertas();
          System.out.println("La cantidad de puertas es:" +miCoche.puertas);
          
      }
    
      public void AgregarPuertas(){
          this.puertas++;
      }
}
