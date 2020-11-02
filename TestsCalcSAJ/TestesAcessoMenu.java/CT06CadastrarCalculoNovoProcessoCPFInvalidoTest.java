// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CT06CadastrarCalculoNovoProcessoCPFInvalidoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void cT06CadastrarCalculoNovoProcessoCPFInvalido() {
    // Test name: CT06 CadastrarCalculoNovoProcessoCPFInvalido
    // Step # | name | target | value | comment
    // 1 | open | https://vmrhel7sisgest.teste.tecnologia.pgfn/cas/login?service=https%3A%2F%2Fcalculadora.dev.tecnologia.pgfn%2Fcalcsaj%2F%23%2Fvalida-login++++++ |  | 
    driver.get("https://vmrhel7sisgest.teste.tecnologia.pgfn/cas/login?service=https%3A%2F%2Fcalculadora.dev.tecnologia.pgfn%2Fcalcsaj%2F%23%2Fvalida-login++++++");
    // 2 | setWindowSize | 1050x708 |  | 
    driver.manage().window().setSize(new Dimension(1050, 708));
    // 3 | click | css=.fa-navicon |  | 
    driver.findElement(By.cssSelector(".fa-navicon")).click();
    // 4 | click | id=lista_menu |  | 
    driver.findElement(By.id("lista_menu")).click();
    // 5 | click | id=lista_menu |  | 
    driver.findElement(By.id("lista_menu")).click();
    // 6 | click | id=lista_menu |  | 
    driver.findElement(By.id("lista_menu")).click();
    // 7 | click | id=n_processo_judicial |  | 
    driver.findElement(By.id("n_processo_judicial")).click();
    // 8 | type | id=n_processo_judicial | 10000.100010/2030-22 | 
    driver.findElement(By.id("n_processo_judicial")).sendKeys("10000.100010/2030-22");
    // 9 | click | css=.headerquebralinha |  | 
    driver.findElement(By.cssSelector(".headerquebralinha")).click();
    // 10 | select | css=.headerquebralinha | label=Judicial | 
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".headerquebralinha"));
      dropdown.findElement(By.xpath("//option[. = 'Judicial']")).click();
    }
    // 11 | click | css=.headerquebralinha |  | 
    driver.findElement(By.cssSelector(".headerquebralinha")).click();
    // 12 | click | id=juizo |  | 
    driver.findElement(By.id("juizo")).click();
    // 13 | type | id=juizo | testes juizo | 
    driver.findElement(By.id("juizo")).sendKeys("testes juizo");
    // 14 | click | id=tipo_juizo |  | 
    driver.findElement(By.id("tipo_juizo")).click();
    // 15 | type | id=tipo_juizo | tipo juizo testes | 
    driver.findElement(By.id("tipo_juizo")).sendKeys("tipo juizo testes");
    // 16 | click | css=input:nth-child(1) |  | 
    driver.findElement(By.cssSelector("input:nth-child(1)")).click();
    // 17 | click | css=#a7eb7cfcab56-5 > .ng-option-label |  | 
    driver.findElement(By.cssSelector("#a7eb7cfcab56-5 > .ng-option-label")).click();
    // 18 | click | css=.custom-select |  | 
    driver.findElement(By.cssSelector(".custom-select")).click();
    // 19 | select | css=.custom-select | label=Alvara Judicial | 
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".custom-select"));
      dropdown.findElement(By.xpath("//option[. = 'Alvara Judicial']")).click();
    }
    // 20 | click | css=.custom-select |  | 
    driver.findElement(By.cssSelector(".custom-select")).click();
    // 21 | click | css=.body_content |  | 
    driver.findElement(By.cssSelector(".body_content")).click();
    // 22 | click | id=cpf_cnpj_parte |  | 
    driver.findElement(By.id("cpf_cnpj_parte")).click();
    // 23 | type | id=cpf_cnpj_parte | 534.047.731-00 | 
    driver.findElement(By.id("cpf_cnpj_parte")).sendKeys("534.047.731-00");
    // 24 | click | id=nome_parte |  | 
    driver.findElement(By.id("nome_parte")).click();
    // 25 | click | id=cpf_cnpj_parte |  | 
    driver.findElement(By.id("cpf_cnpj_parte")).click();
    // 26 | click | id=nome_parte |  | 
    driver.findElement(By.id("nome_parte")).click();
    // 27 | type | id=nome_parte | Teste1 | 
    driver.findElement(By.id("nome_parte")).sendKeys("Teste1");
    // 28 | click | css=.marginbutton:nth-child(2) |  | 
    driver.findElement(By.cssSelector(".marginbutton:nth-child(2)")).click();
  }
}
