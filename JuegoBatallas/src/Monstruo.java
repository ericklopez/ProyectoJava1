/**
 * Superclase de los diferentes tipos de monstruos
 * @author Erick
 */
public abstract class Monstruo {
    public int hp, nivel;
    public float ataque, defensa, velocidad;
    public String apodo, estado;
    
    /**
     * Método recibirDaño que baja los puntos hp del monstruo cuando es atacado
     * @param hp
     * @param estado 
     */
    public void recibirDaño(int hp, String estado){
        this.hp -= hp;
        this.estado = estado;
        
        if(this.hp <= 0)
            this.estado = "Fuera de combate :(";
    }
    
    /**
     * Clase que aumenta los puntos de vida del monstruo
     * @param hp 
     */
    public void recibirHp(int hp){
        this.hp += hp;
    }
    
    /**
     * Clase que aumenta los puntos de ataque del monstruo
     * @param ataque 
     */
    public void recibirAtaque(float ataque){
        this.ataque += ataque;
    }
    
    /**
     * Clase que aumenta los puntos de defensa del monstruo
     * @param defensa 
     */
    public void recibirDefensa(float defensa){
        this.defensa += defensa;
    }
    
    /**
     * Metodo get que regresa el ataque
     * @return 
     */
    public float getAtaque(){
        return this.ataque;
    }
    
    /**
     * Metodo set que asigna un valor al ataque
     * @param ataque
     */
    public void setAtaque(float ataque){
        this.ataque = ataque;
    }
    
    /**
     * Metodo get que regresa la defensa
     * @return 
     */
    public float getDefensa(){
        return this.defensa;
    }
    
    /**
     * Metodo set que asigna un valor a la defensa
     * @param defensa 
     */
    public void setDefensa(float defensa){
        this.defensa = defensa;
    }
    
    /**
     * Metodo get que regresa la velocidad
     * @return 
     */
    public float getVelocidad(){
        return this.velocidad;
    }
    
    /**
     * Metodo set que asigna un valor a la velocidad
     * @param velocidad 
     */
    public void setVelocidad(float velocidad){
        this.velocidad = velocidad;
    }
    
    /**
     * Metodo abstracto que se definiran en clases herederas
     * @param elemento
     * @return 
     */
    public abstract float multiplicadorElemental(Monstruo elemento);
    
    /**
     * Metodos abstractos que se definiran en clases herederas
     * @param enemigo 
     */
    public abstract void ataque1(Monstruo enemigo);
    public abstract void ataque2(Monstruo enemigo);
    
}
