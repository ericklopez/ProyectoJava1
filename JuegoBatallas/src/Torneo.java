import java.util.Scanner;
/**
 * Clase Torneo, es donde se desarrolla y controla lo que sucede en la batalla
 * @author mquinteror, erick
 */

public class Torneo {
   Scanner sc = new Scanner (System.in);
   
   public Torneo(){
       
       System.out.println("Bienvenido al torneo");
       Contrincante c1 = new Contrincante();
       Contrincante c2 = new Contrincante();
   } 
   
   void menuPrincipal(){
       int optPrincipal = 0;
       do {
           System.out.println("[1] - Escoger mounstruos");
           System.out.println("[2] - Iniciar el Torneo");
           System.out.println("[0] - Salir");
           optPrincipal = sc.nextInt();
           
           switch ( optPrincipal ){
               case 1:
                   escogerMounstruos();
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
   
   void escogerMounstruos(){
       System.out.println("se van a escoger los mounstruos");
   }
   
}
