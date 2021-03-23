<h1 align="center">Automation Practice</h1>
<p align="center">Testes realizados em Selenium Web Driver com a linguagem Java e relatórios utilizando Allure. Teste realizando compra no site Automation practice</p>


<h2 align="center">Pré requisitos</h2>

<p> Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:</p>
<p><a href="https://git-scm.com">Git</a>, <a href="https://nodejs.org/en/">Node.js</a>, <a href="https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR">Java</a>, <a href="https://www.selenium.dev/downloads/">Selenium Webdriver</a> na opção da linguagem Java;</p>
<p>O navegador <a href="https://www.google.com/intl/pt-BR/chrome/">Google Chrome</a> e o <a href="https://chromedriver.chromium.org/downloads">Chrome driver</a> compatível com a versão do navegador utilizado.
<p>Um editor de texto, como o <a href="https://www.jetbrains.com/pt-br/idea/download/#section=windows">IntelliJ</a>;</p>
<p></p>
<p>E para a geração dos relatórios, o Allure:
<p>Instalar primeiramente o <a href="https://github.com/PowerShell/PowerShell/releases/tag/v7.1.3">Powershell</a>;</p>
<p>No Powershell executar o comando para baixar o Scoop:</p>
 <p> Invoke-Expression (New-Object System.Net.WebClient).DownloadString('https://get.scoop.sh')</p>
<p>Após, executar o comando para baixar o Allure:</p>
  <p>scoop install allure</p>
  
 <p>No terminal digitar o comando: <b>webdriver-manager start</b> para inicializar o Selenium Webdriver</p>
  
<h2 align="center">Rodando os testes e gerando relatórios</h2>

<p> Para rodar os testes após todas as configurações e estar com o projeto aberto no seu IntelliJ seguir a rota:
 src/test/java/tests/SetupTest.java</p>
<p>Com o SetupTest aberto, clicar em Run para que os testes executem automaticamente.</p>
<p> Para executar o teste com o comando maven. Ir no IntelliJ e configurações e adicionar no command line “clean test” e clicar em OK e RUN (botão verde de execução).</p>
<p> Para executar o relatório Allure escrever o comando: <b>allure serve </b> no terminal.
