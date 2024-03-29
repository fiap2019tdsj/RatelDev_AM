<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="shortcut icon" href="img/ratel.png" />
    <link rel="stylesheet" type="text/css" href="css/form.css">
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <title>Cadastro</title>
</head>

<body>
    <div class="container-central">
        <div class="container-esquerdo">
            <div class="container-conteudo">
                <h1>
                    Cadastre-se para ter acesso ao melhor conte�do de Storytelling
                </h1>
                <div class="img-conteudo-esquerdo">
                    <img src="img/book-cartoon-books-simple.png"/>
                </div>
            </div>
        </div>
        <div class="container-direito">
            <div class="container-conteudo">
                <div class="logo-form">
                    <a href="home.jsp" class="home"><h1>Spit</h1></a>
                </div>
                <form action="#" method="POST" id="fomCadastro">
                    <fieldset>
                        <div class="form-group">
                            <label for="nome">Nome</label>
                            <input type="text" class="form-control" id="nome" name="nome" maxlength="40">
                        </div>

                        <div class="form-group">
                            <label for="email">E-mail</label>
                            <input type="email" class="form-control" id="email" name="email" maxlength="40">
                        </div>

                        <div class="form-group">
                            <label for="senha">Senha</label>
                            <input type="password" class="form-control" id="senha" name="senha" maxlength="40">
                        </div>
                        <div class="form-group">
                            <label for="repita-senha">Repita a senha</label>
                            <input type="password" class="form-control" id="repita-senha" name="repita-senha" maxlength="40">
                        </div>
                        <br>
                        <div class="form-group">
                            <button type="button" class="form-control" id="btnCadastrar" name="btnCadastrar" onclick="return cadastrar()">Cadastrar</button>
                        </div>
                    </fieldset>
                </form>
                <div id="pop-up-nome">
                    <span>Nome deve ter entre 4 e 100 caracteres!</span>
                </div>
                <div id="pop-up-email">
                    <span>Email deve ter entre 7 e 100 caracteres!</span>
                </div>
                <div id="pop-up-senha">
                    <span>Senha deve ter entre 8 e 100 caracteres!</span>
                </div>
                <div id="pop-up-repitaSenha">
                    <span>Senhas n�o conferem!</span>
                </div>
                <div id="pop-up-erro">
                    <span></span>
                </div>
            </div>
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="js/cadastro.js"></script>
</body>

</html>