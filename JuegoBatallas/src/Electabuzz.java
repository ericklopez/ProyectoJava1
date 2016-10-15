
import java.util.Random;

/**
 * Sublcase Electabuzz que es un monstruo de tipo Electrico
 * @author erick
 */
public class Electabuzz extends Electrico{
    
    private final String nombreMonstruo = "Electabuzz";
    private final int hpBase = 20;
    private final int ataqueBase = 18;
    private final int defensaBase = 15;
    private final int velocidadBase = 17;
    public final String ataqueClase = "Puño trueno";
    
    /**
     * Contructor de la clase Electabuzz
     * @param nombre
     * @param nivel 
     */
    public Electabuzz(String nombre, int nivel){
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
