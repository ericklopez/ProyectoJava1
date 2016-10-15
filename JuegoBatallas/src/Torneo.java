import java.util.Scanner;
import java.util.ArrayList;
/**
 * Clase Torneo, es donde se desarrolla y controla lo que sucede en la batalla
 * @author mquinteror, erick
 */

public class Torneo {
   Contrincante c1 = new Contrincante();
   Contrincante c2 = new Contrincante();
   Scanner sc = new Scanner (System.in);
   ArrayList<Monstruo> monstruos = new ArrayList(); 
   public Torneo(){
       
       System.out.println("Bienvenido al torneo");

       
       String nombreContrincante;
       System.out.println("Contrincante1 Escoge tu neombre: ");
       nombreContrincante = sc.nextLine();
       c1.nombre = nombreContrincante;
       System.out.println( c1.nombre + "Esgoge tus mounstruos");
       escogerMonstruos( c1 );
       System.out.println("Contrincante2 Escoge tu neombre: ");
       nombreContrincante = sc.nextLine();
       nombreContrincante = sc.nextLine();
       c2.nombre = nombreContrincante;
       System.out.println( c2.nombre + "Esgoge tus mounstruos");
       escogerMonstruos( c2 );
       
       // iniciar la batalla
       combate();
       
   } 
   
   void menuPrincipal(){
       int optPrincipal = 0;
       do {
           System.out.println("[1] - Escoger // como que ya no");
           System.out.println("[2] - Iniciar el Torneo");
           System.out.println("[0] - Salir");
           optPrincipal = sc.nextInt();
           
           switch ( optPrincipal ){
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
   
   void escogerMonstruos( Contrincante cont){
       int opt = 0;
       for ( int i = 0; i< 6; i++ ){
           System.out.println("Escoge un monstruo de los siguientes");
           System.out.println("[1] - Blastoise");
           System.out.println("[2] - Charizard");
           System.out.println("[3] - Electabuzz");
           System.out.println("[4] - Flareon");
           System.out.println("[5] - Growlithe");
           System.out.println("[6] - Gyrados");
           System.out.println("[7] - Jolteon");
           System.out.println("[8] - Pikachu");
           System.out.println("[9] - Poliwag");
           System.out.println("[10] - Tagela");
           System.out.println("[11] - Venuraus");
           System.out.println("[12] - Victrebel");
           opt = sc.nextInt();
           switch( opt ){
               case 1:
                   cont.monstruo.add(new Blastoise(null, 11));
                   break;
               case 2:
                  cont.monstruo.add(new Charizard(null, 11));
                  break;
               case 3:
                   cont.monstruo.add(new Electabuzz(null, 11));
                   break;
               case 4:
                  cont.monstruo.add(new Flareon(null, 10));
                  break;
               case 5:
                   cont.monstruo.add(new Growlithe(null, 12));
                   break;
               case 6:
                   cont.monstruo.add(new Gyarados(null, 12));
                   break;
               case 7:
                   cont.monstruo.add(new Jolteon(null, 10));
                   break;
               case 8:
                   cont.monstruo.add(new Pikachu(null, 15));
                   break;
               case 9:
                   cont.monstruo.add(new Poliwag(null, 13));
                   break;
               case 10:
                   cont.monstruo.add(new Tangela(null, 12));
                   break;
               case 11:
                   cont.monstruo.add(new Venusaur(null, 11));
                   break;
               case 12:
                   cont.monstruo.add(new Victreebel(null, 11));
                   break;
               default:
                   break;
           }
       }
   }
   
   void combate(){
       
       while ( c1.monstruo.isEmpty() ==false && c2.monstruo.isEmpty() ==false ){
           // mientras haya contrincantes que aun cuenten con monstruos
           System.out.println(c1.nombre + "Elige tu monstruo");
           c1.elegirMonstruo();
           System.out.println(c2.nombre + "Elige tu monstruo");
           c2.elegirMonstruo();
           System.out.println("-----------------Informacion de los Monstruos-------------");
           c1.listarMonstruo();
           c2.listarMonstruo();
           // ordenes
           System.out.println(c1.nombre + "Elige tu ataque");
           elegirAtaque( c1, c2 );
           elegirAtaque( c2, c1 );
       }
   }
   
   void elegirAtaque( Contrincante c1, Contrincante c2 ){
       int opcion = 0;
       int ataque;
       
        System.out.println(c1.nombre + "Escoge que vas a hacer");
        System.out.println("[1] - Lanzar un ataque");
        System.out.println("[2] - Usar Pocima");
        System.out.println("[3]- Cambiar de Monstruo");
           
        opcion = sc.nextInt();
        switch ( opcion ){
            case 1:
                System.out.println(c1.nombre + "Que ataque quieres usar");
                System.out.println("[1] - Ataque 1");
                System.out.println("[1] - Ataque 2");
                ataque = sc.nextInt();
                   
                if ( ataque == 1){
                    c1.monstruoActual.ataque1(c2.monstruoActual);
                }
                else if ( ataque == 2 ){
                    c1.monstruoActual.ataque2(c2.monstruoActual);
                }
                break;
            case 2:
                c1.usarPocima();
                break;
            case 3:
                c1.elegirMonstruo();
                break;
            default:
                break;
           }
   }
//   void generarMonstruos(){
//       monstruos.clear();
//       monstruos.add(new Blastoise(null, 100));
//       monstruos.add(new Charizard(null, 100));
//       monstruos.add(new Electabuzz(null, 100));
//       monstruos.add(new Flareon(null, 100));
//       monstruos.add(new Growlithe(null, 100));
//       monstruos.add(new Gyarados(null, 100));
//       monstruos.add(new Jolteon(null, 100));
//       monstruos.add(new Pikachu(null, 100));
//       monstruos.add(new Poliwag(null, 100));
//       monstruos.add(new Tangela(null, 100));
//       monstruos.add(new Venusaur(null, 100));
//       monstruos.add(new Victreebel(null, 100));
//   }
   
}
