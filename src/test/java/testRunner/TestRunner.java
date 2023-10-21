package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

				//features= {".//Features/"},    //To run all features, use this
                features= {".//Features/Login.feature"},  //To run specific feature file
                //features= {".//Features/LoginDDT.feature"},
                //features= {".//Features/LoginDDTExcel.feature"},
                //features= {".//Features/Login.feature",".//Features/AccountRegistration.feature"}, //To run 2 or 3 feature file
                //features="@target/rerun.txt",   // Runs only failures --2, specify both 1 and 2
		glue="stepDefinitions",
		plugin= {"pretty",
				  "html:reports/myreport.html",
				  "json:reports/myreport.json",
				  "rerun:target/rerun.txt"  //Mandatory to capture failures  --1
				},		 
		//dryRun=true,  //By default, it will be false. if true--It will skip the normal execution and will generate the snippets for the undefined files
		//Every step in the feature file should have its corresponding step definition file
		monochrome=true,  //By default, it will be false. we put true if we want the console output to be in a readable format
		tags="@sanity"  //Scenarios tagged with @sanity		//Login.feature will be executed
      //tags = "@sanity and @regression"	//Scenarios tagged with both @sanity and @regression    //Login.feature will be executed
      //tags = "@sanity or @regression"	 //Scenarios tagged with either @sanity or @regression     //Login.feature will be executed
      //tags = "@sanity and not @regression", //Scenarios tagged with @sanity but not tagged with @regression //Login.feature will not be executed
		)
public class TestRunner {

}
