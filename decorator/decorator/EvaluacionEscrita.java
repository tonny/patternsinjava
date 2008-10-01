import java.util.ArrayList;
public class EvaluacionEscrita extends TipoEvaluacion
{
    public EvaluacionEscrita(int notamaxima)
    {
        super.puntajeMaximo=notamaxima;
    }
    public ArrayList<Nota> evaluar(Curso curso){
       return new ArrayList<Nota>();
    }
}
