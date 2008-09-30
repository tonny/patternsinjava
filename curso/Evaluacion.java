import java.util.Observable;
import java.util.ArrayList;
public class Evaluacion extends Observable
{
    private String m;    
    private ArrayList<Alumno> alum;
    public Evaluacion (){
    alum=new ArrayList<Alumno>();
    }
    public void evaluar(ArrayList<Alumno> a){
        
        for(Alumno al : a){
            al.darExamen( generarNota());
            alum.add(al);
            setChanged();
            notifyObservers(al.mostrarNota());
        }
    }
    public void mostrar(){
        for(Alumno al: alum )
            System.out.println(al.mostrarNota());
    }
    
    public int generarNota(){
        return 60;
    }
}
