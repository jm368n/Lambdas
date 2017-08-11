
package defaultMethods;

public interface PersonaB {
    default public void hablar()
    {
        System.out.println("Hablando de varios temas desde Persona B");
    }
    
}
