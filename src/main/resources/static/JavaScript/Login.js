const senhaInput = document.getElementById("senha");
const toggleSenhaButton = document.getElementById("toggleSenha");
const iconSenha = document.getElementById("iconSenha");

toggleSenhaButton.addEventListener("click", () => {
    if (senhaInput.type === "password") {
        senhaInput.type = "text";
        iconSenha.src = "img/mostrar.png"; 
        iconSenha.alt = "Ocultar senha";
    } else {
        senhaInput.type = "password";
        iconSenha.src ="img/ocultar.png" ;
        iconSenha.alt = "Mostrar senha";
    }
});