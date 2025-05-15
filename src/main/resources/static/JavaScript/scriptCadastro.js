document.addEventListener("DOMContentLoaded", function() {
	const form = document.getElementById("formCadastroUsuario");

	form.addEventListener("submit", function(event) {
		event.preventDefault();

		const nomeUsuario = document.getElementById("nomeUsuario").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
		const cpf = document.getElementById("cpf").value;
		const dtNascimento = document.getElementById("dtNascimento").value;
		const senha = document.getElementById("senha").value;

		fetch('http://localhost:8080/api/usuarios', {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json'
			},
			body: JSON.stringify({
				nomeUsuario,
				email,
				telefone,
				cpf,
				dtNascimento,
				senha,
			})
		})
			.then(response => {
				if (!response.ok) {
					throw new Error('Erro ao cadastrar pessoa');
				}
				return response.json();
			})
			.then(data => {
				localStorage.setItem('idUsuario', data.idUsuario);
				window.location.href = 'endereco.html';
			})
			.catch(error => {
				console.error('Erro no cadastro:', error);
				alert('Falha ao cadastrar usuário. Tente novamente.');
			});
	});
});
