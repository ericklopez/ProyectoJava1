
import java.util.Random;

/**
 * Subclase Jolteon que es un monstruo de tipo Electrico
 * @author erick
 */
public class Jolteon extends Electrico{
    
    private final String nombreMonstruo = "Jolteon";
    private final int hpBase = 16;
    private final int ataqueBase = 14;
    private final int defensaBase = 11;
    private final int velocidadBase = 15;
    public final String ataqueClase = "Ataque rápido";
    
    /**
     * Contructor de la clase Jolteon
     * @param nombre
     * @param nivel 
     */
    public Jolteon(String nombre, int nivel){
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
    
    @Override
    public void ataque2(Monstruo enemigo){
        Random rand = new Random();
        float ran = rand.nextFloat();
            
            System.out.println(this.apodo+" utilizó "+ataqueClase);
            if(ran<0.8){
                float daño = (this.ataque - enemigo.defensa) *1.5f*multiplicadorElemental(enemigo);
             if(daño <= 0){
                System.out.println(enemigo.apodo+" no ha recibido daño");
            }
             enemigo.hp -= daño;
             System.out.println(enemigo.apodo+" pierde "+daño+" puntos de vida");
            }
            System.out.println(enemigo.apodo+" ha esquivado el ataque");
    }
    
}
