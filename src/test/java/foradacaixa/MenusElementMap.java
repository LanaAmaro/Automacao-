package foradacaixa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenusElementMap{
	
	@FindBy(xpath = "//a[text()='Clientes']")
	protected WebElement menuCliente;
	
	@FindBy(css = "[href='inserircliente identificacao.html']")
	protected WebElement subMenuClientesInserir;
}
