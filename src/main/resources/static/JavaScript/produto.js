document.addEventListener("DOMContentLoaded", () => {
    // Obtém os parâmetros da URL
    const urlParams = new URLSearchParams(window.location.search);
    // Pega o valor do ID
    const produtoId = urlParams.get("id");

    // Se tiver o produto
    if (produtoId) {
        // Realiza o fetch para obter as informações do backend
        fetch(`http://localhost:8080/cadastro_produto/${produtoId}`)
            .then(response => {
                if (!response.ok) {
                    throw new Error("Erro ao buscar o produto: " + response.status);
                }
                return response.json();
            })
            .then(produto => {
                // Atualiza a imagem do produto e o nome
                const img = document.getElementById("produto-img");
                img.src = produto.imgUrl;
                img.alt = produto.nomeProduto;

                // Atualiza o nome do produto
                document.getElementById("produto-nome").textContent = produto.nomeProduto;

                // Atualiza a descrição do produto
                document.getElementById("produto-descricao").textContent = produto.descricaoProduto;

                // Atualiza o preço do produto
                document.getElementById("produto-preco").textContent = `R$ ${produto.preco.toFixed(2)}`;
            })
            .catch(error => {
                console.error("Erro ao carregar produto:", error);
                alert("Não foi possível carregar as informações do produto.");
            });
    } else {
        alert("ID do produto não informado na URL.");
    }
});
