import java.util.ArrayList;
/**
 * Write a description of class EvaluacionEscrita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvaluacionOral extends DecoradorEvaluacion 
{
    public EvaluacionOral(TipoEvaluacion evaluacionADecorar, int notaMaxima){
        super(evaluacionADecorar, notaMaxima);
    }
    public ArrayList<Nota> evaluar(Curso curso){
       return new ArrayList<Nota>();
    }
}
