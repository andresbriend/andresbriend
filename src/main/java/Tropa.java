
public class Tropa {
    private String nombre;
    private Float daño;
    private float vida;
    private float vidaQuitada;
    public Tropa(String nombre, Float daño, Float vida) {
        this.setNombre(nombre);
        this.setDaño(daño);
        this.setVida(vida);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Float getDaño() {
        return daño;
    }
    public void setDaño(Float daño) {
        this.daño = daño;
    }
    public float getVida() {
        return vida;
    }
    public void setVida(Float vida) {
        this.vida = vida;
    }
    
    public void atacar(Tropa enemigo, Escudo escudo, float damage) {
        if(this.verificarVida() == true && enemigo.verificarVida() == true){
            if (escudo != null) {
                vidaQuitada = escudo.defensaXdano(damage);
                enemigo.setVida(enemigo.getVida() - vidaQuitada);
                if (enemigo.getVida() < 0) {
                    enemigo.setVida(0.0f);

                }
            }
            else {
                // transformar el daño a float
                vidaQuitada = damage;
                
                enemigo.setVida(enemigo.getVida() - vidaQuitada);
                if (enemigo.getVida() < 0) {
                    enemigo.setVida(0.0f);
                }
            }
            
            System.out.println(this.getNombre() + " ataco a " + enemigo.getNombre() + " y le quito " + vidaQuitada + " de vida. \nLa vida de " + enemigo.getNombre() + " es " + enemigo.getVida());
        }
        else{
            if (enemigo.verificarVida() == false){
                System.out.println(this.getNombre() + " no puede atacar a "+ enemigo.getNombre() + " porque esta muerto");
            }
            if (this.verificarVida() == false){
                System.out.println(this.getNombre() + " no puede atacar porque esta muerto");
            }
        }
        
}
    
    public boolean verificarVida(){
        if(this.getVida() <= 0){
            System.out.println("La tropa " + this.getNombre() + " ha muerto");
            
            return false;
        }
        else{
            return true;
        }
    }

    
    public String imprimir(){

        return " Nombre: "+this.getNombre()+" Vida: "+this.getVida()+" Daño: "+this.getDaño()+" ";
    }
}
