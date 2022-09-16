
public abstract class ArmaBase {
    private String nombre;
    private float danio;

    public ArmaBase(String nombre, Float danio) {
        this.setDanio(danio);
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDanio() {
        return danio;
    }

    public void setDanio(Float danio) {
        this.danio = danio;
    }

    
}

