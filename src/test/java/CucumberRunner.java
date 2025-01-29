import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},
        glue = {"restAssured"},
        monochrome = true, tags = "@SelectStore or  @SelectAproduct or  @AddProductToCart or @CheckOut",// or @Payment or @ThankYouMessage",
        plugin = {"pretty"
        })
public class CucumberRunner
{

}

//.header("Header-Authenticator","swetha@gmail.com")