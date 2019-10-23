window.onload = function() {
	callBot("");
}

function scrollDivDown(div) {
	for (var i = 0; i < div.offsetHeight; i++) {
		div.scrollTop++;
	}
}

function createMessage(message, type) {
	var chat = document.querySelector(".chat-container");
	var div = createDiv(message, type);
	chat.appendChild(div);
	scrollDivDown(chat);
}

function createDiv(text, type) {
	var div = document.createElement("div");
	div.classList.add("chat");
	div.classList.add(type);
	div.textContent = text;
	return div;
}

function callBot(msg) {
	var xhr = new XMLHttpRequest();
	xhr.open("POST", "chatbot", true);
	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");
	
	//Abrindo o listener para pegar a resposta da requisição que faremos depois
	xhr.addEventListener("load", function() {
		if(xhr.status == 200) {
			var respostas = JSON.parse(xhr.responseText);
			respostas.forEach(function(resposta) {
				if(!(resposta === null) && !(resposta == ""))
					sendMessageToVoice(resposta.text);
			});
		} else {
			// Codigo de deu ruim!
			console.log(xhr.status);
			console.log(xhr.responseText);
		}
	});
	
	var data = "question=" + msg;
	xhr.send(data);
}

var assistant = document.querySelector(".title");
assistant.addEventListener("click", function() {
	var chat = document.querySelector(".container");
	if (chat.classList.contains('hide')) {
		chat.classList.remove("hide");
	} else {
		chat.classList.add("hide");
	}
});

var assistant2 = document.querySelector(".title2");
assistant2.addEventListener("click", function() {
	var chat = document.querySelector(".container");
	if (chat.classList.contains('hide')) {
		chat.classList.remove("hide");
	} else {
		chat.classList.add("hide");
	}
});