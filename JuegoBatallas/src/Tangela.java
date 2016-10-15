
import java.util.Random;

/**
 * Subclase Tangela que es un monstruo de tipo hierba
 * @author erick
 */
public class Tangela extends Hierba{
    
    private final String nombreMonstruo = "Tangela";
    private final int hpBase = 18;
    private final int ataqueBase = 13;
    private final int defensaBase = 10;
    private final int velocidadBase = 10;
    public final String ataqueClase = "Cosquillas";
    
    /**
     * Contructor de la clase Tangela
     * @param nombre
     * @param nivel 
     */
    public Tangela(String nombre, int nivel){
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
            System.out.println(this.apodo+" usó cosquillas. ¡"+enemigo.apodo+" se ríe!");
            enemigo.estado="paralizado";
  
    }
    
}
