package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import page.tarefasPO;

public class tarefasInteractions extends tarefasPO {
    WebDriver driverinterno;

    public tarefasInteractions nUser(String user){
        nomeUser.sendKeys(user);
        return this;
    }

    public tarefasInteractions bLogin(){
        btnLogin.click();
        return this;
    }

    public tarefasInteractions sUser(String senha){
        senhaUser.sendKeys(senha);
        return this;
    }

    public tarefasInteractions(WebDriver driver){
        driverinterno = driver;
        PageFactory.initElements(driverinterno, this);
    }

    public tarefasInteractions cTarefas(){
        criarTarefa.click();
        return this;
    }

    public tarefasInteractions categoriaI(){
        Select select = new Select(categoriaP);
        select.selectByValue("2");
        return this;
    }

    public tarefasInteractions resumoI(String resumo){
        resumoP.sendKeys(resumo);
        return this;
    }

    public tarefasInteractions descricaoI(String descricao){
        descricaoP.sendKeys(descricao);
        return this;
    }

    public tarefasInteractions passosReproduzirI(String passosReproduzir){
        passosReproduzirP.sendKeys(passosReproduzir);
        return this;
    }

    public tarefasInteractions infoAddI(String infoAdd){
        infoAddP.sendKeys(infoAdd);
        return this;
    }

    public tarefasInteractions btnNti(){
        btnNtp.click();
        return this;
    }


}
