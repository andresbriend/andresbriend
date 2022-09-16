import java.util.ArrayList;

public class Museo{
    
    ArrayList<RecursoMuseo> recursos = new ArrayList<RecursoMuseo>();
    public RecursoMuseo recursoMuseo;
    

    public Museo(){

    }

    public boolean agregarRecurso(RecursoMuseo recursoMuseo){
        if (recursoMuseo.getTropa().getVida() == 0){
            recursos.add(recursoMuseo);
            return true;
        }
        else{
            return false;
        }
    }
    public void mostrarConsola(){
        for (RecursoMuseo recursoMuseo : recursos){
            System.out.println(recursoMuseo.textoMuseo());
        }
    }
}