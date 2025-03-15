⭐️ Guia Completo dos Comandos do Selenium WebDriver

Este guia contém todos os comandos essenciais do Selenium WebDriver, organizados em categorias para facilitar a consulta.

🏰 Comandos do Navegador (Browser Commands)

Os comandos do navegador permitem controlar ações como abrir e fechar páginas, obter título, URL e código-fonte.

Comando

Descrição

Exemplo

get(String URL)

Abre uma nova página no navegador.

driver.get("https://exemplo.com");

getTitle()

Obtém o título da página atual.

String title = driver.getTitle();

getCurrentUrl()

Obtém a URL da página atual.

String url = driver.getCurrentUrl();

getPageSource()

Obtém o código-fonte da página.

String source = driver.getPageSource();

close()

Fecha a aba atual do navegador.

driver.close();

quit()

Fecha todas as janelas do navegador.

driver.quit();

🚀 Comandos Avançados do Selenium

⭐️ Trabalhando com Dropdowns

Para interagir com <select> (combobox), use Select:

import org.openqa.selenium.support.ui.Select;

WebElement dropdown = driver.findElement(By.id("meuDropdown"));
Select select = new Select(dropdown);

// Seleciona pelo texto visível
select.selectByVisibleText("Opção 1");

// Seleciona pelo valor
select.selectByValue("valor1");

// Seleciona pelo índice (0 é o primeiro)
select.selectByIndex(2);

⭐️ Manipulando Alertas (Pop-ups do Navegador)

import org.openqa.selenium.Alert;

// Muda para o alerta aberto
Alert alert = driver.switchTo().alert();

// Aceita o alerta
alert.accept();

// Rejeita o alerta (clica em "Cancelar")
alert.dismiss();

// Obtém o texto do alerta
String alertaTexto = alert.getText();

⭐️ Alternando Entre Janelas do Navegador

Caso o teste abra uma nova aba ou janela:

String janelaPrincipal = driver.getWindowHandle();
Set<String> todasJanelas = driver.getWindowHandles();

for (String janela : todasJanelas) {
    if (!janela.equals(janelaPrincipal)) {
        driver.switchTo().window(janela);
        break;
    }
}

⭐️ Trabalhando com Esperas no Selenium

Espera Implícita (Aplicada globalmente a todos os elementos):

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

Espera Explícita (Para um elemento específico):

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Aguarda até que o elemento esteja visível
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("meuElemento")));

🛠️ Capturando Capturas de Tela

Se precisar salvar uma captura de tela do navegador:

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.nio.file.Files;

File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
Files.copy(screenshot.toPath(), new File("screenshot.png").toPath());

📝 Recursos para Consultar Mais Comandos

Se precisar de mais comandos, você pode pesquisar nos seguintes lugares:

🔗 Documentação Oficial do Selenium🔗 Lista Completa de Comandos WebDriver🔗 Repositório Maven (para dependências Java)🔗 Comunidade no Stack Overflow

⭐️ Conclusão

👍 Agora você tem um guia completo dos principais comandos do Selenium WebDriver.📊 Organizado por categorias para facilitar a consulta.🌟 Exemplos práticos corrigidos e melhorados.

Se precisar de mais comandos ou ajuda com um caso específico, me avise! 🚀🔥