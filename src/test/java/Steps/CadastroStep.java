package Steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import page.CadastroPage;
import runner.RunnerWeb;

public class CadastroStep extends RunnerWeb {
    CadastroPage cadastroPage = new CadastroPage();
    String nome = "alves";
    String sobrenome = "pereira";


    @Quando("^preencho os dados solicitados$")
    public void preencho_os_dados_solicitados() {
        cadastroPage.selecionarGenero(1);
        cadastroPage.preencherNomeEmpesa("QA Automation");
        cadastroPage.preencherSobrenome("APRESENTOU");
        cadastroPage.preencherPassword("passar1@");
        cadastroPage.selecionarDiaMesAno(23, 6, "1989");
        cadastroPage.clicarEmRegister();
        cadastroPage.clicarAddMyFirst();
        cadastroPage.preencherNome("jr");
        cadastroPage.preencherUltimoNome("alves");
        cadastroPage.preencherAddress("meu endereço");
        cadastroPage.preencherCity("Barueri");
        cadastroPage.selecionaState("Colorado");
        cadastroPage.preencherCodicoPostal("80001");
        cadastroPage.preencherFone("+55 4830562305126");

    }

    @Quando("^clico em save$")
    public void clico_em_save() {
        cadastroPage.clicarEmSave();
    }

    @Entao("^vejo nome cadastrado com sucesso$")
    public void vejo_nome_cadastrado_com_sucesso() {
        cadastroPage.validarNomeCriado("nome", "sobrenome");
    }
}

