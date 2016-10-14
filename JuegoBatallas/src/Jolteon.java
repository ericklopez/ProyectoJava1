/**
 * Subclase Jolteon que es un monstruo de tipo Electrico
 * @author erick
 */
public class Jolteon extends Electrico{
    
    private final String nombreMonstruo = "Jolteon";
    private final int hpBase = 16;
    private final int ataqueBase = 14;
    private final int defensaBase = 11;
    private final int velocidadBase = 15;
    public final String ataqueClase = "Ataque rápido";
    
    /**
     * Contructor de la clase Jolteon
     * @param nombre
     * @param nivel 
     */
    public Jolteon(String nombre, int nivel){
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
        float daño;
		
		if ((daño = (this.ataque - enemigo.defensa)*0.8f*multiplicadorElemental(enemigo)) <= 0)
			daño = 0;

		enemigo.hp -= daño;
		System.out.println(this.apodo+" usó ataque rápido. ¡"+enemigo.apodo+" pierde "+daño+" puntos de vida!");
    }
    
}
