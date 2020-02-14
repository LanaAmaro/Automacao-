package foradacaixa;

import org.openqa.selenium.WebElement;

public class LoginPage {

	protected WebElement login;
	protected WebElement senha;
	protected WebElement btnLogin;

	public void efetuarLogin() {

		login.sendKeys("cassio");
		senha.sendKeys("12345");
		btnLogin.click();

	}

}
