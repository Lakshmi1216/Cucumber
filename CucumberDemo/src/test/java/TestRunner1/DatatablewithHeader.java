package TestRunner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/DatatableWithHeader.feature",glue="StepDef" , dryRun=true,
monochrome=true,
plugin= {"pretty","junit:target/reports/Cucumber.xml","html:target/cucumber-html-report",
"json:target/MyReports/report.json",})

public class DatatablewithHeader {
}
