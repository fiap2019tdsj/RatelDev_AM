<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="shortcut icon" href="img/ratel.png" />
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/chat.css">
    <link rel="stylesheet" type="text/css" href="css/conteudo.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <title>Conte�do</title>    
</head>
<body>
    <div class="topo">
        <div class="centraliza-topo">
            <div class="logo-topo">
                <a href="home.jsp" class="home"><h1>Spit</h1></a>
            </div> 
        </div>
    </div>
    <div class="centraliza-conteudo">
        <div class="topicoConteudo">
	        <div class="bloco-texto">
	            <h1>Definindo Storytelling</h1>
	            <p>
	                Storytelling vem do ingl�s Story = "hist�ria", telling = "contar", ou seja a arte de contar hist�ria, exatamente como nossos pais faziam 
	                conosco quando �ramos crian�as ou como autores de livros e filmes fazem at� hoje.
	            </p>
	            <br/>
	            <p>
	                As hist�rias s�o sempre a reprodu��o de uma sequ�ncia de fatos verdadeiros ou n�o, que tem personagens, conflitos e cen�rios. 
	                As hist�rias mais empolgantes rendem milh�es em bilheterias no cinema e at� saem de l�, passam a fazer parte do dia a dia das pessoas, 
	                como Stars Wars por exemplo. os personagens centrais das tramas s�o pessoas, animais ou objetos com os quais nos identificamos fortemente 
	                sentimo-nos atraidos a ouvir sua hist�ria, acompanhar cada c�pitulo e viver a emo��o de ver o come�o, meio e fim do enredo. 
	                Todos n�s j� nos sentimos assim instigados a acompanhar uma boa hist�ria. O que impediria ent�o as marcas de se colocarem como personagens 
	                centrais de uma hist�ria, fazendo com que a gente tamb�m queira acompanh�la? nada, absolutamente nada. Parece simples, mas n�o � t�o facil 
	                ser um contador de hist�ria.
	            </p>
	        </div>
	        <div class="bloco-img">
	            <img src="img/book2.png">
	        </div>
        </div>
        <div class="topicoConteudo">
	        <div class="bloco-img">
	            <img src="img/Heros-journey.jpg">
	        </div>
	        <div class="bloco-texto">
	            <h1>Jornada do her�i</h1>
	            <p>
	                Segundo Campbell (1949), lendas e mitos no mundo inteiro compartilham de uma estrutura de hist�ria, e a esta estrutura foi dado 
	                o nome de "monomito" ou "jornada do her�i".
	            </p>
	            <br/>
	            <p>
	                Praticamente todos os arqu�tipos cl�ssicos de Jung s�o aplicados. Na jornada do her�i, um personagem fict�cio deixa sua 
	                comunidade e embarca em uma jornada perigosa, geralmente para recuperar algo ou algu�m pelo qual tem muito apre�o. 
	                Vogler (1998) criou um molde cujos doze passos podem ser utilizados para escrever uma hist�ria de sucesso, e aplicam-se � 
	                jornada do her�i.
	            </p>
	        </div>
        </div>
    </div>
    <div class="rodape">
        <div class="centraliza-rodape">
            <p>Ratel Dev.</p>
        </div>
    </div>
    <div class="caixa-chat">
        <h2 class="title">Fa�a uma pergunta!</h2>
	    <section class="container hide">
        	<h2 class="title2">Fa�a uma pergunta!</h2>
	        <div class="chat-container"></div>
	        <div class="controls">
	            <button id="recordButton"><i class="material-icons">mic</i></button>
	            <button id="pauseButton" disabled><i class="material-icons">pause</i></button>
	            <button id="stopButton" disabled><i class="material-icons">stop</i></button>
	            <input type="hidden" id="hPergunta" />
	        </div>
	    </section>
    </div>
    <script src="https://cdn.rawgit.com/mattdiamond/Recorderjs/08e7abd9/dist/recorder.js"></script>
    <!-- Para a versão dois utilizar o script main.js -->
    <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript" src="js/tts.js"></script>
    <script type="text/javascript" src="js/stt.js"></script>
</body>
</html>