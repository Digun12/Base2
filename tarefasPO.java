package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tarefasPO {
     @FindBy(id = "username")
     protected WebElement nomeUser;
     @FindBy(className = "btn-success")
     protected WebElement btnLogin;
     @FindBy(id = "password")
     protected WebElement senhaUser;
     @FindBy(xpath = "//a[@href='/bug_report_page.php']")
     protected WebElement criarTarefa;
     @FindBy(id = "category_id")
     protected WebElement categoriaP;
     @FindBy(id = "summary")
     protected WebElement resumoP;
     @FindBy(id = "description")
     protected WebElement descricaoP;
     @FindBy(id = "steps_to_reproduce")
     protected WebElement passosReproduzirP;
     @FindBy(id = "additional_info")
     protected WebElement infoAddP;
     @FindBy(className = "btn-primary")
     protected WebElement btnNtp;
}
