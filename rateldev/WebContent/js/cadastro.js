function cadastrar() {
    var nome = document.getElementById("nome").value;
    var email = document.getElementById("email").value;
    var senha = document.getElementById("senha").value;
    var repitaSenha = document.getElementById("repita-senha").value;

    if (nome == '' || nome.length < 5 || nome.length > 100) {
        document.getElementById("nome").classList.add("erro");
        document.getElementById("pop-up-nome").style.display = "block";
    }

    if (email == '' || email.length < 7 || email.length > 100) {
        document.getElementById("email").classList.add("erro");
        document.getElementById("pop-up-email").style.display = "block";
        return false;
    }

    if (senha == '' || senha.length < 8 || senha.length > 100) {
        document.getElementById("senha").classList.add("erro");
        document.getElementById("pop-up-senha").style.display = "block";
        return false;
    }

    if (repitaSenha != senha) {
        document.getElementById("senha").classList.add("erro");
        document.getElementById("pop-up-repitaSenha").style.display = "block";
        return false;
    }

    document.getElementById("formulario").submit();
}

$("#fomCadastro").onchange(function() {
    var email = $("#email").val();
    var senha = $("#senha").val();

    if (senha != "" && email != "") {
          $("#btnCadastrar").prop('disabled', false);
    } else {
          $("#btnCadastrar").prop('disabled', true);
    }       
});
