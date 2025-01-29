import java.util.Scanner;

public class UtilidadesCine {

    public static void peliculasCartelera(){

        Sala sala1 = new Sala(1, "Interestelar", null);

        Sala sala2 = new Sala(2, "Mad Max", null);
    
        Sala sala3 = new Sala(3, "Joker", null);

        Sala [] salas = {sala1,sala2,sala3};

        System.out.println("---------------------------------");
        for (Sala sala : salas) {
            System.out.println("SALA: "+sala.getNumero());
            System.out.println("TITULO: "+sala.getTituloPelicula());
            

            System.out.println("---------------------------------");
        }

        
      
    }

    public static String [] pedirPelicula(String[]prueba){
        for(int i=0; i<prueba.length;i++){
            System.out.println(prueba);
        }

        return prueba;
    }

    public static void pedirAsiento(){

        String [][] personas = new String[3][3];

        System.out.println("---------------------------------");

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
                System.out.println("SELECCIONE LA FILA Y COLUMNA EN LA QUE QUIERE EL ASIENTO");
        

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
