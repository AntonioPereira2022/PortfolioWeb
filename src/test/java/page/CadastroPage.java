package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunnerWeb;
import support.Utils;


public class CadastroPage extends RunnerWeb {


    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By password_field = By.id("passwd");

    private By select_day_filed = By.id("days");
    private By select_months_filed = By.id("months");
    private By select_years_filed = By.id("years");

    private By register_filed = By.cssSelector("#submitAccount > span");

    private By first_field = By.id("firstname");
    private By last_field = By.id("lastname");
    private By address1_field = By.id("address1");
    private By city_field = By.id("city");
    private By state_field = By.id("id_state");
    private By postcode_field = By.id("postcode");
    private By phone_mobile_field = By.id("phone_mobile");
    private By save_field = By.cssSelector("#submitAddress > span");
    private By AddMyFirst_filed = By.xpath("//span[text()= 'Add my first address'] ");





    public void selecionarGenero(Integer type) {
        Utils.waitElementBePresen(titleM, 20);
        if (type == 1) {
            getDriver().findElement(titleM).click();                         //se for M
        } else if (type == 2) {                                         // ou se receber esse parametro 2
            getDriver().findElement(titleF).click();                         //se for 2

        }

    }

    public void preencherNomeEmpesa(String nome) {
       getDriver().findElement(first_name_field).sendKeys(nome);
    }

    public void preencherSobrenome(String sobrenome) {
        getDriver().findElement(last_name_field).sendKeys(sobrenome);
    }

    public void preencherPassword(String password) {
       getDriver().findElement(password_field).sendKeys(password);
    }

    public void selecionarDiaMesAno(Integer day, Integer months, String year) {
        Select select_day = new Select(getDriver().findElement(select_day_filed));
        select_day.selectByIndex(day);

        Select select_month = new Select(getDriver().findElement(select_months_filed));
        select_month.selectByIndex(months);

        Select select_year = new Select(getDriver().findElement(select_years_filed));
        select_year.selectByValue(year);

    }

    public void clicarEmRegister() {

        getDriver().findElement(register_filed).click();
    }

    public void clicarAddMyFirst() {
        getDriver().findElement(AddMyFirst_filed).click();

    }

    public void preencherNome(String nome2) {
        getDriver().findElement(first_field).sendKeys(nome2);
    }

    public void preencherUltimoNome(String Ultimo) {
        getDriver().findElement(last_field).sendKeys(Ultimo);
    }



    //*************************************************************//

    public void preencherAddress(String endereço) {
        getDriver().findElement(address1_field).sendKeys(endereço);

    }

    public void preencherCity(String cidade) {
        getDriver().findElement(city_field).sendKeys(cidade);
    }

    public void selecionaState(String state) {
        Select select_state = new Select(getDriver().findElement(state_field));
        select_state.selectByVisibleText(state);

    }
    public void preencherCodicoPostal(String postalcode){
        getDriver().findElement(postcode_field).sendKeys(postalcode);

    }

    public void preencherFone(String fone) {
        getDriver().findElement(phone_mobile_field).sendKeys(fone);

    }

    public void clicarEmSave() {
        getDriver().findElement(save_field).click();

    }

    public void validarNomeCriado(String nome, String sobrenome){
        Utils.waitElementBePresen(By.className("button-search"),20);
        String resultado_atual = getDriver().findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
       //Assert.assertEquals("QA Automation APRESENTOU", resultado_atual);
    }


}




