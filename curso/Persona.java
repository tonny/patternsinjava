/**
 * Write a description of class Persona here.
 * 
 * @author Sergio 
 * @version 0.0.0.1
 */
public class Persona
{

    private String nombres, apellidos;
    private int ci;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombres, String apellidos, int ci)
    {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ci = ci;
    }

    /**
     * Returns the compete name of the person
     * 
     * @String   el nombre completo de la persona
     */
    public String getNombreCompleto()
    {
        return this.nombres + " " + this.apellidos;
    }
    /**
     * Retorna el ci de la persona
     * 
     * @int    retorna el ci de la persona
     */
    public int getCi()
    {
        return this.ci;
    }
}
