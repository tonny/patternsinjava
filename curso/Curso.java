import java.util.*;
public class Curso{
private ArrayList<Profesor> profesores;
private ArrayList<Alumno> alumnos;
private Evaluacion eva;
private Reportes rep;
    public Curso(){
        profesores=new ArrayList<Profesor>();
        alumnos=new ArrayList<Alumno>();
        eva= new Evaluacion();
        rep=new Reportes();
        eva.addObserver(rep);
    }
    public void agregarPro(Profesor p){
        profesores.add(p);
    }
    public void agregarAlumnos(Alumno p){
        alumnos.add(p);
    }
    public void evaluar(){
        eva.evaluar(alumnos);
        
    }
    public void reportesCusro( ){
            
    }
    
}
