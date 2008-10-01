import java.util.ArrayList;
public abstract class TipoEvaluacion
{
    protected int puntajeMaximo;
    public abstract ArrayList<Nota> evaluar(Curso curso);
    
    public void setPuntajeMaximo(int puntaje){
        this.puntajeMaximo=puntaje;
    }
    public int getPuntajeMaximo(){
        return this.puntajeMaximo;
    }
}
