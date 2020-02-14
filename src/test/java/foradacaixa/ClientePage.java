package foradacaixa;

import org.openqa.selenium.support.ui.Select;

public class ClientePage extends ClienteElementMap {

	public void informarDadosIdentificacaoPF() {

		fisica.click();
		cpf_cnpj.sendKeys("039.837.360-41");
		nome_razaosocial.sendKeys("Arnold Pereira Silva");
		email.sendKeys("arnold@yahoo.com.br");
		data_nascimento.sendKeys("24/08/1978");

		Select secSexo = new Select(sexo);
		secSexo.selectByVisibleText("Masculino");

		Select secEstado_civil = new Select(estado_civil);
		secEstado_civil.deselectByVisibleText("Solteiro");

	}

	public void clicarAvancar() {

		avancar.click();

	}

	public void informarEnderecos() {

		endp_cep.sendKeys("91180-640");
		endp_endereco.sendKeys("Marta Rocha");
		endp_numero.sendKeys("325");
		endp_complemento.sendKeys("Casa");
		endp_cidade.sendKeys("Cachoeira do Sul");
		Select estado = new Select(endp_estado);
		estado.selectByVisibleText("RS");
		endp_telefone.sendKeys("51 3245-67543");
		endp_celular.sendKeys("51 98999-5487");

		endpc_cep.sendKeys("91180-640");
		endpc_endereco.sendKeys("Marta Rocha");
		endpc_numero.sendKeys("325");
		endpc_complemento.sendKeys("Casa");
		endpc_cidade.sendKeys("Cachoeira do Sul");
		Select estadoc = new Select(endpc_estado);
		estadoc.selectByVisibleText("RS");
		endpc_telefone.sendKeys("51 3245-67543");
		endpc_celular.sendKeys("51 98999-5487");
	}

	public void verificarMensagemSucesso() {
		// TODO Auto-generated method stub

	}

	public void clicarSalvar() {

		salvar.click();

	}

}
