package foradacaixa;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClienteSteps {

	@Given("efetuei login no sistema")
	public void efetuarLogin() {

		LoginPage loginpage = new LoginPage();

		loginpage.efetuarLogin();

	}

	@And("acessei o menu Clientes >> Inserir")
	public void acessarMenuClientesInserir() {

		MenusPage menuspage = new MenusPage();
		menuspage.acessarMenuClientesInserir();
	}

	@When("na tela Dados de Identificacao informo os dados de Pessoa Fisica")
	public void informarDadosIdentificacaoPF() {

		ClientePage clientepage = new ClientePage();
		clientepage.informarDadosIdentificacaoPF();
	}

	@And("na tela Dados de Identificacao clico em Avancar")
	public void clicarAvancar() {

		ClientePage clientepage = new ClientePage();
		clientepage.clicarAvancar();

	}

	@And("na tela Enderecos informo os enderecos")
	public void informarEnderecos() {

		ClientePage clientepage = new ClientePage();
		clientepage.informarEnderecos();

	}

	@And("na tela Enderecos clico em Salvar")
	public void clicarSalvar() {

		ClientePage clientepage = new ClientePage();
		clientepage.clicarSalvar();

	}

	@Then("na tela Enderecos sera exibida mensagem de sucesso")
	public void verificarMensagemSucesso() {

		ClientePage clientepage = new ClientePage();
		clientepage.verificarMensagemSucesso();

	}

	@And("efetuarei logout do sistema")
	public void efetuarLogout() {

	}

}
