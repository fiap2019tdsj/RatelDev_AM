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
                <h1>Spit</h1>
            </div>
            <nav>
                <ul class="menu">
                    <li><b><i class="material-icons">
                            storage
                        </i></b>
                    </li>
                    <jsp:useBean id="dao" class="br.com.fiap.rateldev.dao.MenuDAO"/>
					<ul>
						<c:forEach var="menu" items="${dao.gerarMenu()}">
							<li>
								<a href="${menu.url}" title="${menu.descricao}">
									${menu.nome}
								</a>
							</li>
						</c:forEach>
					</ul>
                </ul>
            </nav>
            <div class="login-topo">
                <i class="material-icons">account_circle</i>
            </div> 
        </div>
    </div>
    <div class="centraliza-conteudo">
        <div class="select-topico">            
        </div>
        <div class="bloco-texto">
            <h2>What is Lorem Ipsum?</h2>
            <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
            </p>
            <br/>
            <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
            </p>
        </div>
        <div class="bloco-img">
            <img src="img/equipefeliz.png">
        </div>
        <div class="bloco-img">
            <img src="img/equipefeliz.png">
        </div>
        <div class="bloco-texto">
            <h2>What is Lorem Ipsum?</h2>
            <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
            </p>
            <br/>
            <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
            </p>
        </div>
    </div>
    <div class="rodape">
        <div class="centraliza-rodape">
            <p>Ratel Dev.</p>
        </div>
    </div>
    <div class="caixa-chat">
        <section class="container">
            <h2 class="title">Faça uma perguta!</h2>
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