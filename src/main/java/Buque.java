
public class Buque extends Veiculos {
    private Soldado conductor;
    public Buque(String nombre, Float daño, Float vida, Soldado conductor) {
        super(nombre, daño, vida);
        setConductor(conductor);
    }

    public Soldado getConductor() {
        return conductor;
    }
    public void setConductor(Soldado conductor) {
        this.conductor = conductor;
    }
    
    @Override
    public String imprimir(){
        return "[Buque]" + super.imprimir() +"[Conductor]:" +this.getConductor().imprimir();
    }
}
