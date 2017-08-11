
package ordenar;

public class Alumno implements Comparable<Alumno> {
    
    public String nombre;
    public String apellido;
    public int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   
    
    @Override
    public int compareTo(Alumno o)
    {
        return nombre.compareTo(o.nombre);
    }
    
    @Override
    public String toString()
    {
        String a = new String();
        return "Alumno{" + "nombre" + nombre + ", edad=" + edad + '}';
    }
    
}
