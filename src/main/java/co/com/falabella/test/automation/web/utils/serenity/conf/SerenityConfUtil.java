package co.com.falabella.test.automation.web.utils.serenity.conf;

//import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
//import net.thucydides.core.environment.SystemEnvironmentVariables;
//import net.thucydides.core.util.EnvironmentVariables;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

public class SerenityConfUtil
{
    private static EnvironmentVariables propiedades = SystemEnvironmentVariables.createEnvironmentVariables();

    private static EnvironmentSpecificConfiguration configuracion = EnvironmentSpecificConfiguration.from(SerenityConfUtil.propiedades);

    private SerenityConfUtil(){
        throw new UnsupportedOperationException();
    }

    public static EnvironmentSpecificConfiguration getConfiguracion(){
        return SerenityConfUtil.configuracion;
    }

    public interface ISerenityConf {

        String getPropiedad();

        default String getValor()
        {
            return EnvironmentSpecificConfiguration.from(SerenityConfUtil.propiedades).getProperty(getPropiedad());
        }

    }
}
