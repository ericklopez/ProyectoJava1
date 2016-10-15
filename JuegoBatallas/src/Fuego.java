
import java.util.Random;

/**
 * Clase Fuego que contiene metodo abstracto de ataque y otro que calcula el multiplicador elemental
 * @author erick
 */
public abstract class Fuego extends Monstruo{
    public final String ataqueElemento = "Escupir fuego";
    /**
     * Metodo que calcula el daño dependiendo el elemento del monstruo al que se ataque
     * @param elemento
     * @return 
     */
    @Override
    public float multiplicadorElemental(Monstruo elemento){
        if(elemento instanceof Hierba)
            return (float) 2.0;
        else if(elemento instanceof Fuego || elemento instanceof Agua)
            return (float) 0.5;
        else if(elemento instanceof Electrico)
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
            
            System.out.println(this.apodo+" utilizó "+ataqueElemento);
            if(ran<0.8){
                float daño = (this.ataque - enemigo.defensa) * multiplicadorElemental(enemigo);
             if(daño <= 0){
                System.out.println(enemigo.apodo+" no ha recibido daño");
            }
             enemigo.hp -= daño;
             System.out.println(enemigo.apodo+" pierde "+daño+" puntos de vida");
            }
            System.out.println(enemigo.apodo+" ha esquivado el ataque");
        }
}
