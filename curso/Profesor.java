
/**
 * Write a description of class Profesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profesor extends Persona
{
    // instance variables - replace the example below with your own
    private long nit;

    /**
     * Constructor for objects of class Profesor
     */
    public Profesor(String nombres, String apellidos, int ci, long nit)
    {
       super(nombres, apellidos, ci);
       this.nit = nit;
    }

    /**
     * Devuelve el nit del profesor
     * 
     * @long   el nit del profesor  
     */
    public long devolverNit()
    {
        return this.nit;
    }
}
