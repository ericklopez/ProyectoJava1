/**
 * Subclase Poliwag que es un monstruo de Agua
 * @author erick
 */
public class Poliwag extends Agua{
    private final String nombreMonstruo = "Poliwag";
    private final int hpBase = 20;
    private final int ataqueBase = 12;
    private final int defensaBase = 10;
    private final int velocidadBase = 11;
    public final String ataqueClase = "Hipnosis";
    
    /**
     * Contructor de la clase Blastoise
     * @param nombre
     * @param nivel 
     */
    public Poliwag(String nombre, int nivel){
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
        float daño;
        
        System.out.println(this.apodo+" uso hipnosis. ¡"+enemigo.apodo+" se duermme!");
		enemigo.estado="dormido";
    }
}