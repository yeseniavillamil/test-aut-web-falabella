package co.com.falabella.test.automation.web.runners;

public class RunnerConstants {

    private RunnerConstants(){
        throw new UnsupportedOperationException();
    }

    private final static String BASE = "co.com.falabella.test.automation.web";
    private final static String URL = "src/test/resources/co/com/falabella/test/automation/web";

    public final static String PACKAGE_STEP_DEFINITIONS = BASE+".stepdefinitions";
    public final static String PACKAGE_DATA_DEFINITIONS = BASE+".datadefinitions";
    public final static String PACKAGE_SETUPS = BASE+".setups";
    public final static String PACKAGE_FEATURES = URL+"/features";

}
