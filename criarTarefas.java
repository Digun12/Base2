package test;


import interactions.tarefasInteractions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class criarTarefas {
    FirefoxDriver browser = new FirefoxDriver();

    @Before
    public void setUp(){
        System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        browser.get("http://mantis-prova.base2.com.br/");
    }

    @After
    public void tearDown(){
        browser.quit();
    }

    @Test
    public void execucao(){
        tarefasInteractions home = new tarefasInteractions(browser);
        home.nUser("Diego_Silva")
                .bLogin()
                .sUser("az66pc29")
                .bLogin()
                .cTarefas()
                .categoriaI()
                .resumoI("teste automação")
                .descricaoI("execução de teste automatizado para base2")
                .passosReproduzirI("executar o código feito por Diego Silva")
                .infoAddI("execução de teste automatizado para base2 no MantisBT")
                .btnNti();
    }
}
