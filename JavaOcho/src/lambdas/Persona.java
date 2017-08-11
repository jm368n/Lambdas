package lambdas;
public class Persona
{
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        //return super.toString();
        System.out.println("Nombre: " + nombre);
        return super.toString();
    }
    
}
