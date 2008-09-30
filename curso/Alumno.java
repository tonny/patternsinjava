
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String n,a;
    private int nota;
    public Alumno(String nombre,String apellido){
        n=nombre;
        a=apellido;
    } 
    public void darExamen(int n){
        nota=n;
    }
    public String mostrarNota(){
        return ""+n+a+nota;
    }
}
