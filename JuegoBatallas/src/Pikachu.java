
import java.util.Random;

/**
 * Subclase Pikachu que es un monstruo de tipo Electrico
 * @author erick
 */
public class Pikachu extends Electrico{
   
    private final String nombreMonstruo = "Pikachu";
    private final int hpBase = 20;
    private final int ataqueBase = 16;
    private final int defensaBase = 14;
    private final int velocidadBase = 16;
    public final String ataqueClase = "Impactrueno";
    
    /**
     * Contructor de la clase Pikachu
     * @param nombre
     * @param nivel 
     */
    public Pikachu(String nombre, int nivel){
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
                float daño = (this.ataque - enemigo.defensa) *1.2f*multiplicadorElemental(enemigo);
             if(daño <= 0){
                System.out.println(enemigo.apodo+" no ha recibido daño");
            }
             enemigo.hp -= daño;
             System.out.println(enemigo.apodo+" pierde "+daño+" puntos de vida");
            }
            System.out.println(enemigo.apodo+" ha esquivado el ataque");
    }
    
}
