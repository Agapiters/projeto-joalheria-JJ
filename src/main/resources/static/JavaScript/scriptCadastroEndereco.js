document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("formCadastroEndereco");

    // Busca o ID da pessoa armazenado
    const idUsuario = localStorage.getItem('idUsuario');

    if (!idUsuario) {
        alert("Usuário não encontrado. Por favor, cadastre-se primeiro.");
        window.location.href = "cadastro.html";
        return;
    }

    // Evento de envio do formulário
    form.addEventListener("submit", function (event) {
        event.preventDefault();

        // Coleta os dados do formulário
        const nomeRua = document.getElementById("nomeRua").value;
        const numeroCasa = document.getElementById("numeroCasa").value;
        const cidade = document.getElementById("cidade").value;
		const bairro = document.getElementById("bairro").value;
        const estado = document.getElementById("estado").value;
        const cep = document.getElementById("cep").value;
        const comp = document.getElementById("comp").value;

        // Faz o POST para o backend
        fetch(`http://localhost:8080/api/enderecos`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                nomeRua,
                numeroCasa,
                cidade,
		bairro,
                estado,
                cep,
                comp,
                pessoa: {
                    idUsuario
                }
            })
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error("Erro ao cadastrar endereço.");
                }
                return response.json();
            })
            .then(data => {
                alert("Cadastro de endereço realizado com sucesso!");
                localStorage.removeItem('idUsuario'); // Limpa o ID da pessoa
                window.location.href = "index.html"; // Redireciona para a página principal
            })
            .catch(error => {
                console.error("Erro:", error);
                alert("Erro ao cadastrar endereço. Tente novamente.");
            });
    });

    // Função para buscar o endereço automaticamente pelo CEP
    document.getElementById("cep").addEventListener("blur", function () {
        const cep = this.value.replace(/\D/g, '');

        if (cep.length === 8) {
            fetch(`https://viacep.com.br/ws/${cep}/json/`)
                .then(response => response.json())
                .then(data => {
                    console.log(data); // Verifica a resposta da API
                    if (!data.erro) {
                        document.getElementById("nomeRua").value = data.logradouro || '';
                        document.getElementById("bairro").value = data.bairro || '';
                        document.getElementById("cidade").value = data.localidade || '';
                        document.getElementById("estado").value = data.uf || '';
                    } else {
                        alert("CEP não encontrado.");
                    }
                })
                .catch(error => {
                    console.error("Erro ao buscar CEP:", error);
                });
        }
    });
});
