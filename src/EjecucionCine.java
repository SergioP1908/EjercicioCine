/*Clase con main
	- Crear Cine con 3 salas
	- Crear 3 espectadores
	- por cada espectador preguntarle 
        + que pelicula quiere ver
		+ cuantas entradas quiere
	+ de la pelicula seleccionada mostrarle los asientos libres
             O O O   
             O O O    
             X X X


	+ que pueda elegir fila y asientos o solo fila
	+ Cuando todos los espectadores hayan comprado la entrada mostrar un resumen por cada sala del cine
 */

import java.util.Scanner;

public class EjecucionCine {


    public static void main(String[] args) {

        String [][] personas = new String[3][3];

        for (int i = 0; i<personas.length;i++){
            for(int j = 0; j<personas.length; j++){
                System.out.print("\tO ");
            }
            System.out.println("");
        }

        Espectador espectador1 = new Espectador("Juan", "584323145F");

        Espectador espectador2 = new Espectador("Ana", "523993145V");
 
        Espectador espectador3 = new Espectador("Lucia", "750347655D");
         
        Espectador [] espectadores = {espectador1,espectador2,espectador3};
 
        
       /* for (Espectador espectador : espectadores) {
         System.out.println(espectador.getNombre());
         System.out.println(espectador.getDni());
         System.out.println("--------------------------");
        }*/
         
        System.out.println("--------------------------");
        

        Scanner scan = new Scanner(System.in);


        System.out.print("Fila: ");

        int fila = scan.nextInt();
        

        Scanner scan1 = new Scanner(System.in);

        System.out.print("Columna: ");

        int columna = scan1.nextInt();


        System.out.println("--------------------------");

        personas [fila][columna] = "\t"+espectador1.getNombre();

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
               
                if (personas[i][j] == null) {
                    personas[i][j] = "\tO";
                }
                System.out.print(personas[i][j] + " ");
            }
            System.out.println();

    


    

        
    }
    



}
}
