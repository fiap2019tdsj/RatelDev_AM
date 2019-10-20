<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
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
                    Lorem Ipsum
                </h1>
                <br>
                <p>
                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
                </p>
                <div class="img-conteudo-esquerdo">
                    <img src="img/book-cartoon-books-simple.png"/>
                </div>
            </div>
        </div>
        <div class="container-direito">
            <div class="container-conteudo">
                <div class="logo-form">
                    <h1>Spit</h1>
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
                    </fieldset>
                </form>
                <div id="pop-up-msg">
                    <span>Preencha os campos corretamente!</span>
                </div>
            </div>
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="js/login.js"></script>
</body>

</html>