
/**
 * Clase Agua que contiene metodo abstracto de ataque y otro que calcula el multiplicador elemental
 * @author erick
 */
public abstract class Agua extends Monstruo{
    
    /**
     * Metodo que calcula el daño dependiendo el elemento del monstruo al que se ataque
     * @param elemento
     * @return 
     */
    @Override
        public float multiplicadorElemental(Monstruo elemento){
            if (elemento instanceof Fuego){
                return (float) 2.0;
            }else if(elemento instanceof Agua || elemento instanceof Hierba){
                return (float) 0.5;
            }else if(elemento instanceof Electrico)
                return (float) 1.0;
            
            return (float) 0.0;
        }
    
    /**
     * Metodo que calcula el daño a los monstruos enemigos
     * @param enemigo 
     */
    @Override
        public void ataque1(Monstruo enemigo){
            float daño;
            
            if ((daño = (this.ataque - enemigo.defensa)*multiplicadorElemental(enemigo)) <= 0)
			daño = 0;

		enemigo.hp -= daño;
                System.out.println(this.apodo+"usó torrente.");
		System.out.println("¡"+enemigo.apodo+" pierde "+daño+" puntos de vida por el ataque de "+this.apodo+"!");
        }
    
}
