package serializacion;

import java.io.Serializable;

public class Gato implements Serializable {
    
    public String nombre;
    public String raza;

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
    
    
}
