package co.com.falabella.test.automation.web.setups.datadefinitions;

import co.com.falabella.test.automation.web.models.scena.Libreto;
import co.com.falabella.test.automation.web.models.scena.screenplay.Protagonista;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;

import java.util.HashMap;
import java.util.Map;

public class LibretoDataDefinition {

    @DataTableType()
    public Libreto libreto(DataTable table)
    {
        for (Map<String, String> tblGherkinInput : table.entries())
        {
            Map<String, String> tblGherkin = new HashMap<>(tblGherkinInput);
            Protagonista.principal().ensayarLibreto(tblGherkin);
        }

        return Protagonista.principal().getLibreto();
    }

}
