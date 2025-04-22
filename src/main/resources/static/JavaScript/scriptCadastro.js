document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("cadastroUsuarioForm");

    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const nomeUsuario = document.getElementById("nomeUsuario").value;
        const cpf = document.getElementById("cpf").value;
        const email = document.getElementById("email").value;
        const telefone = document.getElementById("telefone").value;
        const dtNascimento = document.getElementById("dtNascimento").value;

        try {
            const response = await fetch("http://localhost:8080/cadastrousuario", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body:JSON.stringify({
                    nomeUsuario,
                    cpf,
                    email,
                    telefone,
                    dtNascimento
                }),
            });

            if (response.ok) {
                window.location.href = "enviado.html";
            } else {
                alert("Falha ao cadastrar cliente");
            }
        } catch (error) {
            console.error("Erro ao cadastrar cliente: ", error);
        }
    });
});