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
        float daño;
		
		if ((daño = (this.ataque - enemigo.defensa)*1.5f*multiplicadorElemental(enemigo)) <= 0)
			daño = 0;

		enemigo.hp -= daño;
		System.out.println(this.apodo+" uso cabezazo. ¡"+enemigo.apodo+" pierde "+daño+" puntos de vida!");
    }
}
