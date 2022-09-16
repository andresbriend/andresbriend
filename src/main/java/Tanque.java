
public class Tanque extends Veiculos{
    Soldado conductor;

    public Tanque(String nombre, Float daño, Float vida, Soldado conductor) {
        super(nombre, daño, vida);
        setConductor(conductor);
    }
    
    Soldado getConductor(){
        return conductor;
    }
    public void setConductor(Soldado conductor){
        this.conductor = conductor;
    }
    
    @Override
    public String imprimir(){
        
        return "[Tanque]" + super.imprimir() + "[Conductor]:" +this.getConductor().imprimir();
    }
}
