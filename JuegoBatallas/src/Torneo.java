import java.util.Scanner;
import java.util.ArrayList;
/**
 * Clase Torneo, es donde se desarrolla y controla lo que sucede en la batalla
 * @author mquinteror, erick
 */

public class Torneo {
   Scanner sc = new Scanner (System.in);
   ArrayList<Monstruo> monstruos = new ArrayList(); 
   public Torneo(){
       
       System.out.println("Bienvenido al torneo");
       Contrincante c1 = new Contrincante();
       Contrincante c2 = new Contrincante();
       
       String nombreContrincante;
       System.out.println("Contrincante1 Escoge tu neombre: ");
       nombreContrincante = sc.nextLine();
       c1.nombre = nombreContrincante;
       System.out.println( c1.nombre + "Esgoge tus mounstruos");
       // contrincante 1 escoge sus mounstruos
       System.out.println("Contrincante2 Escoge tu neombre: ");
       nombreContrincante = sc.nextLine();
       c2.nombre = nombreContrincante;
       System.out.println( c2.nombre + "Esgoge tus mounstruos");
       // contrincante 2 escoge sus mounstruos
   } 
   
   void menuPrincipal(){
       int optPrincipal = 0;
       do {
           System.out.println("[1] - Escoger // como que ya no");
           System.out.println("[2] - Iniciar el Torneo");
           System.out.println("[0] - Salir");
           optPrincipal = sc.nextInt();
           
           switch ( optPrincipal ){
               case 1:
                   escogerMonstruos();
                   break;
               case 2:
                   iniciarTorneo();
                   break;
               default:
                   break;
           }
       }while(optPrincipal != 0);
   }
   
   void iniciarTorneo(){
       System.out.println("el torneo se ha iniciado");
   }
   
   void escogerMonstruos( Contrincante cont ){
       generarMonstruos();
       for ( int i = 0; i< 6; i++ ){
           System.out.println("Escoge un monstruo de los siguientes");
           
       }
   }
   void generarMonstruos(){
       monstruos.clear();
       monstruos.add(new Blastoise(null, 100));
       monstruos.add(new Charizard(null, 100));
       monstruos.add(new Electabuzz(null, 100));
       monstruos.add(new Flareon(null, 100));
       monstruos.add(new Growlithe(null, 100));
       monstruos.add(new Gyarados(null, 100));
       monstruos.add(new Jolteon(null, 100));
       monstruos.add(new Pikachu(null, 100));
       monstruos.add(new Poliwag(null, 100));
       monstruos.add(new Tangela(null, 100));
       monstruos.add(new Venusaur(null, 100));
       monstruos.add(new Victreebel(null, 100));
   }
   
}
