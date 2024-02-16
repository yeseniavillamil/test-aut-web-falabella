package co.com.falabella.test.automation.web.stepdefinitions.general.pantalla;

import co.com.falabella.test.automation.web.models.params.general.pantalla.TextoZonaParams;
import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.questions.general.pantalla.SeObservaTexto;
import co.com.falabella.test.automation.web.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class TextoPantallaStepDefinition {

    @Entonces("^debería presentarse: \"([^\"]*)\".*")
    public static void deberiaPresentarse(String textos)
    {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        SeObservaTexto.enPantalla(
                            EstadoElemento.VISIBLE,
                            false,
                            textos
                        )
                )
        );
    }

    @Entonces("^debería presentarse en \"([^\"]*)\": \"([^\"]*)\".*")
    public static void deberiaPresentarseEn(String seccion, String textos)
    {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        SeObservaTexto.enPantalla(
                            EstadoElemento.VISIBLE,
                            false,
                            seccion,
                            textos
                        )
                )
        );
    }

    @Entonces("^debería presentarse en \"([^\"]*)\" con \"([^\"]*)\"")
    public static void deberiaPresentarseEnCon(String seccion, String parametros, Libreto libreto)
    {
        for (TextoZonaParams params: libreto.getParametrosTextoZona()){
            OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                    SeObservaTexto.enPantalla(
                        EstadoElemento.VISIBLE,
                        false,
                        seccion,
                        parametros,
                        params.getTexto()
                    )
                )
            );
        }
        libreto.getParametrosTextoZona().clear();
    }

    @Entonces("^debería presentarse en \"([^\"]*)\"$")
    public static void deberiaPresentarseEn(String seccion, Libreto libreto)
    {
        for (TextoZonaParams params: libreto.getParametrosTextoZona()){
            OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                    SeObservaTexto.enPantalla(
                        EstadoElemento.VISIBLE,
                        false,
                        seccion,
                        params.getParametros(),
                        params.getTexto()
                    )
                )
            );
        }
        libreto.getParametrosTextoZona().clear();
    }

    @Entonces("^debería presentarse$")
    public static void deberiaPresentarse(Libreto libreto)
    {
        for (TextoZonaParams params: libreto.getParametrosTextoZona()){
            OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                    SeObservaTexto.enPantalla(
                        EstadoElemento.VISIBLE,
                        false,
                        params.getSeccion(),
                        params.getParametros(),
                        params.getTexto()
                    )
                )
            );
        }
        libreto.getParametrosTextoZona().clear();
    }






    @Entonces("^debería presentarse exactamente: \"([^\"]*)\".*")
    public static void deberiaPresentarseExactamente(String textos)
    {
        OnStage.theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                SeObservaTexto.enPantalla(
                    EstadoElemento.VISIBLE,
                    true,
                    textos
                )
            )
        );
    }

    @Entonces("^debería presentarse exactamente en \"([^\"]*)\": \"([^\"]*)\".*")
    public static void deberiaPresentarseExactamenteEn(String seccion, String textos)
    {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        SeObservaTexto.enPantalla(
                            EstadoElemento.VISIBLE,
                            true,
                            seccion,
                            textos
                        )
                )
        );
    }

    @Entonces("^debería presentarse exactamente en \"([^\"]*)\" con \"([^\"]*)\"")
    public static void deberiaPresentarseExactamenteEnCon(String seccion, String parametros, Libreto libreto)
    {
        for (TextoZonaParams params: libreto.getParametrosTextoZona()){
            OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                    SeObservaTexto.enPantalla(
                        EstadoElemento.VISIBLE,
                        true,
                        seccion,
                        parametros,
                        params.getTexto()
                    )
                )
            );
        }
        libreto.getParametrosTextoZona().clear();
    }

    @Entonces("^debería presentarse exactamente en \"([^\"]*)\"$")
    public static void deberiaPresentarseExactamenteEn(String seccion, Libreto libreto)
    {
        for (TextoZonaParams params: libreto.getParametrosTextoZona()){
            OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                    SeObservaTexto.enPantalla(
                        EstadoElemento.VISIBLE,
                        true,
                        seccion,
                        params.getParametros(),
                        params.getTexto()
                    )
                )
            );
        }
        libreto.getParametrosTextoZona().clear();
    }

    @Entonces("^debería presentarse exactamente$")
    public static void deberiaPresentarseExactamente(Libreto libreto)
    {
        for (TextoZonaParams params: libreto.getParametrosTextoZona()){
            OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                    SeObservaTexto.enPantalla(
                        EstadoElemento.VISIBLE,
                        true,
                        params.getSeccion(),
                        params.getParametros(),
                        params.getTexto()
                    )
                )
            );
        }
        libreto.getParametrosTextoZona().clear();
    }
}
