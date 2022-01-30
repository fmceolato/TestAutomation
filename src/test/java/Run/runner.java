package Run;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Informa o tipo de classe que é
@RunWith(Cucumber.class)

//Informa as opções do Cucumber
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
        features = "src/test/resources/features",
        tags = {"@cadastro_sucesso"},
        glue = {"Steps"}
)

public class runner {

        public static WebDriver driver;

        @BeforeClass
        public static void start() {
        driver = new ChromeDriver();
        }

        @AfterClass
        public static void stop (){
        driver.quit();
        }


}
