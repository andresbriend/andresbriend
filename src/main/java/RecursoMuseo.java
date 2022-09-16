import java.time.*;

public class RecursoMuseo{
    private LocalDate fecha;
    private Tropa tropa;

    public RecursoMuseo(Tropa tropa, LocalDate fecha){
        this.setTropa(tropa);
        this.setFecha(fecha);
    }



    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Tropa getTropa() {
        return tropa;
    }
    public void setTropa(Tropa tropa) {
        this.tropa = tropa;
    }


    public String textoMuseo(){
        return "[RecursoMuseo]:Fecha de muerte: "+ this.fecha + " Tropa: " + this.tropa.imprimir();
    }


}