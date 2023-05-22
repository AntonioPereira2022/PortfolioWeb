package page;

import org.openqa.selenium.By;
import runner.RunnerWeb;
import support.Utils;


public class LoginPage extends RunnerWeb {

    private By create_email_field = By.id("email_create");



    public void acessarSite(){
        getDriver().get("http://automationpractice.pl/index.php");
        getDriver().manage().window().maximize();
    }
    public void clicarEmSign(){
        getDriver().findElement(By.className("login")).click();
    }
    public void preencherEmailValido(String randonEmail){
        getDriver().findElement(create_email_field).sendKeys(Utils.getRandonEmail()); //comando esta na classe utils
    }
    public void criandoConta(){
        getDriver().findElement(By.id("SubmitCreate")).click();
    }
}

