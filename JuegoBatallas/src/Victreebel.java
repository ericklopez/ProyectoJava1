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
        float daño;
		
		if ((daño = (this.ataque - enemigo.defensa)*1.2f*multiplicadorElemental(enemigo)) <= 0)
			daño = 0;

		enemigo.hp -= daño;
		System.out.println(this.apodo+" uso ciclón de hojas. ¡"+enemigo.apodo+" pierde "+daño+" puntos de vida!");
    }
    
}
