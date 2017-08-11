
package defaultMethods;


public interface PersonaA 
{
   default public void hablar()
    {
        System.out.println("Hablando de varios temas desde Persona A");
    }
}
