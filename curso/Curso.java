import java.util.*;
public class Curso{
private ArrayList<Profesor> profesores;
private ArrayList<Alumno> listaAlumnos;
private ArrayList<Evaluacion> evaluaciones;
private Reportes reporte;
    public Curso(){
        profesores=new ArrayList<Profesor>();
        listaAlumnos=new ArrayList<Alumno>();
        evaluaciones = new ArrayList<Evaluacion>();
        reporte=new Reportes();
    }
    public void registrarProfesor(Profesor p){
        profesores.add(p);
    }
    public void registrarAlumno(Alumno p){
        listaAlumnos.add(p);
    }
    public ArrayList<Alumno> getListaAlumnos(){
        return this.listaAlumnos;
    }
    public void evaluar(Evaluacion evaluacion){
        evaluacion.addObserver(this.reporte);
        evaluaciones.add(evaluacion);
        evaluacion.evaluar(this.listaAlumnos);        
    }
    public Reportes reportesCusro( ){
        return this.reporte;
    }
    
}
