function enviardados(){
    if(document.formLogin.email.value=="" || document.formLogin.email.value.length < 8){
        alert( "Preencha campo NOME corretamente!" );
        document.dados.tx_nome.focus();
        return false;
    }
};

document.querySelector("#senha").addEventListener("click", function (e) {
    if (this.nextElementSibling.type === "password") {
        this.nextElementSibling.type = "text";
        this.classList.remove("passwordInput");
        this.classList.add("passwordShowInput");
    } else {
        this.nextElementSibling.type = "password";
        this.classList.add("passwordInput");
        this.classList.remove("passwordShowInput");
    }
});




function entrar() {
    var email = document.getElementById("email").value;
    var senha = document.getElementById("senha").value;
    if(email == '' || email.length < 5) {
        document.getElementById("email").style.border = "solid 1px #ff886a"; 
        document.getElementById("pop-up-msg").style.display = "block";
    }
    else if (senha == ''){
        document.getElementById("senha").style.border = "solid 1px #ff886a";
        document.getElementById("pop-up-msg").style.display = "block";
    }
    else {
        document.getElementById("pop-up-msg").style.display = "none";
        document.getElementById("email").style.border = "solid 1px #fff";
        document.getElementById("formulario").submit();
    }   
}

$("#fomLogin").change(function() {
    var email = $("#email").val();
    var senha = $("#senha").val();

    if (senha != "" && email != "") {
          $("#btnEntrar").prop('disabled', false);
    } else {
          $("#btnEntrar").prop('disabled', true);
    }       
});

$("#email").change(function() {
    var email = $("#email").val();
    if (email != "") {
          $("#email").addClass("erro");
    } else {
          $("#email").removeClass("erro");
    }       
});

function toggleAcessar() {
    var login = document.querySelector("#login");
    var senha = document.querySelector("#senha");
    var btnAcessar = document.querySelector("#btnAcessar");

    if (login.value != "" && senha.value != "") {
        btnAcessar.disabled = false;
        btnAcessar.classList.add("hoverPointer");
    } else {
        btnAcessar.disabled = true;
        btnAcessar.classList.remove("hoverPointer");
    }
}



