
import java.util.Random;


/**
 * Clase Agua que contiene metodo abstracto de ataque y otro que calcula el multiplicador elemental
 * @author erick
 */
public abstract class Agua extends Monstruo{
    public final String ataqueElemento = "Torrente";
    /**
     * Metodo que calcula el daño dependiendo el elemento del monstruo al que se ataque
     * @param elemento
     * @return 
     */
    @Override
        public float multiplicadorElemental(Monstruo elemento){
            if (elemento instanceof Fuego){
                return (float) 2.0;
            }else if(elemento instanceof Agua || elemento instanceof Hierba){
                return (float) 0.5;
            }else if(elemento instanceof Electrico)
                return (float) 1.0;
            
            return (float) 0.0;
        }
    
    /**
     * Metodo que calcula el daño a los monstruos enemigos
     * @param enemigo 
     */
    @Override
        public void ataque1(Monstruo enemigo){
            Random rand = new Random();
            float ran = rand.nextFloat();
            float mult = multiplicadorElemental(enemigo);
            
            if(ran<0.8){
                float daño = (getAtaque()-enemigo.getDefensa()) * mult;
             if(daño <= 0){
                System.out.println(enemigo.apodo+" no ha recibido daño");
            }
             enemigo.recibirDaño((int) daño,"");
            }
            System.out.println(enemigo.apodo+" ha esquivado el ataque");

        }
    
}

