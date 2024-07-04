<h1>Desafios para resolver em Java proposto por Cleyton Vigatto</h1>
<p>
    Antes de começar você vai precisar primeiramente o JDK instalado no seu computador <a href="https://www.oracle.com/java/technologies/downloads/">clique aqui para instalar o JDK</a>, para desenvolver os desafios eu utilizei o Java 22.
</p>
<p>
    Para rodar algum desafio, você deve fazer esses passos:
    <ul>
        <li>Abra o prompt de comando</li>
        <li>entre na pasta do projeto, em específico no diretório onde se encontra as classes dos desafios</li>
        <li>Compile o programa escrevendo: javac CalculadoraBasica.java</li>
        <li>Rode ele escrevendo: java CalculadoraBasica</li>
    </ul>
</p>
<br><br>

<h3>1. Calculadora Básica:</h3>
<h3>Descrição:</h3>
<p>
    Desenvolva um programa em Java que funcione como uma calculadora básica. O programa
    deve receber dois números do usuário e realizar as quatro operações básicas com eles:
    adição, subtração, multiplicação e divisão. O resultado de cada operação deve ser
    apresentado ao usuário de forma clara e organizada.
    Requisitos:
</p>
<h3>Requisitos:</h3>
<ul>
    <li>O programa deve solicitar ao usuário que digite dois números;</li>
    <li>O programa deve verificar se os números digitados são válidos (por exemplo, se não são letras ou símbolos);</li>
    <li>O programa deve realizar as quatro operações básicas (adição, subtração, multiplicação e divisão) com os números digitados;</li>
    <li>O programa deve apresentar o resultado de cada operação de forma clara e organizada;</li>
</ul>
<br><br>

<h3>2. Tabuada:</h3>
<h3>Descrição:</h3>
<p>
    Crie um programa em Java que imprima a tabuada de multiplicação de um número
    escolhido pelo usuário. A tabuada deve apresentar o resultado da multiplicação do número
    escolhido por cada número de 1 a 10.
    Requisitos:
</p>
<h3>Requisitos:</h3>
<ul>
    <li>O programa deve solicitar ao usuário que digite um número inteiro;</li>
    <li>O programa deve verificar se o número digitado é válido (por exemplo, se não é uma letra ou símbolo);</li>
    <li>O programa deve imprimir a tabuada de multiplicação do número escolhido, de 1 a 10.</li>
    <li>O resultado de cada multiplicação deve ser apresentado de forma clara e organizada.</li>
</ul>
<br><br>

<h3>3. Conversor de Medidas:</h3>
<h3>Descrição:</h3>
<p>
    Desenvolva um programa em Java que converta medidas de temperatura entre Celsius e
    Fahrenheit. O usuário deve escolher qual conversão deseja realizar (Celsius para
    Fahrenheit ou Fahrenheit para Celsius) e fornecer o valor a ser convertido. O programa
    deve apresentar o resultado da conversão de forma clara e precisa.
    Requisitos:
</p>
<h3>Requisitos:</h3>
<ul>
    <li>O programa deve apresentar ao usuário um menu com as opções de conversão (Celsius para Fahrenheit e Fahrenheit para Celsius);</li>
    <li>O programa deve solicitar ao usuário que escolha a conversão desejada;</li>
    <li>O programa deve solicitar ao usuário que digite o valor a ser convertido;</li>
    <li>O programa deve verificar se o valor digitado é válido (por exemplo, se não é uma letra ou símbolo);</li>
    <li>O programa deve realizar a conversão de temperatura de acordo com a escolha do usuário;</li>
    <li>O programa deve apresentar o resultado da conversão de forma clara e precisa;</li>
</ul>
<br><br>

<h3>4. Jogo da Adivinhação:</h3>
<h3>Descrição:</h3>
<p>    
    Crie um programa em Java que implemente o clássico jogo da adivinhação. O programa
    deve pensar em um número aleatório entre 1 e 100 e desafiar o usuário a adivinhá-lo. O
    programa deve dar dicas ao usuário se o seu palpite for maior, menor ou igual ao número
    secreto. O jogador tem um número limitado de tentativas para adivinhar o número.
    Requisitos:
</p>
<h3>Requisitos:</h3>
<ul>
    <li>O programa deve gerar um número aleatório entre 1 e 100;</li>
    <li>O programa deve solicitar ao usuário que digite um palpite;</li>
    <li>O programa deve verificar se o palpite do usuário é válido (por exemplo, se não é uma letra ou símbolo e se está dentro da faixa permitida);</li>
    <li>O programa deve informar ao usuário se o seu palpite é maior, menor ou igual ao número secreto;</li>
    <li>O programa deve limitar o número de tentativas do jogador (por exemplo, a 5 tentativas);</li>
    <li>O programa deve parabenizar o jogador se ele adivinhar o número secreto dentro do limite de tentativas;</li>
    <li>O programa deve informar ao jogador o número secreto caso ele não consiga adivinhá-lo dentro do limite de tentativas;</li>
</ul>
<br><br>

<h3>5. Caixa Eletrônico:</h3>
<h3>Descrição:</h3>
<p>
    Desenvolva um programa em Java que simule um caixa eletrônico. O programa deve ter as seguintes funcionalidades:
</p>
<ul>
    <li>Consultar saldo: exibe o saldo disponível na conta do usuário;</li>
    <li>Depositar dinheiro: permite que o usuário deposite dinheiro em sua conta;</li>
    <li>Sacar dinheiro: permite que o usuário saque dinheiro de sua conta, respeitando o limite disponível;</li>
    <li>Exibir as últimas transações: mostra um histórico das últimas operações realizadas na conta;</li>
</ul>
    <h3>Requisitos:</h3>
<ul>
    <li>O programa deve implementar uma conta bancária com saldo inicial;</li>
    <li>O programa deve apresentar um menu com as opções de funcionalidades (consultar saldo, depositar, sacar e exibir transações);</li>
    <li>O programa deve solicitar ao usuário que escolha a operação desejada;</li>
    <li>O programa deve realizar as operações de acordo com a escolha do usuário:
        <ul>
            <li>Consultar Saldo: Exibir o saldo disponível na conta.</li>
            <li>Depositar Dinheiro: Permitir que o usuário digite o valor a ser depositado e atualizar o saldo da conta.</li>
            <li>Sacar Dinheiro: Permitir que o usuário digite o valor a ser sacado, verificar se o valor é válido e se há saldo suficiente, e atualizar o saldo da conta.</li>
            <li>Exibir Últimas Transações: Mostrar um histórico das últimas operações realizadas (tipo de operação, valor, data e hora)</li>
        </ul>
    </li>
</ul>