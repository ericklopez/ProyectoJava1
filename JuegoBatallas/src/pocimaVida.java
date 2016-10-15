/**
 * Subclase vida de la farmacia (Superclase Pocima)
 * @author erick
 */
public class pocimaVida extends Pocima{
    
    /**
     * Método que aumenta la vida del monstruo
     * @param mon 
     */
    @Override
    public void usarPocima(Monstruo mon){
       Double temp = (double)mon.hp;
       temp = temp * .20;
       mon.recibirHp(temp.intValue());
    }
    
}
