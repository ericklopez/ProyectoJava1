
import java.util.Random;

/**
 * Subclase Venusaur que es un monstruo de tipo Hierba
 * @author erick
 */
public class Venusaur extends Hierba{
    
    private final String nombreMonstruo = "Venusaur";
    private final int hpBase = 20;
    private final int ataqueBase = 17;
    private final int defensaBase = 13;
    private final int velocidadBase = 12;
    public final String ataqueClase = "Placaje";
    
    /**
     * Contructor de la clase Venusaur
     * @param nombre
     * @param nivel 
     */
    public Venusaur(String nombre, int nivel){
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
