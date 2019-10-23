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
    <title>Login</title>
</head>

<body>
    <div class="container-central">
        <div class="container-esquerdo">
            <div class="container-conteudo">
                <h1>
                    Encontre tudo o que voc� precisa aqui
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
                <form action="#" method="POST" name="formLogin" id="formLogin">
                    <fieldset>
                        <div class="form-group">
                            <label for="email">E-mail</label>
                            <input type="email" class="form-control" id="email" name="email" maxlength="40" required>
                        </div>

                        <div class="form-group">
                            <label for="senha">Senha</label>
                            <input type="password" class="form-control" id="senha" name="senha" maxlength="40" required>
                            
                            <span class="passwordShowInput" id="senhaShow"  title="Mostrar/Esconder senha"><i class="material-icons">visibility</i></span>                            
                            <span class="passwordInput" id="senhaShow"  title="Mostrar/Esconder senha"><i class="material-icons">visibility_off</i></span>
                        </div>
                        <br>
                        <div class="form-group">
                            <button type="submit" class="form-control" id="btnEntrar" onclick="return entrar()" name="btnEntrar" title="Preencha todos os campos!">Entrar</button>
                        </div>
                        <a href="cadastro.jsp" id="cadastrar">N�o possui cadastro? Crie um aqui!</a>
                    </fieldset>
                </form>
                <div id="pop-up-msg">
                    <span>Preencha os campos corretamente!</span>
                </div>
                <div id="pop-up-erro">
                    <span>Preencha os campos corretamente!</span>
                </div>
            </div>
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="js/login.js"></script>
</body>

</html>