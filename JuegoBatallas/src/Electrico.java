/**
 * Clase Electrico que contiene metodo abstracto de ataque y otro que calcula el multiplicador elemental
 * @author erick
 */
public abstract class Electrico extends Monstruo{
    /**
     * Metodo que calcula el daño dependiendo el elemento del monstruo al que se ataque
     * @param elemento
     * @return 
     */
    @Override
        public float multiplicadorElemental(Monstruo elemento){
            if (elemento instanceof Agua)
                return (float) 2.0;
            else if(elemento instanceof Hierba || elemento instanceof Fuego)
                return (float) 0.5;
            else if(elemento instanceof Electrico){}
                return (float) 1.0;
        }
    
    /**
     * Metodo que calcula el daño a los monstruos enemigos
     * @param enemigo 
     */
    @Override
        public void ataque1(Monstruo enemigo){
            float daño;
        
        System.out.println(this.apodo+" uso electricidad estática. ¡"+enemigo.apodo+" se paraliza!");
		enemigo.estado="paralizado";
        }
}
