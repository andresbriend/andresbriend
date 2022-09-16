
public class Soldado extends Tropa {
    private Cuchillo cutuCuchillo;
    private Ametralladora boomStick;

    public Soldado(String nombre, Float daño, Float vida, Cuchillo armaMelee, Ametralladora armaRango) {
        super(nombre, daño, vida);
        this.setArmaMelee(armaMelee);
        this.setArmaRango(armaRango);
        
    }
    public Soldado(String nombre, Float daño, Float vida, Ametralladora armaRango) {
        super(nombre, daño, vida);
        this.setArmaRango(armaRango);

    }
    public Soldado(String nombre, Float daño, Float vida, Cuchillo armaMelee) {
        super(nombre, daño, vida);
        this.setArmaMelee(armaMelee);
        
    }
    public Soldado(String nombre, Float daño, Float vida) {
        super(nombre, daño, vida);
        
    }
    public Cuchillo getArmaMelee() {
        return cutuCuchillo;
    }
    public void setArmaMelee(Cuchillo arma) {
        this.cutuCuchillo = arma;
    }
    public Ametralladora getArmaRango() {
        return boomStick;
    }
    public void setArmaRango(Ametralladora arma) {
        this.boomStick = arma;
    }
    public float danioMelee(){
        if (this.getArmaMelee() != null){
            return this.getArmaMelee().getDanio() * this.getDaño();
        }
        else{
            return this.getDaño()*0.05f;
        }
        
    }
    public float danioDistancia(){
        if (this.getArmaRango() == null){
            return this.getDaño()*0.10f;
        }
        else{
            if (this.getArmaRango().getMunicion() > 0){
                this.getArmaRango().setMunicion(this.getArmaRango().getMunicion() - 1);
                return this.getArmaRango().getDanio() * this.getDaño();
            }
            else{
                return 0;
            }
        }
    }

    @Override
    public String imprimir() {
        return "[Soldado]" + super.imprimir();
    }
}
