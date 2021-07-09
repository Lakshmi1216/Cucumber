package TestRunner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/DatatableWithoutHeader.feature",glue="StepDef")

public class DatatablewithoutHeaderRunner {

}
