
import java.util.Random;

/**
 * Subclase Blastoise que es un monstruo de tipo Agua
 * @author erick
 */
public class Blastoise extends Agua{
    private final String nombreMonstruo = "Blastoise";
    private final int hpBase = 24;
    private final int ataqueBase = 19;
    private final int defensaBase = 18;
    private final int velocidadBase = 10;
    public final String ataqueClase = "Cabezazo";
    
    /**
     * Contructor de la clase Blastoise
     * @param nombre
     * @param nivel 
     */
    public Blastoise(String nombre, int nivel){
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
