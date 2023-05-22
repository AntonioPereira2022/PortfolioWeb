package Steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import page.LoginPage;
import runner.RunBase;
import runner.RunnerWeb;
import support.Utils;

public class LoginStep extends RunnerWeb {
    LoginPage loginPage = new LoginPage();


    @Dado("^que eu esteja na tela inicial do practice$")
    public void que_eu_esteja_na_tela_inicial_do_practice() {
        getDriver(RunBase.Browser.CHROME);
        loginPage.acessarSite();
    }

    @Quando("^clico em sign$")
    public void clico_em_sign() {
        loginPage.clicarEmSign();
    }

    @Quando("^preencho email valido$")
    public void preencho_email_valido() {
        loginPage.preencherEmailValido(Utils.getRandonEmail());
    }

    @Quando("^clico em create an accont$")
    public void clico_em_create_an_accont() {
        loginPage.criandoConta();
    }


}


