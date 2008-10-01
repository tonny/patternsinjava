
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno extends Persona
{
    static int alumnos;
    private int codigosis;
    public Alumno(String nombres,String apellidos, int ci){
        super(nombres, apellidos, ci);
        alumnos++;
        this.codigosis=20000000 + alumnos;
    } 
    public int getCodigosis(){
        return this.codigosis;
    }
    public void darExamen(int nota){
        System.out.println("Nota Examen: "+ nota);
    }
    public String mostrarNota(){
        return ""+35;
    }
}
