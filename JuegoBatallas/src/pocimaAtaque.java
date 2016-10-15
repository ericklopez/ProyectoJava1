/**
 * Subclase ataque de la farmacia (Superclase Pocima) 
 * @author erick
 */
public class pocimaAtaque extends Pocima{
    
    /**
     * Método que aumenta el ataque del monstruo
     * @param mon 
     */
    @Override
    public void usarPocima(Monstruo mon){
        mon.recibirAtaque(mon.getAtaque()*0.10f);
    }
    
}
