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
    <title>Conteúdo</title>    
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
	                Storytelling vem do inglês Story = "história", telling = "contar", ou seja a arte de contar história, exatamente como nossos pais faziam 
	                conosco quando éramos crianças ou como autores de livros e filmes fazem até hoje.
	            </p>
	            <br/>
	            <p>
	                As histórias são sempre a reprodução de uma sequência de fatos verdadeiros ou não, que tem personagens, conflitos e cenários. 
	                As histórias mais empolgantes rendem milhões em bilheterias no cinema e até saem de lá, passam a fazer parte do dia a dia das pessoas, 
	                como Stars Wars por exemplo. os personagens centrais das tramas são pessoas, animais ou objetos com os quais nos identificamos fortemente 
	                sentimo-nos atraidos a ouvir sua história, acompanhar cada cápitulo e viver a emoção de ver o começo, meio e fim do enredo. 
	                Todos nós já nos sentimos assim instigados a acompanhar uma boa história. O que impediria então as marcas de se colocarem como personagens 
	                centrais de uma história, fazendo com que a gente também queira acompanhála? nada, absolutamente nada. Parece simples, mas não é tão facil 
	                ser um contador de história.
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
	            <h1>Jornada do herói</h1>
	            <p>
	                Segundo Campbell (1949), lendas e mitos no mundo inteiro compartilham de uma estrutura de história, e a esta estrutura foi dado 
	                o nome de "monomito" ou "jornada do herói".
	            </p>
	            <br/>
	            <p>
	                Praticamente todos os arquétipos clássicos de Jung são aplicados. Na jornada do herói, um personagem fictício deixa sua 
	                comunidade e embarca em uma jornada perigosa, geralmente para recuperar algo ou alguém pelo qual tem muito apreço. 
	                Vogler (1998) criou um molde cujos doze passos podem ser utilizados para escrever uma história de sucesso, e aplicam-se à 
	                jornada do herói.
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
        <h2 class="title">Faça uma pergunta!</h2>
	    <section class="container hide">
        	<h2 class="title2">Faça uma pergunta!</h2>
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
    <!-- Para a versÃ£o dois utilizar o script main.js -->
    <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript" src="js/tts.js"></script>
    <script type="text/javascript" src="js/stt.js"></script>
</body>
</html>