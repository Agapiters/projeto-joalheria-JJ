// Espera o carregamento completo do DOM antes de executar o código
document.addEventListener("DOMContentLoaded", () => {
   
    // Obtém os parâmetros da URL
    const urlParams = new URLSearchParams(window.location.search);
   
    // Pega o valor do parâmetro "id"
    const idProduto = urlParams.get("id");
   
    // Se houver um ID de produto na URL
    if (idProduto) {
       
        // Faz uma requisição ao backend para buscar os dados do produto
        fetch(`http://localhost:8080/cadastroproduto/${idProduto}`)
            .then(response => response.json()) // Converte a resposta para JSON
            .then(produto => {
                // Atualiza a imagem do produto
                document.getElementById("produto-imagem").src = produto.img;
                document.getElementById("produto-imagem").alt = produto.nomeProduto;

                // Atualiza o nome do produto
                document.getElementById("produto-nome").textContent = produto.nomeProduto;
               
                // Atualiza a descrição do produto
                document.getElementById("produto-descricao").textContent = produto.descricao;
               
                // Atualiza o preço do produto formatado
                document.getElementById("produto-preco").textContent = produto.preco;
            })
            // Exibe erro no console se a requisição falhar
            .catch(error => console.error("Erro ao carregar produto:", error));
    }
});