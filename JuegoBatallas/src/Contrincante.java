import java.util.Scanner;
import java.util.ArrayList;
/**
 *  Clase contrincante en donde se guardan los datos de los jugadores y los métodos
 * @author erick
 */
public class Contrincante {
 
        ArrayList <Monstruo> monstruo = new ArrayList();
        ArrayList <Pocima> pocima = new ArrayList();
        
        Scanner sc = new Scanner(System.in);
        String nombre;
        Monstruo monstruoActual;
        
        /**
         * Método que quita a un Monstruo del torneo
         */
        public void guardarMonstruo(){
            
            monstruoActual.estado = "esperando";
            System.out.println(monstruoActual+" no está disponible, pero tienes estos monstruos: ");
            listarMonstruo();
            System.out.println("Escribe el nombre del monstruo con el que vas a pelear: ");
            elegirMonstruo();
            
        }
        
        /**
         * Metodo que permite cambiar un monstruo cuando está derrotado o en cualquier momento del combate
         */
        public void elegirMonstruo(){
            
            Scanner sc = new Scanner(System.in);
            String apodo;
            Monstruo mon;
            
            while(true){
                
                apodo = sc.nextLine();
                
                for(int i=0; i<monstruo.size(); i++){
                    
                    mon = monstruo.get(i);
                     if(mon.apodo.equals(apodo) && !(mon.estado.equals("Fuera de combate :c"))){
                         
                         monstruoActual = mon;
                         monstruoActual.estado = "Combatiendo B|";
                         System.out.println("¡"+apodo+" ha entrado al combate!");
                         return;
                         
                     }
                    
                }
                
                System.out.println("No se puede llamar a "+apodo+". Quizás está fuera de combate o no existe");
                System.out.println("Prueba con otro nombre...");
                
            }
               
        }
        
        /**
         * Metodo que permite elegir que pocima va a utilizar el jugador 
         */
        public void usarPocima(){
            
            int pocimasVida = 2;
            int pocimasAtaque = 2;
            int pocimasDefensa = 2;
            
            Pocima poc;
            
            int opcion;
            
            System.out.println("¿Que pócima vas a utilizar?");
            System.out.println("1.- Vida ("+pocimasVida+"/2)");
            System.out.println("2.- Ataque ("+pocimasAtaque+"/2)");
            System.out.println("3.- Defensa ("+pocimasDefensa+"/2)");
            opcion = sc.nextInt();
            
            switch(opcion){
                
                case 1: 
                    for(int i=0; i<pocima.size(); i++){
                        poc =   pocima.get(i);
                            if(poc instanceof pocimaVida){
                                poc.usarPocima(monstruoActual);
                                pocima.remove(i);
                                pocimasVida -= 1;
                                return;
                            }
                    }
                    System.out.println("Ya no tienes pócimas de vida :c");
                    System.out.println("Pierdes tu turno :/");
                    
                    return;
                
                case 2:
                    for(int i=0; i<pocima.size(); i++){
                        poc = pocima.get(i);
                            if(poc instanceof pocimaAtaque){
                                poc.usarPocima(monstruoActual);
                                pocima.remove(i);
                                pocimasAtaque -= 1;
                                return;
                            }
                    }
                    System.out.println("Ya no tienes pócimas de ataque :c");
                    System.out.println("Pierdes tu turno");
                    
                    return;
                    
                case 3:
                    for(int i=0; i<pocima.size(); i++){
                        poc = pocima.get(i);
                            if(poc instanceof pocimaDefensa){
                                poc.usarPocima(monstruoActual);
                                pocima.remove(i);
                                pocimasDefensa -= 1;
                                return;
                            }
                    }
                   System.out.println("Ya no tienes pócimas de defensa :c");
                   System.out.println("Pierdes tu turno");
                   
                   return;
                   
                default:
                    System.out.println("Opción no válida >:v");
            }
            
            
        }
        
        public void listarMonstruo(){
            
            Monstruo mon;
            
            System.out.println("Nombre  |  HP   | Nivel   |   Estado");
                for(int i=0; i<monstruo.size();i++){
                    mon = monstruo.get(i);
                    System.out.println(mon.apodo+"  |   "+mon.hp+"  |   "+mon.nivel+"   |   "+mon.estado);
                }
                  
        }
    
}
