/**
 * Subclase Gyarados que es un monstruo de tipo Agua
 * @author erick
 */
public class Gyarados extends Agua{
 
    private final String nombreMonstruo = "Gyarados";
    private final int hpBase = 21;
    private final int ataqueBase = 14;
    private final int defensaBase = 10;
    private final int velocidadBase = 15;
    public final String ataqueClase = "Furia dragón";
    
    /**
     * Contructor de la clase Blastoise
     * @param nombre
     * @param nivel 
     */
    public Gyarados(String nombre, int nivel){
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
		
		if ((daño = (this.ataque - enemigo.defensa)*1.6f*multiplicadorElemental(enemigo)) <= 0)
			daño = 0;

		enemigo.hp -= daño;
		System.out.println(this.apodo+" uso furia dragón. ¡"+enemigo.apodo+" pierde "+daño+" puntos de vida!");
    }
    
}
