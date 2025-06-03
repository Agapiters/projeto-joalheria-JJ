document.addEventListener('DOMContentLoaded', () => {
  const usuarioJson = localStorage.getItem('usuarioLogado');

  if (!usuarioJson) {
    alert('Usuário não está logado! Redirecionando para o login...');
    window.location.href = 'perfilLogin.html'; 
    return;
  }

  // Usa o método JSON.parse para converter a string JSON armazenada na variável 'usuarioJson' em um objeto JavaScript.
  // Isso é necessário porque os dados armazenados no localStorage são sempre strings, e para acessar suas propriedades como 'nome' ou 'email',
  // precisamos transformá-los de volta em objeto.
  // O resultado é armazenado na constante 'usuario', que agora pode ser usada para acessar os dados do usuário como um objeto normal.
  const usuario = JSON.parse(usuarioJson);

  document.getElementById('nomeUsuario').textContent = usuario.nomeUsuario || '';
  document.getElementById('email').textContent = usuario.email || '';
  document.getElementById('cpf').textContent = usuario.cpf || '';
  document.getElementById('email').textContent = usuario.telefone || '';
  
  

  // Configura botão logout para limpar o localStorage e voltar para login
  document.getElementById('logoutBtn').addEventListener('click', () => {
    localStorage.removeItem('usuarioLogado');
    alert('Logout efetuado!');
    window.location.href = 'perfilLogin.html';
  });
});