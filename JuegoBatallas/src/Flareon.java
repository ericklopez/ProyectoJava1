/**
 * Subclase Flareon que es un monstruo de Fuego
 * @author erick
 */
public class Flareon extends Fuego{
    private final String nombreMonstruo = "Flareon";
    private final int hpBase = 100;
    private final int ataqueBase = 62;
    private final int defensaBase = 45;
    private final int velocidadBase = 34;
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
        float daño;
		
		if ((daño = (this.ataque - enemigo.defensa)*1.2f*multiplicadorElemental(enemigo)) <= 0)
			daño = 0;

		enemigo.hp -= daño;
		System.out.println(this.apodo+" uso llamarada. ¡"+enemigo.apodo+" pierde "+daño+" puntos de vida!");
    }
    
}
