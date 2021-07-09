package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void start()
	{
		System.out.println("Started");
	}
	@After
	public void end()
	{
		System.out.println("End");
	}
}
