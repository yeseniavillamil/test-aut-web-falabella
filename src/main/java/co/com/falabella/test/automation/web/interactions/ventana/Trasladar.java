package co.com.falabella.test.automation.web.interactions.ventana;


import co.com.falabella.test.automation.web.interactions.esperas.Detener;
import co.com.falabella.test.automation.web.utils.web.navegador.VentanaUtil;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Switch;

@AllArgsConstructor
public class Trasladar implements Interaction {

    private boolean porTitulo;
    private String contenido;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        for (   String idPestanya : VentanaUtil.getIdPestanyas(actor)  )
        {
            actor.attemptsTo(
                    Switch.toWindow(idPestanya),
                    Detener.por(1).segundos()
            );
            if  (   this.porTitulo
                &&  VentanaUtil.getTituloPestanya(actor).contains(this.contenido)
                ||  !this.porTitulo
                &&  VentanaUtil.getURLPestanyaActual(actor).contains(this.contenido)
            ) {
                break;
            }
        }
    }

    public static Trasladar aPestanya(boolean porTitulo, String contenido)
    {
        return Tasks.instrumented(Trasladar.class,porTitulo, contenido);
    }
}
