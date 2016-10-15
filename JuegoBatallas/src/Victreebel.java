
import java.util.Random;

/**
 * Subclase Victreebel que es un monstruo de tipo Hierba
 * @author erick
 */
public class Victreebel extends Hierba{
    
    private final String nombreMonstruo = "Victreebel";
    private final int hpBase = 18;
    private final int ataqueBase = 13;
    private final int defensaBase = 10;
    private final int velocidadBase = 10;
    public final String ataqueClase = "Ciclón de hojas";
    
    /**
     * Contructor de la clase Victreebel
     * @param nombre
     * @param nivel 
     */
    public Victreebel(String nombre, int nivel){
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
