    Para que possamos utilizar algumas dependências para utilização do FrameWork Selenium Web Driver,
        será necessário acessar o site: mvn repository
            Busca por selenium-java, optar pela versão mais estável, copia o código relacioado ao Maven.
                Na IDE, abre o arquivo pom.xml
                    Adiciona a dependência ao arquivo.
                        Depois salva o arquivo para que todas as dependências sejam baixadas e instaladas.
    
    Onde posso consultar bibliotecas para testes?
        Maven Repository – Para procurar e baixar bibliotecas Java.
        Awesome Testing – Lista das melhores ferramentas de testes.

    Onde posso consultar as principais bibliotecas quando não souber o que usar?
        Maven Repository
        https://github.com/SeleniumHQ


    O que faz?
        Permite controlar navegadores para automatizar testes de interface.
        selenium-java inclui todas as APIs necessárias para interagir com elementos de páginas web.
    
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.8.3</version>
    </dependency>

    Chromium Driver também será necessário baixar, de acordo com a versão do chrome da própria máquina local.
 
    ## **📌 Principais Dependências do Selenium WebDriver + Maven**  

    Ao trabalhar com **Selenium WebDriver** em projetos Maven, é essencial configurar corretamente o **arquivo `pom.xml`** com as dependências necessárias.  
    
    ### **1️⃣ Dependência Principal: Selenium WebDriver**
    Esta é a dependência essencial para automatizar testes em navegadores:  
    
    ```xml
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.20.0</version>  <!-- Última versão recomendada -->
    </dependency>
    ```
    
    ---
    
    ### **2️⃣ Dependências Adicionais para Diferentes Navegadores**
    Dependendo do navegador que você deseja testar, pode ser necessário adicionar dependências específicas.
    
    #### ✅ **ChromeDriver (Google Chrome)**
    ```xml
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-chrome-driver</artifactId>
        <version>4.20.0</version>
    </dependency>
    ```
    
    #### ✅ **GeckoDriver (Mozilla Firefox)**
    ```xml
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-firefox-driver</artifactId>
        <version>4.20.0</version>
    </dependency>
    ```
    
    #### ✅ **EdgeDriver (Microsoft Edge)**
    ```xml
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-edge-driver</artifactId>
        <version>4.20.0</version>
    </dependency>
    ```
    
    ---
    
    ### **3️⃣ WebDriver Manager (Para Gerenciar Drivers Automaticamente)**
    O **WebDriverManager** evita que você tenha que baixar e configurar manualmente os drivers do Chrome, Firefox, Edge, etc.
    
    ```xml
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.6.2</version>
    </dependency>
    ```
    **Exemplo de uso:**
    ```java
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    
    public class Teste {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
        }
    }
    ```
    
    ---
    
    ### **4️⃣ JUnit 5 (Framework para Testes Automatizados)**
    O **JUnit** é um dos frameworks mais utilizados para escrever testes automatizados.
    
    ```xml
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>
    ```
    
    ---
    
    ### **5️⃣ TestNG (Alternativa ao JUnit)**
    Se preferir usar **TestNG**, um framework mais avançado para testes, adicione:
    
    ```xml
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.9.0</version>
        <scope>test</scope>
    </dependency>
    ```
    
    ---
    
    ### **6️⃣ Selenide (Abstração do Selenium)**
    O **Selenide** facilita a escrita de testes automatizados ao eliminar código repetitivo.
    
    ```xml
    <dependency>
        <groupId>com.codeborne</groupId>
        <artifactId>selenide</artifactId>
        <version>7.3.1</version>
    </dependency>
    ```
    
    ---
    
    ### **7️⃣ Extent Reports (Geração de Relatórios)**
    O **Extent Reports** gera relatórios bonitos e detalhados dos testes.
    
    ```xml
    <dependency>
        <groupId>com.aventstack</groupId>
        <artifactId>extentreports</artifactId>
        <version>5.1.1</version>
    </dependency>
    ```
    
    ---
    
    ### **8️⃣ Log4j (Gerenciamento de Logs)**
    O **Log4j** ajuda no monitoramento dos testes através de logs estruturados.
    
    ```xml
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-core</artifactId>
        <version>2.20.0</version>
    </dependency>
    ```
    
    ---
    
    ## **📌 Exemplo Completo do `pom.xml`**
    Aqui está um exemplo completo do `pom.xml` para um **projeto de testes com Selenium + Maven**:
    
    ```xml
    <project xmlns="http://maven.apache.org/POM/4.0.0" 
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
             xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>
    
        <groupId>br.com.meuprojeto</groupId>
        <artifactId>AutomacaoSelenium</artifactId>
        <version>1.0-SNAPSHOT</version>
    
        <properties>
            <maven.compiler.source>17</maven.compiler.source>
            <maven.compiler.target>17</maven.compiler.target>
        </properties>
    
        <dependencies>
            <!-- Selenium WebDriver -->
            <dependency>
                <groupId>org.seleniumhq.selenium</groupId>
                <artifactId>selenium-java</artifactId>
                <version>4.20.0</version>
            </dependency>
    
            <!-- WebDriver Manager -->
            <dependency>
                <groupId>io.github.bonigarcia</groupId>
                <artifactId>webdrivermanager</artifactId>
                <version>5.6.2</version>
            </dependency>
    
            <!-- JUnit 5 -->
            <dependency>
                <groupId>org.junit.jupiter</groupId>
                <artifactId>junit-jupiter</artifactId>
                <version>5.10.0</version>
                <scope>test</scope>
            </dependency>
    
            <!-- Log4j para logs -->
            <dependency>
                <groupId>org.apache.logging.log4j</groupId>
                <artifactId>log4j-core</artifactId>
                <version>2.20.0</version>
            </dependency>
    
            <!-- Extent Reports (Geração de Relatórios) -->
            <dependency>
                <groupId>com.aventstack</groupId>
                <artifactId>extentreports</artifactId>
                <version>5.1.1</version>
            </dependency>
    
            <!-- Selenide (Alternativa ao Selenium WebDriver) -->
            <dependency>
                <groupId>com.codeborne</groupId>
                <artifactId>selenide</artifactId>
                <version>7.3.1</version>
            </dependency>
        </dependencies>
    
        <build>
            <plugins>
                <!-- Plugin do Maven para rodar testes -->
                <plugin>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <version>3.2.5</version>
                </plugin>
            </plugins>
        </build>
    </project>
    ```
    
    ---
    
    ## **📌 Conclusão**
    Aqui estão os **principais recursos** que um projeto Selenium WebDriver + Maven pode incluir:
    
    ✅ **Gerenciamento de dependências** com Selenium WebDriver.  
    ✅ **Drivers automatizados** para diferentes navegadores.  
    ✅ **JUnit 5 ou TestNG** para execução de testes.  
    ✅ **Selenide** para testes mais limpos e fáceis de manter.  
    ✅ **Extent Reports** para relatórios visuais.  
    ✅ **Log4j** para gerenciamento de logs.  
    
    Se precisar de mais alguma coisa, é só perguntar! 🚀🔥