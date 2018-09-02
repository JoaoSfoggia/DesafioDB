package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Features/Compras.feature", glue = {
		"" }, monochrome = true, dryRun = false, format = { "pretty", "html:Report_HTML",
				"json:Report_JSON/testDemoStore.json", "junit:Report_XML/testDemoStore.xml" })

public class Teste {
	public void main() {
	}
}