/**
 * Subclase Charizard que es un monstruo de Fuego
 * @author erick
 */
public class Charizard extends Fuego{
    private final String nombreMonstruo = "Charizard";
    private final int hpBase = 25;
    private final int ataqueBase = 19;
    private final int defensaBase = 16;
    private final int velocidadBase = 17;
    public final String ataqueClase = "Poder Solar";
    
    /**
     * Contructor de la clase Charizard
     * @param nombre
     * @param nivel 
     */
    public Charizard(String nombre, int nivel){
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
		
		if ((daño = (this.ataque - enemigo.defensa)*2.0f*multiplicadorElemental(enemigo)) <= 0)
			daño = 0;

		enemigo.hp -= daño;
		System.out.println(this.apodo+" uso poder solar. ¡"+enemigo.apodo+" pierde "+daño+" puntos de vida!");
    }
    
}
