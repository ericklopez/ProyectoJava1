
import java.util.Random;

/**
 * Subclase Flareon que es un monstruo de Fuego
 * @author erick
 */
public class Flareon extends Fuego{
    private final String nombreMonstruo = "Flareon";
    private final int hpBase = 22;
    private final int ataqueBase = 15;
    private final int defensaBase = 12;
    private final int velocidadBase = 13;
    public final String ataqueClase = "Llamarada";
    
    /**
     * Contructor de la clase Charizard
     * @param nombre
     * @param nivel 
     */
    public Flareon(String nombre, int nivel){
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
