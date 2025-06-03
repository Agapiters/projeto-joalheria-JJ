document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('loginForm');

    form.addEventListener('submit', function(event) {
        event.preventDefault();

        const email = document.getElementById('email').value;
        const senha = document.getElementById('senha').value;

        fetch('http://localhost:8080/api/usuarios/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ email, senha })
        })
        .then(response => {
            if (response.ok) {
                return response.json();
            } else {
                return response.text().then(text => {
                    throw new Error(text || 'Erro na autenticação.');
                });
            }
        })
        .then(data => {
            try {
                const usuario = JSON.parse(data); // Garantir que o JSON retornado seja válido
                alert('Login realizado com sucesso! Bem-vindo, ' + usuario.nome);
                window.location.href = 'perfil.html';
                localStorage.setItem('usuarioLogado', JSON.stringify(usuario));
            } catch (error) {
                alert('Erro ao processar resposta do servidor.');
                console.error('Erro ao analisar JSON:', error);
            }
        })
        .catch(error => {
            alert(error.message);
            console.error('Erro na requisição:', error);
        });
    });
});