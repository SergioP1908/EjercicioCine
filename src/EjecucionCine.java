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



public class EjecucionCine {

    
    

   /*  public static void main(String[] args) {

        Espectador [][] butacassala1 = new Espectador[3][3];

        String [][] personas = new String[3][3];

        

        UtilidadesCine.peliculasCartelera();

        System.out.print("\t");  
        for (int j = 1; j <= personas[0].length; j++) {
            System.out.print("C " + j + "\t"); 
        }
        System.out.println(); 

        for (int i = 0; i<personas.length;i++){
            System.out.print("F "+(i+1));
            for(int j = 0; j<personas.length; j++){
                
                System.out.print("\tO ");
            }
            
            System.out.println("");
        }

        Sala sala1 = new Sala(0, null, butacassala1);

        Sala sala2 = new Sala(2, "Pelicula2", 3, 3);

        Sala sala3 = new Sala(2, "Pelicula2", 3, 3);

        Sala [] salas = {sala1,sala2,sala3};

        Cine cine = new Cine("Cine Ejemplo", salas);

       
        





 
        
        
       /* for (Espectador espectador : espectadores) {
         System.out.println(espectador.getNombre());
         System.out.println(espectador.getDni());
         System.out.println("--------------------------");
        }


       

        
            
        Scanner scan2 = new Scanner(System.in);
    
        System.out.print("cuantas entradas quiere: ");

        int entradas = scan2.nextInt();


        for(int entrada =0;entrada<entradas;entrada++){

            System.out.println("SELECCIONE LA FILA Y COLUMNA EN LA QUE QUIERE EL ASIENTO");
        

            Scanner scan = new Scanner(System.in);
    
    
            System.out.print("Fila: ");
    
            int fila = scan.nextInt();
            
    
            Scanner scan1 = new Scanner(System.in);
    
            System.out.print("Columna: ");
    
            int columna = scan1.nextInt();
    
    
            System.out.println("--------------------------");

            System.out.print("\t");  
            for (int j = 1; j <= personas[0].length; j++) {
                System.out.print("C " + j + "\t"); 
            }
            System.out.println(); 


            //personas [fila-1][columna-1] = "\t"+espectador1.getNombre();

            for (int i = 0; i < personas.length; i++) {
                System.out.print("F "+(i+1));
                for (int j = 0; j < personas[i].length; j++) {
                   
                    if (personas[i][j] == null) {
                        personas[i][j] = "\tO";
                    }
                    System.out.print(personas[i][j] + " ");
                }
                
                System.out.println();
    
        
                

            
        }
        System.out.println("--------------------------");
        

        }

        
        

}*/


    /*public void peliculasCartelera(){

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

            
        
    }*/




   
  

    public static void main(String[] args) {
        EjecucionCine mainCine = new EjecucionCine();
        mainCine.arrancarCine();
    }

    private Cine crearCine(){
        Sala sala1 = new Sala(1, "Pelicula 1", 3, 3);
        Sala sala2 = new Sala(2, "Pelicula 2", 2, 2);
        Sala sala3 = new Sala(3, "Pelicula 3", 4, 4);
        Sala[] salas = {sala1, sala2, sala3};

        Cine cine = new Cine("Cine Ejemplo", salas);
        return cine;
    }

    private Espectador[] creaEspectadores(){
        Espectador espectador1 = new Espectador("Espectador 1", "12345678A");
        Espectador espectador2 = new Espectador("Espectador 2", "23456789B");
        Espectador espectador3 = new Espectador("Espectador 3", "34567890C");
        Espectador[] espectadores = {espectador1, espectador2, espectador3};
        
        return espectadores;
    }

    private void arrancarCine(){
        Cine cine = crearCine();
        Espectador[] espectadores = creaEspectadores();
        gestionEntradas(cine, espectadores);
    }

    private void gestionEntradas(Cine cine, Espectador[] espectadores){
        //Recorremos todos los espectadores
        for (Espectador espectador : espectadores) {
            System.out.println("\nEl espectador "+espectador.getNombre() +" está comprando entradas");
            mostrarCartelera(cine);
            int numSala = 1;
            int numEntradas = 1;
            Sala salaSeleccionada = cine.getSalas()[numSala-1];
            mostrarButacas(salaSeleccionada);
        }
    }


    private void mostrarCartelera (Cine cine){
        Sala [] salas = cine.getSalas();
        for (Sala sala : salas) {
            System.out.println(sala);
        }
    }

    private void mostrarButacas (Sala sala){
        Espectador[][] butacas = sala.getButacas();
        System.out.println("Butacas disponibles para la película "+sala.getTituloPelicula());
        for (int idx = 0; idx < butacas.length; idx++) {//filas
            for (int i = 0; i < butacas[idx].length; i++) {//columnas
                System.out.print("\tO");        
            }
            System.out.println("");
        }

    }


    
}
