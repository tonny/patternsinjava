import java.util.ArrayList;
/**
 * Write a description of class EvaluacionPractica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvaluacionPractica extends DecoradorEvaluacion 
{
    public EvaluacionPractica(TipoEvaluacion evaluacionADecorar, int notaMaxima){
        super(evaluacionADecorar, notaMaxima);
    }
    public ArrayList<Nota> evaluar(Curso curso){
       return new ArrayList<Nota>();
    }
    public int getNotaevaluacionPractica(){
        return super.getPuntajeMaximo();
    }
}
