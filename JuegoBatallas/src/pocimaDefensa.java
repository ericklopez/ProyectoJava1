/**
 * Subclase defensa de la farmacia (Superclase Pocima)
 * @author erick
 */
public class pocimaDefensa extends Pocima{
    
    /**
     * Método que aumenta la defensa del monstruo
     * @param mon 
     */
    @Override
    public void usarPocima(Monstruo mon){
        mon.recibirDefensa(mon.getDefensa()*0.15f);
    }
    
}
