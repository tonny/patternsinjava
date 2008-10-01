import java.util.ArrayList;
public abstract class DecoradorEvaluacion extends TipoEvaluacion
{
    private TipoEvaluacion evaluacionADecorar;
    public DecoradorEvaluacion(TipoEvaluacion evaluacionADecorar, int notaMaxima){
        this.evaluacionADecorar = evaluacionADecorar;
        super.puntajeMaximo=notaMaxima;
    }
    public int getPuntajeMaximo(){
        return this.puntajeMaximo+evaluacionADecorar.getPuntajeMaximo();
    } 
}
