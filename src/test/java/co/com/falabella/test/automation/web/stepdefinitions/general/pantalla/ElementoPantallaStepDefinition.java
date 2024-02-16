package co.com.falabella.test.automation.web.stepdefinitions.general.pantalla;

import co.com.falabella.test.automation.web.models.params.general.pantalla.EstadoElementoParams;
import co.com.falabella.test.automation.web.models.params.general.pantalla.TextoElementoParams;
import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.questions.general.pantalla.SeObservaEstado;
import co.com.falabella.test.automation.web.questions.general.pantalla.SeObservaTextoElemento;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class ElementoPantallaStepDefinition {
    @Entonces("^debería observarse \"([^\"]*)\": \"([^\"]*)\".*")
    public static void deberiaObservarse(String estado, String elemento)
    {
        OnStage.theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                SeObservaEstado.delElemento(estado, elemento, null)
            )
        );
    }

    @Entonces("^debería observarse \"([^\"]*)\"$")
    public static void deberiaObservarse(String estado, Libreto libreto)
    {
        for (EstadoElementoParams params: libreto.getParametrosEstadoElemento()){
            OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                    SeObservaEstado.delElemento(
                        estado,
                        params.getElemento(),
                        params.getParametros()
                    )
                )
            );
        }
        libreto.getParametrosEstadoElemento().clear();
    }

    @Entonces("^debería observarse el estado de los elementos.*")
    public static void deberiaObservarseElEstadoDeLosElementos(Libreto libreto)
    {
        for (EstadoElementoParams params: libreto.getParametrosEstadoElemento()){
            OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                    SeObservaEstado.delElemento(
                        params.getEstado(),
                        params.getElemento(),
                        params.getParametros()
                    )
                )
            );
        }
        libreto.getParametrosEstadoElemento().clear();
    }

    @Entonces("^debería observarse en los elementos, el texto: \"([^\"]*)\".*")
    public static void deberiaObservarseEnLosElementosElTexto(String texto, Libreto libreto)
    {
        for (TextoElementoParams params: libreto.getParametrosTextoElemento()){
            OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                    SeObservaTextoElemento.delElemento(
                        params.getElemento(),
                        params.getParametros(),
                        texto
                    )
                )
            );
        }
        libreto.getParametrosTextoElemento().clear();
    }

    @Entonces("^debería observarse el texto en los elementos.*")
    public static void deberiaObservarseElTextoEnLosElementos(Libreto libreto)
    {
        for (TextoElementoParams params: libreto.getParametrosTextoElemento()){
            OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                    SeObservaTextoElemento.delElemento(
                        params.getElemento(),
                        params.getParametros(),
                        params.getTexto()
                    )
                )
            );
        }
        libreto.getParametrosTextoElemento().clear();
    }

    @Entonces("^debería observarse el texto: \"([^\"]*)\" en los elementos: \"([^\"]*)\".*")
    public static void deberiaObservarseElTextoEnLosElementos(String texto, String elementos)
    {
        OnStage.theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                SeObservaTextoElemento.delElemento(
                    elementos,
                    texto
                )
            )
        );
    }
}
