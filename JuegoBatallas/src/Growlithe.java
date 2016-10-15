
import java.util.Random;

/**
 * Subclase Growlithe que es un monstruo de Fuego
 * @author erick
 */
public class Growlithe extends Fuego{
    private final String nombreMonstruo = "Growlithe";
    private final int hpBase = 25;
    private final int ataqueBase = 17;
    private final int defensaBase = 14;
    private final int velocidadBase = 15;
    public final String ataqueClase = "intimidación";
    
    /**
     * Contructor de la clase Growlithe
     * @param nombre
     * @param nivel 
     */
    public Growlithe(String nombre, int nivel){
        this.nivel = nivel;
        this.estado = "ok";
        this.ataque = nivel*ataqueBase;
        this.defensa = nivel*defensaBase;
        this.velocidad = nivel*velocidadBase;
        this.hp = nivel*hpBase;
        
        if(nombre != null)
            this.apodo = nombre;
        else
            this.apodo = nombreMonstruo;
    }
    
    /**
     * Metodo que calcula el daño a un monstruo enemigo
     * @param enemigo 
     */
    @Override
    public void ataque2(Monstruo enemigo){
        Random rand = new Random();
        float ran = rand.nextFloat();
            
            System.out.println(this.apodo+" utilizó "+ataqueClase);
            if(ran<0.8){
                 System.out.println(enemigo.apodo+" ha esquivado el ataque");
            }
            System.out.println(this.apodo+" paralizó a "+enemigo.apodo);
            enemigo.estado="paralizado";
    }
    
}
